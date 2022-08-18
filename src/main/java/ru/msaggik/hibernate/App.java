package ru.msaggik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.msaggik.hibernate.model.Person;

public class App {
    public static void main( String[] args ) {
        // подключение файла конфигурации hibernate.properties и класса Person
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
        // создание сессии из configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // сессия
        Session session = sessionFactory.getCurrentSession();

        try {
            // начало транзакции
            session.beginTransaction();
            // поиск в БД строки с первичным ключом равным 1
            Person person = session.get(Person.class, 1);
            // манипуляция с данными пользователя имеющего первичный ключ 1
            System.out.println(person.getName());
            System.out.println(person.getAge());
            // закрытие транзакции
            session.getTransaction().commit();
        } finally {
            // закрытие сессии
            sessionFactory.close();
        }
    }
}
