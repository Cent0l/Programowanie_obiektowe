public class Animal
{
    public String name;

    public Animal() {
    this.name="default";
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override//nadpisanie, rob to trust me
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Animal temp) {
            return this.name.equals(temp.name);
        } else
        {
            return false;
        }
    }
    public void dajGlos()
    {
        System.out.println("odglos");
    }

    }
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }
    public Cat()
    {

    }

    @Override
    public void dajGlos()
    {
        System.out.println("Meow");
    }
}


