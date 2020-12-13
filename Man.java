package Lahiyeler.Veterinarlar_ucun;

abstract public class Man {
    private String name;
    private String passport;

    public Man(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }


    abstract void introduceYourSelf();



    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
