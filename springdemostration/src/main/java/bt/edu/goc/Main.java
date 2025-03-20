package bt.edu.goc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Alien obj = new Alien();
        // obj.code();
        // Bean :same like object
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// create a container

        // object is not created here, it just creates a blueprint and object is created
        // in spring.xml file
        Alien obj = (Alien) context.getBean("alien");// creates
        // Alien obj1 = context.getBean("alien", Alien.class);// creates
        // obj.code();
        System.out.println(obj.getAge());

        // // Alien obj1 = (Alien) context.getBean("alien");// creates
        // obj1.code();
    }

}