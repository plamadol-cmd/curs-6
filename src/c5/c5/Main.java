package c5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before context initialisation: ");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\n Before getBean calls: ");

        System.out.println("\n First bean is created: ");
        Task taskPrototype0 = context.getBean("task", Task.class);
        taskPrototype0.run();

        System.out.println("\n Second bean is created:");
        Task taskPrototype1 = context.getBean("task", Task.class);
        taskPrototype1.run();

        System.out.println("\n Third bean is created:");
        Task taskSingleton = context.getBean("task", Task.class);
        taskSingleton.run();

        System.out.println("\n MyAspect bean is created:");
        MyAspect aspectBean = context.getBean("myAspect", MyAspect.class);

        System.out.println("\n After getBean calls: ");
        System.out.println("\n Current number of tasks: " + Task.numberOfTasks);

        context.close();
        System.out.println("Context is closed.");
        System.out.println("\n Current number of tasks: " + Task.numberOfTasks);

    }
}