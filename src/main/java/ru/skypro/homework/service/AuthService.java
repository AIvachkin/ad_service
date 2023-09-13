package ru.skypro.homework.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.RegisterReq;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.model.Users;
import ru.skypro.homework.repository.UserRepository;

import java.time.Instant;

/**
 * Сервис для работы с аутентификацией пользователей
 *
 */
@Service
public class AuthService {

    private final UserDetailsManager manager;

    private final PasswordEncoder encoder;
    private final UserRepository userRepository;

    public AuthService(UserDetailsManager manager, UserRepository userRepository) {
        this.manager = manager;
        this.userRepository = userRepository;
        this.encoder = new BCryptPasswordEncoder();
    }

    /**
     * Метод для аутентификации пользователя
     * @param userName логин пользователя
     * @param password пароль пользователя
     * @return результат выполнения (true или false)
     */
    public boolean login(String userName, String password) {
        if (!manager.userExists(userName)) {
            return false;
        }
        UserDetails userDetails = manager.loadUserByUsername(userName);
        String encryptedPassword = userDetails.getPassword();
        String encryptedPasswordWithoutEncryptionType = encryptedPassword.substring(8);
        return encoder.matches(password, encryptedPasswordWithoutEncryptionType);
    }

    /**
     * Метод для регистрации пользователя
     * @param registerReq ДТО с регистрационными данными пользователя
     * @param role роль пользователя
     * @return результат выполнения (true или false)
     */
    public boolean register(RegisterReq registerReq, Role role) {
        if (manager.userExists(registerReq.getUsername())) {
            return false;
        }
        manager.createUser(
                User.withDefaultPasswordEncoder()
                        .password(registerReq.getPassword())
                        .username(registerReq.getUsername())
                        .roles(role.name())
                        .build()
        );
        Users user = userRepository.findByEmail(registerReq.getUsername());
        user.setFirstName(registerReq.getFirstName());
        user.setLastName(registerReq.getLastName());
        user.setPhone(registerReq.getPhone());
        user.setRegDate(Instant.now());
        userRepository.save(user);
        return true;
    }
}
