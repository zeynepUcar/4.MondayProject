package MyTest;

import MyMain.BMW;
import MyMain.Hyundai;
import MyMain.Toyota;
import org.junit.Assert;
import org.junit.Test;

public class Test_Class {

    @Test
    public void BMW1(){
        BMW b1 = new BMW("Ali", "BMW", 35,130000,40000,10000 ,24 ,1500 ,0.07, 0.0029 );

        Assert.assertTrue("2655.15".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("64723.60".equals(b1.totalCalculator()));

    }

    @Test
    public void BMW2(){
        BMW b1 = new BMW("Ali", "BMW", 35,80000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );

        Assert.assertTrue("1211.37".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44609.32".equals(b1.totalCalculator()));

    }

    @Test
    public void BMW3(){
        BMW b1 = new BMW("Ali", "BMW", 25,150000,30000,8000 ,48 ,1200 ,0.18, 0.0042 );

        Assert.assertTrue("1104.33".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("54007.84".equals(b1.totalCalculator()));

    }

    @Test
    public void Toyota1(){
        Toyota b1 = new Toyota("Ali", "Toyota", 35,25200,45000,7000 ,48 ,3000 ,0.11, 0.0045 );

        Assert.assertTrue("1841.74".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("89403.52".equals(b1.totalCalculator()));




    }

    @Test
    public void Toyota2(){
        Toyota b1 = new Toyota("Ali", "Toyota", 50,180000,40000,10000 ,24 ,1500 ,0.05, 0.0045 );

        Assert.assertTrue("2736.25".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("66670.00".equals(b1.total_Calculator()));


    }

    @Test
    public void Toyota3(){
        Toyota b1 = new Toyota("Ali", "Toyota", 35,80000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );


        Assert.assertTrue("1211.37".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44609.32".equals(b1.totalCalculator()));


    }


    @Test
    public void Hyundai1(){
        Hyundai b1 = new Hyundai("Ali", "Hyundai", 21,200000,32000,5000 ,48 ,3000 ,0.15, 0.0039 );

        Assert.assertTrue("1289.94".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("62917.12".equals(b1.totalCalculator()));

    }

    @Test
    public void Hyundai2(){
        Hyundai b1 = new Hyundai("Ali", "Hyundai", 35,10000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );


        Assert.assertTrue("1211.37".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44609.32".equals(b1.totalCalculator()));


    }

    @Test
    public void Hyundai3(){
        Hyundai b1 = new Hyundai("Someone", "Hyundai", 42,100000,25000,5000 ,48 ,3000 ,0.15, 0.0031 );

        Assert.assertTrue("938.95".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("46069.60".equals(b1.totalCalculator()));

    }

}



