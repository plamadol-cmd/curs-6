package animals;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements IAnimal {
    private String mouseName;
    @Override
    public String makeSound(){
        return "Kits kits!";
    }

    @Override
    public void setAnimalName(String mouseName) {
        this.mouseName = mouseName;
    }

    @Override
    public String getAnimalName() {
        if(this.mouseName != null && this.mouseName != ""){
            return this.mouseName;
        }
        return null;
    }

}
