package com.mdumrauf.android.examples.gradle;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * Utility class.
 * 
 * @author Matias Dumrauf
 * @since Nov 23, 2012
 */
public class Utils {

    public static Collection<Integer> getFilteredNumbers(List<Integer> unfiltered) {
        Collection<Integer> filtered = Collections2.filter(unfiltered , new Predicate<Integer>() {
            @Override
            public boolean apply(Integer i) {
                return i % 2 == 0;
                
            }
        });
        return filtered;
    }

}
