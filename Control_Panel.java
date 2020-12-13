package Lahiyeler.Veterinarlar_ucun;

public class Control_Panel<T> {
    public void showInformation(T newObjects){
        System.out.println(newObjects);
    }
    public <T extends Customer> void animalsHeOwns(T new_Customer){
       new_Customer.customerAnimalsLists();
    }

    public void veterinaryCustomerLists(T veterinary){
        ((Veterinary)veterinary).customerLineUp();
    }
}
