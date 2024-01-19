package lab4_backend.persistence.service;

import lab4_backend.persistence.model.User;
import lombok.NonNull;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService {
    public User create(User user);
    public Optional<User> findByLogin(String login);
    public UserDetailsService userDetailsService();
    public User getCurrentUser();
}
