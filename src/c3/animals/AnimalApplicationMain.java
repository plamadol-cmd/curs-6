package animals;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApplicationMain {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal theDog = context.getBean("myDog", IAnimal.class);
        IAnimal theCat = context.getBean("myCat", IAnimal.class);

        theDog.setAnimalName("Archie");
        theCat.setAnimalName("");

        System.out.println(theDog);
        System.out.println(theDog.makeSound());
        System.out.println(theDog.getAnimalName());

        System.out.println(theCat);
        System.out.println(theCat.makeSound());
        System.out.println(theCat.getAnimalName());
    }
}