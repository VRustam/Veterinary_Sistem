package Lahiyeler.Veterinarlar_ucun;

public class Main {
    public static void main(String[] args) {

        creatingFirstObjects();

    }



    private static void creatingFirstObjects() {
        Cat cat = new Cat("01-01-2020", true, "Britain Cat");
        Cat cat1 = new Cat("01-02-2020", false, "Britain Cat1");
        Cat cat2 = new Cat("01-03-2020", true, "Britain Cat2");


        Dog dog = new Dog("02-05-2020",true,10,"Golden");



        Customer customer1 = new Customer("Aydin", "AA122345","baku");
        Customer customer2 = new Customer("Aydin22", "AA1223422225","baku");
        customer1.addCustomerAnimals(cat);
        customer2.addCustomerAnimals(dog);


        Veterinary veterinary = new Veterinary("Ayse", "aa115", "Baki", 1);
        veterinary.addVeterinaryCustomer(customer1);
        veterinary.addVeterinaryCustomer(customer2);
        Veterinary veterinary1 = new Veterinary("Ayse1", "aa115", "Baki", 2);

        Veterinary veterinary2 = new Veterinary("Ayse2", "aa115", "Baki", 3);

        veterinary.customerLineUp();

        CityVeterinary baku = new CityVeterinary("Baki");
        baku.addCityVeterinary(veterinary);
        baku.setAllVeterinaryInCitySearch();

        System.out.println("Control Panel");
        Control_Panel<Animals> animalsControlPanel = new Control_Panel<>();
        animalsControlPanel.showInformation(cat);

        Control_Panel<Customer> customerControlPanel = new Control_Panel<>();
        customerControlPanel.showInformation(customer1);
        customerControlPanel.animalsHeOwns(customer1);
    }



}
