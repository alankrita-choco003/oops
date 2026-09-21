
class  Animal
{
    void sound()
    {
        System.out.println("they make sound inherit");
    }
    void eat()
    {
         System.out.println("they eats for living");
    }
}

class dog extends Animal
{
    void bark()
    {
         System.out.println("dog barks actual");
    }
    void eat()
    {
         System.out.println("dogs eat meat");
    }

}
public class inheri {
    public static void main (String args[])
    {
        Animal ob = new dog();
        ob.sound();

        ob.eat();
        }
}
