package bsnt.np.collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapOperations{
    public Map<String, String> listOfCountryWithCapitals() {
        Map<String, String> country = new HashMap<>();
        country.put("Afghanistan", "Kabul");
        country.put("Albania", "Tirana");
        country.put("Algeria", "Algiers");
        country.put("Andorra","Andorra la Vella");
        country.put("Angola","Luanda");
        country.put("Antigua and Barbuda", "Saint John's");
        country.put("Argentina","Buenos Aires");
        country.put("Armenia","Yerevan");
        country.put("Australia","Canberra");
        country.put("Austria","Vienna");
        country.put("Azerbaijan","Baku");
        country.put("Bahamas","Nassau");
        country.put("Bahrain","Manama");
        country.put("Bangladesh","Dhaka");
        country.put("Barbados","Bridgetown");
        country.put("Belarus","Minsk");
        country.put("Belgium","Brussels");
        country.put("Belize","Belmopan");
        country.put("Benin","Porto-Novo");
        country.put("Bhutan","Thimphu");
        country.put("Bolivia","Sucre, La Paz");
        country.put("Brazil","Brasilia");
        country.put("Cambodia","Phenom Pen");
        country.put("Cameroon","Yaounde");
        country.put("Canada","Ottawa");

        return country;
    }

    public  void display(){
        for(Map.Entry<String,String> entry : listOfCountryWithCapitals().entrySet()){
            System.out.println("Country: "+ entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}