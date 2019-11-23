package day35.homework;

class countries {
    public String countryname;
    public String countrycapital;
    public int population;
    public int howmanycities;
    public boolean isSafe;

    public countries(String name, int pop ,int howmany) {
        countryname = name;
        population = pop;
        howmanycities= howmany;

    }

    public countries(String capital) {
        countrycapital = capital;
    }

    public countries(int pop) {
        population = pop;
    }

    public countries(String name, String capital, int pop, boolean safe ,int howmany) {
        countryname = name;
        population = pop;
        countrycapital = capital;
        isSafe = safe;
        howmanycities=howmany;
    }

    public countries(boolean safe) {
        isSafe = safe;

    }


    public String getToKnowCountries() {
        String name = "country name  is " + countryname+"\n";
        String capital = "capital is "+ countrycapital+"\n";
        String pop = "population is " + population+"\n";
        String safe = " it is safe country ---->" + isSafe+"\n";
        String howmany = "there are "+howmanycities+" cities"+"\n";
        return name+ capital+pop+safe+howmany;

    }
}



public class Hw2 {
    public static void main(String[] args) {
       countries country = new countries("Turkey", "Ankara", 500, true, 81);
        System.out.println(country.getToKnowCountries());

       }

    }


