package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHwpaas {

    HwpaasImpl hwpaasImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        hwpaasImpl = BeanUtils.getBean("hwpaasImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: hwpaasImpl.add(Integer a, Integer b)
        Integer returnValue = hwpaasImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hwpaasImpl.sayHei(String name)
        String returnValue = hwpaasImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hwpaasImpl.sayHello(String name)
        String returnValue = hwpaasImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hwpaasImpl.sayHi(String name)
        String returnValue = hwpaasImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hwpaasImpl.saySomething(String prefix, Person user)
        String returnValue = hwpaasImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



