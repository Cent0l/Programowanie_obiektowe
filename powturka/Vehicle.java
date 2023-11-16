//Stwórz klasę bazową o nazwie Vehicle z polami: brand i model. Klasa ta powinna posiadać konstruktor przyjmujący oba te parametry. Następnie stwórz klasę potomną o nazwie Car, która dziedziczy po klasie Vehicle. Klasa Car powinna posiadać dodatkowe pole numberOfDoors. Stwórz konstruktor dla klasy Car, który przyjmuje wszystkie trzy parametry i korzysta z konstruktora klasy bazowej. Stwórz przypadek testowy.
public class Vehicle
{
    public String brand;
    public String model;
    public Vehicle(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
    }
}
class Car extends Vehicle
{
    int numberOfDoors;
    public Car(String brand, String model, int numberOfDoors)
    {
        super(brand,model);
        this.numberOfDoors=numberOfDoors;


    }
}
