package Hello.org.example.Sweeter.Repos;


import Hello.org.example.Sweeter.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {
    User findByUsername(String username);
}
