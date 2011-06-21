package org.defunct.scrud;

import java.util.Date;
import org.defunct.scrud.business.SimpleEntity;
import org.defunct.scrud.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        SimpleEntity entity = new SimpleEntity();
        entity.setCreatedDate(new Date());
        session.save(entity);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }
}
