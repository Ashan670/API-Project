package com.payable.task3.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import com.payable.task3.models.t_activity;
import com.example.project.util.HibernateUtil;

public class t_activityDao {
    private final SessionFactory sessionFactory;
//session
    public t_activityDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addActivity(t_activity activity) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(activity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
