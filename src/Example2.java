public class Example2 {
    public static void main ( String [] args ) {
        Character warrior = new Warrior ("Jean-Luc");
        Character mage = new Mage ("Robert");warrior.attack ("hammer");
        mage.attack ("magic");
        warrior.attack("hammer");
    }
}
