package lab4_backend.persistence.service;

import lab4_backend.persistence.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    public String generateToken(User userDetails);
    public String extractUserName(String token);
    public boolean isTokenValid(String token, UserDetails userDetails);
}
