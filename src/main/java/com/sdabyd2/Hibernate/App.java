package com.sdabyd2.Hibernate;

import com.sdabyd2.Hibernate.entity.BookEntity;
import com.sdabyd2.Hibernate.entity.CategoryEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.util.List;

public class App {

    private static final SessionFactory sessionFactory;

    // blok static podobny do konstruktora ale z wiekszym priorytetem
    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {
/*
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor("Jan Kowalski");
        bookEntity.setTitle("Programowanie dla dzieci");
        bookEntity.setOnStock(3);
        bookEntity.setCategory("Nauka");
        bookEntity.setPrice(new BigDecimal(33));
        bookEntity.setPublished(2017);
        bookEntity.setPublisher("Nova Media");
        bookEntity.setPageCount(45);
        bookEntity.setIsbn("99921-58-10-7");

        BookEntity bookEntity2 = new BookEntity();
        bookEntity2.setAuthor("Kamil Nowicki");
        bookEntity2.setTitle("Latanie szybowcem");
        bookEntity2.setOnStock(50);
        bookEntity2.setCategory("Awionika");
        bookEntity2.setPrice(new BigDecimal(20));
        bookEntity2.setPublished(2004);
        bookEntity2.setPublisher("Lite Media");
        bookEntity2.setPageCount(105);
        bookEntity2.setIsbn("99921-58-10-9");

        BookEntity bookEntity3 = new BookEntity();
        bookEntity3.setAuthor("Adrian Mach");
        bookEntity3.setTitle("Sklejanie modeli samolotów");
        bookEntity3.setOnStock(99);
        bookEntity3.setCategory("Awionika");
        bookEntity3.setPrice(new BigDecimal(15));
        bookEntity3.setPublished(2010);
        bookEntity3.setPublisher("Lite Media");
        bookEntity3.setPageCount(22);
        bookEntity3.setIsbn("99921-58-10-4");

        BookEntity bookEntity4 = new BookEntity();
        bookEntity4.setAuthor("Maria Korel");
        bookEntity4.setTitle("Java czy Javascript");
        bookEntity4.setOnStock(7);
        bookEntity4.setCategory("Nauka");
        bookEntity4.setPrice(new BigDecimal(50));
        bookEntity4.setPublished(2012);
        bookEntity4.setPublisher("Nova Media");
        bookEntity4.setPageCount(120);
        bookEntity4.setIsbn("99921-58-10-2");

        BookEntity bookEntity5 = new BookEntity();
        bookEntity5.setAuthor("Marcin Nojman");
        bookEntity5.setTitle("Wirtualizacja dla opornych");
        bookEntity5.setOnStock(45);
        bookEntity5.setCategory("Nauka");
        bookEntity5.setPrice(new BigDecimal(70));
        bookEntity5.setPublished(2018);
        bookEntity5.setPublisher("IT Media");
        bookEntity5.setPageCount(200);
        bookEntity5.setIsbn("99921-58-10-1");
*/

        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName("Pprogramowanie");

        CategoryEntity categoryEntity2 = new CategoryEntity();
        categoryEntity2.setName("Medycyna");

        CategoryEntity categoryEntity3 = new CategoryEntity();
        categoryEntity3.setName("Mechanika");

        CategoryEntity categoryEntity4 = new CategoryEntity();
        categoryEntity4.setName("Astronomia");

        CategoryEntity categoryEntity5 = new CategoryEntity();
        categoryEntity5.setName("Budownictwo");

        Transaction tr = null;
        Session session = getSession();

        tr = session.beginTransaction();
        //session.save(bookEntity);
        //session.save(bookEntity2);
        //session.save(bookEntity3);
        //session.save(bookEntity4);
        //session.save(bookEntity5);
        session.save(categoryEntity);
        session.save(categoryEntity2);
        session.save(categoryEntity3);
        session.save(categoryEntity4);
        session.save(categoryEntity5);
        tr.commit();

        tr = session.beginTransaction();
        List<BookEntity> bookEntities = session.createCriteria(BookEntity.class).list();
        System.out.println(bookEntities);

        /*
        List<BookEntity> bookEntityList = session.createQuery("FROM "+BookEntity.class.getName()).list();
        System.out.println(bookEntityList);

        for (BookEntity data: bookEntityList){
            System.out.println("Autor: "+data.getAuthor());
            System.out.println("Tytul: "+data.getTitle()+"\n");
        }
        */

        List<CategoryEntity> categoryEntities = session.createQuery("FROM "+CategoryEntity.class.getName()).list();
        System.out.println(categoryEntities);

        for (CategoryEntity data: categoryEntities){
            System.out.println("Id: "+data.getId());
            System.out.println("Category: "+data.getName()+"\n");
        }






    }
}
