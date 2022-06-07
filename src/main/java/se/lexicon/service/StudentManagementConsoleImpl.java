package se.lexicon.service;

import se.lexicon.data_access.StudentDAO;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    UserInputService scannerService;
    StudentDAO studentDAO;


    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
