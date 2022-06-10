import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class Country{
	public TreeMap<String, ArrayList<String>> countries = new TreeMap<>();
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

}

public class Countries {
    
    public static void main(String[] args) {

        ArrayList<String> indiaStates = new ArrayList<>();
        indiaStates.add("Madhya Pradesh");
        indiaStates.add("Andhra Pradesh");
        indiaStates.add("Uttar Pradesh");
        indiaStates.add("Rajasthan");
        ArrayList<String> USStates = new ArrayList<>();
        USStates.add("Ohio");
        USStates.add("California");
        USStates.add("Texas");
        USStates.add("Florida");
        Countries countries = new Countries();
        countries.listingCountry("India", indiaStates);
        countries.listingCountry("USA", USStates);
        System.out.println(countries.getCountry("India"));
        countries.listCountryAfter("India");
    }

	
}