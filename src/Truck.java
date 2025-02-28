public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String brand, String model, int year, double payloadCapacity) {
        super(brand, model, year);
        this.payloadCapacity = payloadCapacity;
    }
  
    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Brand: "+ getBrand());
        System.out.println("Model: "+ getModel());
        System.out.println("Year: "+ getYear());
        System.out.println("Payload Capacity: "+ payloadCapacity+ " tons");
    }

}
