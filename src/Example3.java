public class Example3 {
    public static void main ( String [] args ) {
        Character warrior = new Warrior ("Jean-Luc");
        Character mage = new Mage ("Robert");

        warrior.moveBack();
        warrior.moveForward();
        warrior.moveLeft();
        warrior.moveRight();
        mage.moveBack();
        mage.moveForward();
        mage.moveLeft();
        mage.moveRight();

        warrior.unsheathe();
        mage.unsheathe();
    }
}
