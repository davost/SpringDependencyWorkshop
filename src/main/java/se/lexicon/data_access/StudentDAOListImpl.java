package se.lexicon.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.models.Student;

import java.util.List;

@Component
public interface StudentDAOListImpl {
    List<Student> students = null;


}
