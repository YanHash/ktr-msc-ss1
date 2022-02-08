public abstract class Character implements Movable {
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit; 

    protected static String RPGClass;


    /**
     * Character constructor
     * 
     * @param name the name of the character
     * @param rpgClass the RPG Class
     */
    public Character(String name, String rpgClass) {
        this.name = name;
        Character.RPGClass = rpgClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    /**
     * Returns the name of a character
     * 
     * @return a String containing the name of a character
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns RPGClass
     * 
     * @return a String containing the RPGClass
     */    
    public String getRPGClass() {
        return Character.RPGClass;
    }

    /**
     * Returns the level of life of a character
     * 
     * @return the life level of a character in an integer
     */
    public int getLife() {
        return this.life;
    } 

    /**
     * Returns the level of agility of a character
     * 
     * @return the agility level of a character in an integer
     */
    public int getAgility() {
        return this.agility;
    }

    /**
     * Returns the level of strength of a character
     * 
     * @return the strength level of a character in an integer
     */    
    public int getStrength() {
        return this.strength;
    }

    /**
     * Returns the level of wit of a character
     * 
     * @return the wit level of a character in an integer
     */   
    public int getWit() {
        return this.wit;
    }

    /**
     * Prints an attack scream
     * 
     * @param arg a String
     */   
    public void attack (String arg) {
        System.out.println(this.getName()+": Rrrrrrrrr....");
    }


    public void moveRight() {
        System.out.print(this.getName()+": moves right");
    }

    public void moveLeft() {
        System.out.print(this.getName()+": moves left");
    }

    public void moveForward() {
        System.out.print(this.getName()+": moves forward");
    }

    public void moveBack() {
        System.out.print(this.getName()+": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.getName()+": unsheathes his weapon.");
    }

}