package org.defunct.scrud;

import org.testng.annotations.Test;

import java.util.Date;
import org.defunct.scrud.business.SimpleEntity;
import org.defunct.scrud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.testng.annotations.BeforeClass;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeClass
    /**
     * Prepare the hibernate database for this application :
     *  - Create the database schema from the hibernate mapping
     *  - Apply the database schema to the database
     * Note : this won't write the schema to a file
     */
    public void exportHibernateSchema(){
        Configuration config = new Configuration().configure();
        SchemaExport exporter = new SchemaExport(config);
        exporter.create(false, true);
    }
    
    @Test
    public void simpleEntityPersist() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        SimpleEntity entity = new SimpleEntity();

        entity.setCreatedDate(new Date());

        session.save(entity);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }
}
