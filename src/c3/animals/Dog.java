package animals;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements IAnimal {
    private String dogName;

    @Override
    public String makeSound(){
        return "Woof!";
    }

    @Override
    public void setAnimalName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String getAnimalName() {
        if(this.dogName != null && this.dogName != ""){
            return this.dogName;
        }
        return null;
    }


}
