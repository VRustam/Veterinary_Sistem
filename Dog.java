package Lahiyeler.Veterinarlar_ucun;

public class Dog extends Animals{
    private int vaccine;


    private String typeOf;
    private String genderOf;




    public Dog(String dateOfBirth, boolean registration ,int vaccine,String genderOfDog) {
        super(dateOfBirth, registration);
        this.vaccine = vaccine;
        this.typeOf = "Dog";
        this.genderOf = genderOfDog;
    }



    public int getVaccine() {
        return vaccine;
    }

    public void setVaccine(int vaccine) {
        this.vaccine = vaccine;
    }
    @Override
    void toSeeInformationThisPageAnimals() {
        System.out.println(toString() + " " + super.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "vaccine=" + vaccine +
                ", typeOfDog='" + typeOf + '\'' +
                ", genderOfDog='" + genderOf + '\'' +
                '}';
    }
}
