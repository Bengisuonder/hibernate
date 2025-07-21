package com.bengisu.dao;

import com.bengisu.model.Student;
import com.bengisu.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO
{
    public void save(Student student)
    {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Student kaydedilirken hata oluştu.", e);
        }
    }

    public Student findById(long id)
    {
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            return session.get(Student.class, id);
        }
    }

    public void update(Student student)
    {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.merge(student); // Hibernate 6 önerisi
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Student güncellenirken hata oluştu.", e);
        }
    }

    public void delete(Student student)
    {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.remove(student);
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Student silinirken hata oluştu.", e);
        }
    }
}

