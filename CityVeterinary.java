package Lahiyeler.Veterinarlar_ucun;

import java.util.ArrayList;

public class CityVeterinary {
    private String city;
    private int allVeterinaryInCity;
    private ArrayList<Veterinary> cityVeterinary;

    public CityVeterinary(String city) {
        this.city = city;
        cityVeterinary = new ArrayList<>();
        allVeterinaryInCity = 0;
    }

    public void addCityVeterinary(Veterinary veterinary){
        allVeterinaryInCity++;
        cityVeterinary.add(veterinary);
    }
    public void setAllVeterinaryInCitySearch(){
        System.out.println("Toplam Veterinar sayi: " + cityVeterinary.size());
    }
}
