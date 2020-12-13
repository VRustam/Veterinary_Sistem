package Lahiyeler.Veterinarlar_ucun;

import java.util.ArrayList;

public class Customer extends Man{

    private String address;
    private ArrayList<Animals> customerAnimals;



    public Customer(String name, String passport,String address) {
        super(name, passport);
        this.address = address;
        customerAnimals = new ArrayList<>();
    }

   public void  addCustomerAnimals(Animals animals){
        customerAnimals.add(animals);
       System.out.println(animals + " " + getName() + " Musteri Elave olundu");
   }

   public void customerAnimalsLists(){
        for(Animals a:customerAnimals){
            System.out.println(a);
        }
   }

    @Override
    void introduceYourSelf(){
        System.out.println(this.toString() + " Men bir Musteriyem : " );
    }


    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "address='" + address + '\'' +
                '}';
    }
}
