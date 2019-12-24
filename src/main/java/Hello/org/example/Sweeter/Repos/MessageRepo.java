package Hello.org.example.Sweeter.Repos;

import Hello.org.example.Sweeter.Domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
