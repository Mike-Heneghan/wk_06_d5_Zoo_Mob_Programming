import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private String name;
    private HashMap<Species, Integer> speciesStock;

    public Zoo(String name){
        this.name = name;
        this.speciesStock = new HashMap<>();
    }

    public Zoo(String name, HashMap<Species, Integer> speciesStock){
        this.name = name;
        this.speciesStock = speciesStock;

    }

    public String getName() {
        return name;
    }

    public int getNumberOfDistinctSpecies(){
        return speciesStock.size();
    }

    public void addAmountOfAnimals(Species species, Integer amount){
        Integer amountOfAnimalsBefore =  this.speciesStock.get(species);
        if (amountOfAnimalsBefore == null) {
            amountOfAnimalsBefore = 0;
        }
        this.speciesStock.put(species, amountOfAnimalsBefore +  amount );
    }


    public void getOneOfEach(){


        for ( Species s : Species.values()){
            addAmountOfAnimals(s, 1);
        }

    }
}
