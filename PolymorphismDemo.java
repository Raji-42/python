//PoiymorphismDemo
//25-9-23
//rajeswari
import java.io.*;
class Animal
{
    public void AnimalSound()
    {
        System.out.println("An Animal can make Sounds ");
    }
}
class Cow extends Animal
{
    public void AnimalSound()
    {
        System.out.println("A cow sounds-maa");
    }
}
class Cat extends Animal
{
    public void AnimalSound()
    {
        System.out.println("A cat sounds-meow");
    }
}
public class PolymorphismDemo
{
    public static void main(String args[])
    {
        Animal an = new Animal();
        Animal MyCow = new Cow();
        Animal MyCat = new Cat();
        an.AnimalSound();
        MyCow.AnimalSound();
        MyCat.AnimalSound();
    }
}
