package week8.GeographicManagement;

public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String code, String name, float area, String terrain) {
        super(code, name, area);    
        this.countryTerrain = terrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%-20s\n", countryTerrain);
    }
}

