package hello;

/**
 * Created by elvir_000 on 17.05.2017.
 */
import org.springframework.data.repository.CrudRepository;

import hello.model.Person;


public interface PersonRepository extends CrudRepository<Person, Integer> {

}