package inheritanceatask;

public class AnimalMain {

	public static void main(String[] args) {
		Animals mammal = new Mammal("Lion", "Savannah", true);
        mammal.displayHabitat();
        ((Mammal) mammal).displayMammalInfo();

        Animals bird = new Bird("Eagle", "Forest", true);
        bird.displayHabitat();
        ((Bird) bird).displayBirdInfo();

        Animals reptile = new Reptile("Snake", "Desert", true);
        reptile.displayHabitat();
        ((Reptile) reptile).displayReptileInfo();

	}

}
