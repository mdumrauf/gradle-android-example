package com.mdumrauf.android.examples.gradle;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

import com.google.common.collect.Lists;


public final class UtilsTest {

    @Test
    public void testDummy() {
        Collection<Integer> filteredNumbers = Utils.getFilteredNumbers(Lists.newArrayList(4, 1, 2, 5, 9, 8));
        assertEquals(Lists.newArrayList(4, 2, 8), Lists.newArrayList(filteredNumbers));
    }
    
}
