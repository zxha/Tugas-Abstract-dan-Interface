package Senjata;

/**
 *
 * @author ASUS
 */
public class TestAbstract {
    public static void main(String[] args) {
        Weapon weapon = new Knife();

        Weapon knife = new Knife();
        Weapon gun = new Gun(10);

        knife.Attack();
        gun.Attack();
        gun.Attack();

        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.Attack();
        
        gun2.Attack();
        gun2.Attack();

    }
}
