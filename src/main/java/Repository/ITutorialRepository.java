package Repository;

import com.model.Tutorial;
import org.springframework.data.repository.CrudRepository;

public interface ITutorialRepository  extends CrudRepository<Tutorial, Integer> {
}
