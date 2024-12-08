//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car=new Car("Mercedes", "7 series", 2014, 4);
        Vehicle truck=new Truck("Mitsubishi", "Tata", 2012, 2.5);

        car.displayDetails();
        truck.displayDetails();

        int currentYear=2024;
        System.out.println("Car Age: " + car.computeAge(currentYear) + " years");
        System.out.println("Truck Age: " + truck.computeAge(currentYear) + " years");
    }
}