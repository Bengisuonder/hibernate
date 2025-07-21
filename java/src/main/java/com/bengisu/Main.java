package com.bengisu;

import com.bengisu.dao.UserDAO;
import com.bengisu.model.User;
import com.bengisu.service.StudentService;
import com.bengisu.model.Student;
import com.bengisu.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        /*
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try
        {
            transaction = session.beginTransaction();

            //create
            Student student = new Student("Bengisu", "Önder");
            session.persist(student);

            //read
            Student readStudent = session.get(Student.class, student.getId());
            System.out.println("Okunan Öğrenci: " + readStudent.getName() + " " + readStudent.getLastName());

            //update
            readStudent.setName("Yeni İsim");
            session.update(readStudent);

            //delete
            session.delete(readStudent);

            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        finally
        {
            // CLOSE SESSION
            if (session != null) session.close();
        }
         */
        /*
        StudentService service = new StudentService();

        // CREATE
        service.registerNewStudent("Bengisu", "Önder");

        // READ
        Student student = service.getStudentById(1);
        System.out.println("Okunan öğrenci: " + student.getName() + " " + student.getLastName());

        // UPDATE
        service.updateStudentName(1, "Yeni İsim");

        // DELETE
        service.deleteStudent(1);
         */
        UserDAO userDAO = new UserDAO();

        // CREATE
        User newUser = new User("Bengisu", "Önder");
        userDAO.createUser(newUser);

        // READ
        User fetchedUser = userDAO.getUserById(newUser.getId());

        // UPDATE
        fetchedUser.setName("Yeni Ad");
        fetchedUser.setLastName("Yeni Soyad");
        userDAO.updateUser(fetchedUser);

        // DELETE
        userDAO.deleteUser(fetchedUser);
    }
}