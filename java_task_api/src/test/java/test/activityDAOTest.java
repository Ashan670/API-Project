package test;

import java.sql.Timestamp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.project.util.HibernateUtil;
import com.payable.task3.dao.t_activityDao;
import com.payable.task3.models.t_activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class activityDAOTest {
    private SessionFactory sessionFactory;
    private t_activityDao tactivityDao;

    @Before
    public void setUp() {
        sessionFactory = new Configuration().configure("hibernate_ut.cfg.xml").buildSessionFactory();
        tactivityDao = new t_activityDao(sessionFactory);
    }

    @After
    public void tearDown() {
        
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
    @Test
    public void testAddActivity() {
         t_activityDao activityDao = new t_activityDao(HibernateUtil.getSessionFactory());
        
         t_activity activity = new t_activity();
        activity.setPro_id("projectId");
        activity.setCat_id("categoryId");
        activity.setAct_name("Sample Activity");
        activity.setStatus("Active");
        activity.setCreated_at(new Timestamp(System.currentTimeMillis()));
        activity.setCreated_by("Admin");
        activity.setUpdated_at(null); 
        activity.setUpdated_by(null); 
        activityDao.addActivity(activity);

        
    }
}
