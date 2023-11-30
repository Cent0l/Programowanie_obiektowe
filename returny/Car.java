public record Car(String brand,String model,double fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice,double distance)
    {
        return ((distance)/(fuelConsumptionPer100km)*fuelPrice);
    }
}
