package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void testAdd() {
        CustomList list = MockCityList();
        City myCity = new City("Edmonton", "Alberta");
        assertEquals(list.getCount(), 0);
        list.addCity(myCity);
        assertEquals(list.getCount(), 1);
//        assertTrue(list.hasCity(myCity));
    }

}
