package animals;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements IAnimal {
    private String catName;
    @Override
    public String makeSound(){
        return "Meow!";
    }

    @Override
    public void setAnimalName(String catName) {
        this.catName = catName;
    }

    @Override
    public String getAnimalName() {
        if(this.catName != null && this.catName != ""){
            return this.catName;
        }
        return null;
    }

}
