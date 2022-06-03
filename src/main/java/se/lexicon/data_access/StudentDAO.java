package se.lexicon.data_access;


import se.lexicon.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {

    Student save(Student student);

    Optional<Student> find(int id);
    List<Student> findAll();
    void delete(int id);



}
