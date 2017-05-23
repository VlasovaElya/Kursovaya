package hello;
import org.springframework.data.repository.CrudRepository;
import hello.model.Sick;
/**
 * Created by elvir_000 on 19.05.2017.
 */
public interface SickRepository extends CrudRepository<Sick, Integer> {

}