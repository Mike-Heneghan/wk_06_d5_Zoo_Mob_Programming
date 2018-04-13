import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ZooTest {
    private Zoo zooEmpty;
    private Zoo zooFull;

    @Before
    public void before(){
        zooEmpty = new Zoo("Edinburgh");

        HashMap<Species, Integer> glasgowSpecies = new HashMap<>();
        glasgowSpecies.put(Species.WOLF, 40);

        zooFull = new Zoo("Glasgow", glasgowSpecies );

    }

    @Test
    public void hasName(){
        assertEquals("Edinburgh", zooEmpty.getName());
    }

    @Test
    public void startsWithEmptyStock(){
        assertEquals(0, zooEmpty.getNumberOfDistinctSpecies());
    }

    @Test
    public void startsWithAnAnimal(){
        assertEquals(1, zooFull.getNumberOfDistinctSpecies());
    }

    @Test
    public void canAddAnimalSpecies(){
        zooFull.addAmountOfAnimals(Species.HERON, 120);
        assertEquals(2, zooFull.getNumberOfDistinctSpecies());
    }

    @Test
    public void initOneOfEach() {
        zooFull.getOneOfEach();
        assertEquals(5, zooFull.getNumberOfDistinctSpecies());

    }
}
