package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Map< String,Integer> HMemployee =
                new HashMap< String,Integer>();
        HMemployee.put("yaseen", 100);
        HMemployee.put("justin", 101);
        HMemployee.put("george", 102);
        HMemployee.put("lance", 103);

        System.out.println(HMemployee);

        List<Integer> l1 = new ArrayList();

        Collection<Integer> collectionOfKeys = new Collections.unmodifiableList(HMemployee.keySet());

        l1.addAll(collectionOfKeys);

    }
}
