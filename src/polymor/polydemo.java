package polymor;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
class Animal{
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Animal
    {
        void eat()
            {
                System.out.println("eating bread...");
            }
    }
class Cat extends Animal
    {
        void eat()
            {
                System.out.println("eating rat...");
            }
    }
class Lion extends Animal
    {
        void eat()
        {
            System.out.println("eating meat...");
        }
    }
class polydemo
{
    public static void main(String[] args)
    {
        Animal a=new Dog();
        Animal a1=new Cat();
        Animal a2=new Lion();
        a.eat();
        a1.eat();
        a2.eat();
    }
}