package Lahiyeler.Veterinarlar_ucun;

abstract public class Animals {
    private String dateOfBirth;
    private boolean registration;

    public Animals(String dateOfBirth, boolean registration) {
        this.dateOfBirth = dateOfBirth;
        this.registration = registration;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    abstract void toSeeInformationThisPageAnimals();

    @Override
    public String toString() {
        return "Animals{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", registration=" + registration +
                '}';
    }
}
