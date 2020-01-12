package Hello.org.example.Sweeter.Repos;


import Hello.org.example.Sweeter.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
