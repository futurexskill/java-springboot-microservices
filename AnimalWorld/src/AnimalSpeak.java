public class AnimalSpeak {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSpeak() {
        this.animal.speak();
    }
}
