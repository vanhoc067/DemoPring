/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvh.demopring;

import com.dvh.pojo.Category;
import com.dvh.pojo.Product;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author admin
 */
public class HibernateUtils {
    private static final SessionFactory factory;
    
    static {
        Configuration conf = new Configuration();
        Properties props = new Properties();
        props.setProperty(Environment.DIALECT, "...");
        props.setProperty(Environment.DRIVER, "...");
        props.setProperty(Environment.URL, "...");
        props.setProperty(Environment.USER, "root");
        props.setProperty(Environment.PASS, "Admin@123");
        props.setProperty(Environment.SHOW_SQL, "true");
        conf.setProperties (props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties);
        
        factory = conf.buildSessionFactory(registry);
                
                
    }

    /**
     * @return the factory
     */
    public static SessionFactory getFactory() {
        return factory;
    }
}
