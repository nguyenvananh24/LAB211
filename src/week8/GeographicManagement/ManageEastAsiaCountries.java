package week8.GeographicManagement;

import java.util.*;

public class ManageEastAsiaCountries {
    private List<EastAsiaCountries> countryList = new ArrayList<>();

    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        if (countryList.size() >= 11) {
            throw new Exception("Cannot add more than 11 countries.");
        }
        countryList.add(country);
    }

    public List<EastAsiaCountries> getRecentlyEnteredInformation() throws Exception {
        if (countryList.isEmpty())
            throw new Exception("No countries entered.");
        return new ArrayList<>(countryList);
    }

    public List<EastAsiaCountries> searchInformationByName(String name) throws Exception {
        List<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries c : countryList) {
            if (c.getCountryName().equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        if (result.isEmpty())
            throw new Exception("No country found with that name.");
        return result;
    }

    public List<EastAsiaCountries> sortInformationByAscendingOrder() throws Exception {
        List<EastAsiaCountries> sortedList = new ArrayList<>(countryList);
        sortedList.sort(Comparator.comparing(Country::getCountryName));
        return sortedList;
    }
}
