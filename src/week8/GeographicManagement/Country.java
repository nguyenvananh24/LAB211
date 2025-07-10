package week8.GeographicManagement;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country() {
    }

    public Country(String code, String name, float area) {
        this.countryCode = code;
        this.countryName = name;
        this.totalArea = area;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public void display() {
        System.out.printf("%-15s%-20s%-20.1f", countryCode, countryName, totalArea);
    }
}
