public class AnimalBehaviour {

    public static void main(String[] args) {
        AnimalSpeak xyz = new AnimalSpeak();
        Animal animal = new Cat();
        xyz.setAnimal(animal);
        xyz.makeAnimalSpeak();
    }

}
