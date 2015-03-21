/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author User
 */
public class TestMultiIntrfc {
    
    private MultiIntrfc mclss;
    
    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext (AppConfig.class);
        mclss = (MultiIntrfc)ctx.getBean("mclss");
    }
    
    @AfterMethod
    public void tearDown() throws Exception{
        
    }
    @Test
    public void testAdd() throws Exception {
        int result = mclss.add(5,5);
        Assert.assertEquals("The sum of 5 + 5 equals 10",10,result );
    }
    
}
