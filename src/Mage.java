public class Mage extends Character {
    protected static final String MAGE_WAY = " furtively.";
    
    public Mage (String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.getName()+": May the gods be with me.");
    }

    @Override
    public void attack (String weapon) {
        if (weapon.equals("magic") || weapon.equals("wand")) {
            super.attack(weapon);
            System.out.println(this.getName()+": Feel the power of my "+weapon+"!");
        }
        else 
            System.out.println(this.getName()+": I don't need this stupid"+weapon+"! Don't misjudge my power!");
    }

    @Override
    public void moveRight() {
        super.moveRight();
        System.out.println(MAGE_WAY);
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println(MAGE_WAY);
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println(MAGE_WAY);
    }

    @Override
    public void moveBack() {
        super.moveBack();
        System.out.println(MAGE_WAY);
    }
}
