package exceptions;

public class Warrior extends Character {
    protected static final String WARRIOR_WAY = " like a bad boy.";
    public Warrior (String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(this.getName()+": My name will go down in history!");
    }

    @Override
    public void attack (String weapon) throws WeaponException {
        if (weapon.equals("hammer") || weapon.equals("sword")) {
            super.attack(weapon);
            System.out.println(this.getName()+": I'll crush you with my "+weapon+"!");
        }
        else 
            throw new WeaponException(this.getName()+": A "+weapon+"?? What should I do with this?!");
    }

    @Override
    public void moveRight() {
        super.moveRight();
        System.out.println(WARRIOR_WAY);
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println(WARRIOR_WAY);
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println(WARRIOR_WAY);
    }

    @Override
    public void moveBack() {
        super.moveBack();
        System.out.println(WARRIOR_WAY);
    }
}