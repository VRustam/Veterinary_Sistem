package Lahiyeler.Veterinarlar_ucun;

public class Cat extends Animals {

    private String typeOf;
    private String genderOf;

    public Cat(String dateOfBirth, boolean registration, String genderOfCat) {
        super(dateOfBirth, registration);
        this.typeOf = "Cat";
        this.genderOf = genderOfCat;
    }

    @Override
    void toSeeInformationThisPageAnimals() {
        System.out.println(toString() + " Registration : " + isRegistration()+ "Date of Birth" + getDateOfBirth());
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "typeOfCat='" + typeOf + '\'' +
                ", genderOfCat='" + genderOf + '\'' +
                '}';
    }
}
