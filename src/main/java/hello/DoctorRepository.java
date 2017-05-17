package hello;
import org.springframework.data.repository.CrudRepository;
import hello.model.Doctor;

/**
 * Created by elvir_000 on 17.05.2017.
 */
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}