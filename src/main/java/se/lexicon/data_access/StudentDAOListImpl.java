package se.lexicon.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.models.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentDAOListImpl implements StudentDAO {
    Collection<Student> storage;

    public StudentDAOListImpl() {
        storage = new ArrayList<>();
    }

    // todo: define a list of student then implements all the methods

    @Override
    public Student save(Student student) {
        if (student == null) throw new IllegalArgumentException("Student is null");
        student.setName(student.getName());
        storage.add(student);
        return student;
    }

    @Override
    public Optional<Student> find(int id) {
        if (id == 0) throw new IllegalArgumentException("Id is null");
        return storage.stream().filter(student -> student.getId() == id).findFirst();
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public void delete(int id) {
        Optional<Student> result = find(id);
        if(!result.isPresent()) throw new IllegalArgumentException("Id not fond");
        else storage.remove(result.get());
    }
}
