package se.lexicon.data_access;


import org.springframework.stereotype.Component;
import se.lexicon.models.Student;

import java.util.List;
import java.util.Optional;
@Component
public interface StudentDAO {

    Student save(Student student);

    Optional<Student> find(int id);
    List<Student> findAll();
    void delete(int id);



}
