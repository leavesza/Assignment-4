package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Map<String, Integer> expectedMap;
    Map<String, Integer> resultMap;
    Set<String> expectedSet;
    List<String> expectedList = new ArrayList<>();
    List<Integer> resultList = new ArrayList<Integer>();
    boolean hasMap = false;

    @Before
    public void setMaps() {


        expectedMap = new HashMap<>();
        expectedMap.put("yaseen", 100);
        expectedMap.put("justin", 101);
        expectedMap.put("george", 102);
        expectedMap.put("lance", 103);


        resultMap = new HashMap<>();
        resultMap.put("yaseen", 100);
        resultMap.put("justin", 101);
        resultMap.put("george", 102);
        resultMap.put("lance", 103);


    }

    @Test
    public void testHasMap() {

        setMaps();
        Assert.assertTrue(expectedMap.equals(resultMap));

        hasMap = true;

    }

    @Test
    public void testKeys() {

        testHasMap();
        if (hasMap) {
            expectedSet = expectedMap.keySet();
            Assert.assertEquals(expectedSet, resultMap.keySet());
        }

    }

    @Test
    public void testList() {

        testHasMap();
        if (hasMap) {
            //artificially sets up values for the expected List.
            expectedList.add("Yaseen");
            expectedList.add("Justin");
            expectedList.add("George");
            expectedList.add("Lance");

            Collection<Integer> collection = Collections.unmodifiableCollection(resultMap.values());
            resultList.addAll(collection);

            Assert.assertEquals(expectedList, resultList);
        }
    }
}

