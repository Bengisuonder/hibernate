package com.bengisu;

import com.bengisu.model.Student;
import com.bengisu.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
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
    }
}