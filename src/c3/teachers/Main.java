package teachers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TeacherFactory teacherFactory = new TeacherFactory();

        // create the object
        ITeacher javaTeacher = teacherFactory.getTeacher("Java");

        // use the object
        System.out.println("Created Java teacher via Factory pattern: \n" + javaTeacher.getHomework() + "\n");

        //use beans
        ITeacher theTeacher = context.getBean("javaTeacher", JavaTeacher.class);
        ITeacher historyTeacher = context.getBean("historyTeacher", ITeacher.class);

        System.out.println("Java teacher and history teacher as Spring beans:");
        System.out.println(theTeacher.getHomework());
        System.out.println(theTeacher.getWisdom());
        System.out.println(historyTeacher.getHomework());

        context.close();
    }
}