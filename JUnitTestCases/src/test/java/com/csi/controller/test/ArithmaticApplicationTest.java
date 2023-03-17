package com.csi.controller.test;

import com.csi.controller.ArithmaticApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArithmaticApplicationTest {

    @Autowired
    ArithmaticApplication arithmaticApplication;

    @Test
    public void addTest() {

        Assert.assertEquals(5, arithmaticApplication.add(4,1));

    }

    @Test
    public void subTest() {

        Assert.assertEquals(10, arithmaticApplication.sub(15,5));

    }

    @Test
    public void mulTest() {

        Assert.assertEquals(25, arithmaticApplication.mul(5,5));

    }

    @Test
    public void divTest() {

        Assert.assertEquals(2, arithmaticApplication.div(10,5));

    }
}
