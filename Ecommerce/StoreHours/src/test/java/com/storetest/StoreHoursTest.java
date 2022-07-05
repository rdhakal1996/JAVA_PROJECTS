package com.storetest;

import com.storeinfo.StoreHours;
import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StoreHoursTest {
    @Test
    public void isStoreOpen_1() {
        StoreHours hourOpen = new StoreHours();
        assertTrue("isStoreOpen(8) should return true", hourOpen.isStoreOpen(8));
        assertTrue("isStoreOpen(10) should return true", hourOpen.isStoreOpen(10));
        assertTrue("isStoreOpen(16) should return true", hourOpen.isStoreOpen(16));
        assertFalse("isStoreOpen(17) should return false", hourOpen.isStoreOpen(17));
        assertFalse("isStoreOpen(19) should return false", hourOpen.isStoreOpen(19));
        assertFalse("isStoreOpen(23) should return false", hourOpen.isStoreOpen(23));
        assertFalse("isStoreOpen(0) should return false", hourOpen.isStoreOpen(0));
        assertFalse("isStoreOpen(1) should return false", hourOpen.isStoreOpen(1));
        assertFalse("isStoreOpen(7) should return false", hourOpen.isStoreOpen(7));
    }

    @Test
    public void isStoreOpen_2() {
        StoreHours hourOpen = new StoreHours();
        assertTrue("isStoreOpen(8, 'M') should return true", hourOpen.isStoreOpen(8, 'M'));
        assertTrue("isStoreOpen(8, 'W') should return true", hourOpen.isStoreOpen(8, 'W'));
        assertTrue("isStoreOpen(8, 'F') should return true", hourOpen.isStoreOpen(8, 'F'));
        assertFalse("isStoreOpen(8, 'S') should return false", hourOpen.isStoreOpen(8, 'S'));

        assertTrue("isStoreOpen(13, 'M') should return true", hourOpen.isStoreOpen(13, 'M'));
        assertTrue("isStoreOpen(13, 'W') should return true", hourOpen.isStoreOpen(13, 'W'));
        assertTrue("isStoreOpen(13, 'F') should return true", hourOpen.isStoreOpen(13, 'F'));
        assertFalse("isStoreOpen(13, 'S') should return false", hourOpen.isStoreOpen(13, 'S'));

        assertTrue("isStoreOpen(16, 'M') should return true", hourOpen.isStoreOpen(16, 'M'));
        assertTrue("isStoreOpen(16, 'W') should return true", hourOpen.isStoreOpen(16, 'W'));
        assertTrue("isStoreOpen(16, 'F') should return true", hourOpen.isStoreOpen(16, 'F'));
        assertFalse("isStoreOpen(16, 'S') should return false", hourOpen.isStoreOpen(16, 'S'));

        assertFalse("isStoreOpen(17, 'M') should return false", hourOpen.isStoreOpen(17, 'M'));
        assertFalse("isStoreOpen(17, 'W') should return false", hourOpen.isStoreOpen(17, 'W'));
        assertFalse("isStoreOpen(17, 'F') should return false", hourOpen.isStoreOpen(17, 'F'));
        assertFalse("isStoreOpen(17, 'S') should return false", hourOpen.isStoreOpen(17, 'S'));

        assertFalse("isStoreOpen(19, 'M') should return false", hourOpen.isStoreOpen(19, 'M'));
        assertFalse("isStoreOpen(19, 'W') should return false", hourOpen.isStoreOpen(19, 'W'));
        assertFalse("isStoreOpen(19, 'F') should return false", hourOpen.isStoreOpen(19, 'F'));
        assertFalse("isStoreOpen(19, 'S') should return false", hourOpen.isStoreOpen(19, 'S'));

        assertFalse("isStoreOpen(7, 'M') should return false", hourOpen.isStoreOpen(7, 'M'));
        assertFalse("isStoreOpen(7, 'W') should return false", hourOpen.isStoreOpen(7, 'W'));
        assertFalse("isStoreOpen(7, 'F') should return false", hourOpen.isStoreOpen(7, 'F'));
        assertFalse("isStoreOpen(7, 'S') should return false", hourOpen.isStoreOpen(7, 'S'));
    }

    @Test
    public void Exercise07_isStoreOpen_3() {
        StoreHours hourOpen = new StoreHours();
        assertFalse("isStoreOpen(7, 'M', false) should return false", hourOpen.isStoreOpen(7, 'M', false));
        assertFalse("isStoreOpen(7, 'M', true) should return false", hourOpen.isStoreOpen(7, 'M', true));
        assertFalse("isStoreOpen(7, 'W', false) should return false", hourOpen.isStoreOpen(7, 'W', false));
        assertFalse("isStoreOpen(7, 'W', true) should return false", hourOpen.isStoreOpen(7, 'W', true));
        assertFalse("isStoreOpen(7, 'F', false) should return false", hourOpen.isStoreOpen(7, 'F', false));
        assertFalse("isStoreOpen(7, 'F', true) should return false", hourOpen.isStoreOpen(7, 'F', true));
        assertFalse("isStoreOpen(7, 'S', false) should return false", hourOpen.isStoreOpen(7, 'S', false));
        assertFalse("isStoreOpen(7, 'S', true) should return false", hourOpen.isStoreOpen(7, 'S', true));

        assertTrue("isStoreOpen(8, 'M', false) should return true", hourOpen.isStoreOpen(8, 'M', false));
        assertTrue("isStoreOpen(8, 'M', true) should return true", hourOpen.isStoreOpen(8, 'M', true));
        assertTrue("isStoreOpen(8, 'W', false) should return true", hourOpen.isStoreOpen(8, 'W', false));
        assertTrue("isStoreOpen(8, 'W', true) should return true", hourOpen.isStoreOpen(8, 'W', true));
        assertTrue("isStoreOpen(8, 'F', false) should return true", hourOpen.isStoreOpen(8, 'F', false));
        assertTrue("isStoreOpen(8, 'F', true) should return true", hourOpen.isStoreOpen(8, 'F', true));
        assertFalse("isStoreOpen(8, 'S', false) should return false", hourOpen.isStoreOpen(8, 'S', false));
        assertFalse("isStoreOpen(8, 'S', true) should return false", hourOpen.isStoreOpen(8, 'S', true));

        assertFalse("isStoreOpen(9, 'S', false) should return false", hourOpen.isStoreOpen(9, 'S', false));
        assertTrue("isStoreOpen(9, 'S', true) should return true", hourOpen.isStoreOpen(9, 'S', true));

        assertFalse("isStoreOpen(15, 'S', false) should return false", hourOpen.isStoreOpen(15, 'S', false));
        assertFalse("isStoreOpen(15, 'S', true) should return false", hourOpen.isStoreOpen(15, 'S', true));

        assertFalse("isStoreOpen(16, 'S', false) should return false", hourOpen.isStoreOpen(16, 'S', false));
        assertFalse("isStoreOpen(16, 'S', true) should return false", hourOpen.isStoreOpen(16, 'S', true));

        assertFalse("isStoreOpen(17, 'M', false) should return false", hourOpen.isStoreOpen(17, 'M', false));
        assertFalse("isStoreOpen(17, 'M', true) should return false", hourOpen.isStoreOpen(17, 'M', true));
        assertFalse("isStoreOpen(17, 'W', false) should return false", hourOpen.isStoreOpen(17, 'W', false));
        assertTrue("isStoreOpen(17, 'W', true) should return true", hourOpen.isStoreOpen(17, 'W', true));
        assertFalse("isStoreOpen(17, 'F', false) should return false", hourOpen.isStoreOpen(17, 'F', false));
        assertFalse("isStoreOpen(17, 'F', true) should return false", hourOpen.isStoreOpen(17, 'F', true));
        assertFalse("isStoreOpen(17, 'S', false) should return false", hourOpen.isStoreOpen(17, 'S', false));
        assertFalse("isStoreOpen(17, 'S', true) should return false", hourOpen.isStoreOpen(17, 'S', true));

        assertFalse("isStoreOpen(19, 'W', false) should return false", hourOpen.isStoreOpen(19, 'W', false));
        assertTrue("isStoreOpen(19, 'W', true) should return true", hourOpen.isStoreOpen(19, 'W', true));
        assertFalse("isStoreOpen(20, 'W', false) should return false", hourOpen.isStoreOpen(20, 'W', false));
        assertFalse("isStoreOpen(20, 'W', true) should return false", hourOpen.isStoreOpen(20, 'W', true));
    }
}
