package inheritanceatask;

public class Animals {
	protected String name;
    protected String habitat;

    
    public Animals(String name, String habitat) {
		super();
		this.name = name;
		this.habitat = habitat;
	}


	public void displayHabitat() {
        System.out.println("Habitat: " + habitat);
    }

}

class Mammal extends Animals {
 private boolean isWarmBlooded;

 public Mammal(String name, String habitat, boolean isWarmBlooded) {
     super(name, habitat);
     this.isWarmBlooded = isWarmBlooded;
 }

 public void displayMammalInfo() {
     System.out.println("Is Warm Blooded: " + isWarmBlooded);
 }
}
class Bird extends Animals {
    private boolean canFly;

    public Bird(String name, String habitat, boolean canFly) {
        super(name, habitat);
        this.canFly = canFly;
    }

    public void displayBirdInfo() {
        System.out.println("Can Fly: " + canFly);
    }
}
class Reptile extends Animals {
    private boolean isColdBlooded;

    public Reptile(String name, String habitat, boolean isColdBlooded) {
        super(name, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    public void displayReptileInfo() {
        System.out.println("Is Cold Blooded: " + isColdBlooded);
    }
}

