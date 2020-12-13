package Lahiyeler.Veterinarlar_ucun;

import java.util.ArrayList;

public class Veterinary extends  Man {


    private String school;
    private int operationTime;

    private ArrayList<Customer> veterinaryCustomer;
    private int customerNumber;

    public Veterinary(String name, String passport, String school, int operationTime) {
        super(name, passport);
        this.school = school;
        this.operationTime = operationTime;
        veterinaryCustomer = new ArrayList<>();
        customerNumber = 0;
    }

    public void addVeterinaryCustomer(Customer customer){

        veterinaryCustomer.add(customer);
        customerNumber++;
        System.out.println(customer + " " + getName() + " yeni musteri artirildi");

    }

    public void customerLineUp(){
        for(Customer c : veterinaryCustomer){
            c.introduceYourSelf();
        }
    }

    @Override
    void introduceYourSelf(){
        System.out.println(toString() + "Men bir Veterinaram");
    }
    @Override
    public String toString() {
        return super.toString() + "Veterinary{" +
                "school='" + school + '\'' +
                ", operationTime=" + operationTime +
                '}';
    }
}
