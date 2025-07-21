package com.bengisu.service;

import com.bengisu.dao.StudentDAO;
import com.bengisu.model.Student;

public class StudentService
{
    private final StudentDAO studentDAO = new StudentDAO();

    public void registerNewStudent(String name, String lastName)
    {
        Student student = new Student(name, lastName);
        studentDAO.save(student);
    }

    public Student getStudentById(long id)
    {
        return studentDAO.findById(id);
    }

    public void updateStudentName(long id, String newName)
    {
        Student student = studentDAO.findById(id);
        if (student != null)
        {
            student.setName(newName);
            studentDAO.update(student);
        }
    }

    public void deleteStudent(long id)
    {
        Student student = studentDAO.findById(id);
        if (student != null)
        {
            studentDAO.delete(student);
        }
    }
}
