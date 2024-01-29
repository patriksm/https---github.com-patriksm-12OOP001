public class Main {
    public static void main (String[] args) {
        System.out.println("Hello");
        Vehicle auto = new Vehicle();
        auto.setBrand("Audi");
        auto.setModel("A6");
        auto.setRegistrationDate("12.01.2024.");
        System.out.println(auto.getBrand());
        System.out.println(auto.getModel());
        System.out.println(auto.getRegistrataionDate());
        System.out.println(auto);
    }
}