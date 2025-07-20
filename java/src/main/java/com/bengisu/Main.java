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

            Student student = new Student("Bengisu", "Önder");
            session.persist(student);
            transaction.commit();
        }
        catch (RuntimeException e)
        {
            throw new RuntimeException(e);
        }
    }
}