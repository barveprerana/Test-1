package study;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class Countries
{
    private TreeMap<String, ArrayList<String>> countries = new TreeMap<>();
    public void listingCountry(String countryName, ArrayList<String> state){
        countries.put(countryName, state);
    }

    public ArrayList<String> getCountry(String countryName){
        for (Map.Entry<String, ArrayList<String>>
                entry : countries.entrySet()){
            if(entry.getKey().equals(countryName)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void listCountryBefore(String countryName){
        for(Map.Entry<String, ArrayList<String>> entry : countries.entrySet()){

            if(entry.getKey().equals(countryName))
                break;
            System.out.println("Country = "+ entry.getKey() + ", States = " + entry.getValue());
        }
    }

    public void listCountryAfter(String countryName){
        boolean flag = false;
        for(Map.Entry<String, ArrayList<String>> entry : countries.entrySet()){

            if(flag)
                System.out.println("Country = "+ entry.getKey() + ", States = " + entry.getValue());
            if(entry.getKey().equals(countryName))
                flag = true;
        }
    }

    public static void main(String[] args) {

        ArrayList<String> indiaStates = new ArrayList<>();
        indiaStates.add("Maharashtra");
        indiaStates.add("Gujrat");
        indiaStates.add("Odisha");
        indiaStates.add("Kashmir");
        ArrayList<String> USStates = new ArrayList<>();
        USStates.add("California");
        USStates.add("Hawaii");
        USStates.add("Texas");
        USStates.add("Alaska");
        Countries countries = new Countries();
        countries.listingCountry("India", indiaStates);
        countries.listingCountry("USA", USStates);
        System.out.println(countries.getCountry("India"));
        countries.listCountryAfter("India");
    }

}
