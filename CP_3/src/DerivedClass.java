/**
 * Created by Hernan Y.Ke on 2015/11/19.
 */
//default functions test
interface FirstBaseInterface{
    default void display(){
        System.out.println("FirstBaseInterface");
    }
}
interface SecondBaseInterface{
    default void display(){
        System.out.println("SecondBaseInterface");
    }
}
public class DerivedClass implements FirstBaseInterface,SecondBaseInterface {
    public void display(){
        FirstBaseInterface.super.display();
    }

    public static void main(String[] args) {
        new DerivedClass().display();
    }
}
