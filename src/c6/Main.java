package c6;

import lombok.Getter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MyFunctionalInterface methodReference = (value) -> value != null;

        DataClass dataClass = new DataClass(3);
        dataClass.setSize(SheetSize.A3);
        dataClass.setUsageDescription("Drafts");

        System.out.println("DataClass hashcode: " + dataClass.hashCode());
        System.out.println("This class has " + dataClass.getNumberOfFiles() + " files of size " + dataClass.getSize()
                + " that are used as " + dataClass.getUsageDescription());

        GetterClass getterClass = new GetterClass();
        getterClass.setNumberOfBoxes(5);
        getterClass.setUsage("tools");
        System.out.println("Current number of boxes: " + getterClass.getNumberOfBoxes());
        System.out.println("These boxes are used for storing " + getterClass.getUsage());

    }

}