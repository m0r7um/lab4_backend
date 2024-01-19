package lab4_backend.persistence.repository;

import lab4_backend.persistence.model.Point;
import lab4_backend.persistence.model.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByLoginIgnoreCase(String email);
    boolean existsByLogin(String login);
    @NonNull Optional<User> findByLogin(@NonNull String id);
}
