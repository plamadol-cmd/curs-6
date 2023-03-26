package animals;

public class AnimalFactory {

    public IAnimal getAnimal(String animalType){
        if(animalType == null){
            return null;
        }

        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        }

        if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        }

        if(animalType.equalsIgnoreCase("Mouse")){
            return new Mouse();
        }

        return null;
    }

    public IAnimal getAnimaWithName(String animalType, String animalName){
        if(animalType == null || animalName == null){
            return null;
        }

        IAnimal animal = getAnimal(animalType);
        if(animal != null){
            animal.setAnimalName(animalName);
            return animal;
        }

        return null;
    }
}
