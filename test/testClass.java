import MyMa.BMW;
import MyMa.Hyundai;
import MyMa.Toyota;
import org.junit.Assert;
import org.junit.Test;


public class testClass {

    @Test
    public void BMW1() {
        BMW b1 = new BMW( "Omer", "BMW", 45, 90000, 28000, 10000, 48, 4000, 0.09, 0.0032 );

        Assert.assertEquals( "882.54", b1.leaseMonthlyCalculator() );

        Assert.assertFalse( b1.isAligable() );

        Assert.assertEquals( "43361.92", b1.totalCalculator() );

    }

    @Test
    public void BMW2() {
        BMW b1 = new BMW( "Ali", "BMW", 35, 80000, 25000, 5000, 36, 2000, 0.09, 0.0031 );

        Assert.assertEquals( "1211.37", b1.leaseMonthlyCalculator() );

        Assert.assertFalse( b1.isAligable() );

        Assert.assertEquals( "44609.32", b1.totalCalculator() );

    }

    @Test
    public void BMW3() {
        BMW b1 = new BMW( "Ali", "BMW", 25, 150000, 30000, 8000, 48, 1200, 0.18, 0.0042 );

        Assert.assertEquals( "1104.33", b1.leaseMonthlyCalculator() );

        Assert.assertTrue( b1.isAligable() );

        Assert.assertEquals( "54007.84", b1.totalCalculator() );

    }

    @Test
    public void Toyota1() {
        Toyota b1 = new Toyota( "Ali", "Toyota", 35, 25200, 45000, 7000, 48, 3000, 0.11, 0.0045 );

        Assert.assertEquals( "1841.74", b1.leaseMonthlyCalculator() );

        Assert.assertFalse( b1.isAligable() );

        Assert.assertEquals( "89403.52", b1.totalCalculator() );
    }

    @Test
    public void Toyota2() {
        Toyota b1 = new Toyota( "Ali", "Toyota", 50, 180000, 40000, 10000, 24, 1500, 0.05, 0.0045 );

        Assert.assertEquals( "2736.25", b1.leaseMonthlyCalculator() );

        Assert.assertTrue( b1.isAligable() );

        Assert.assertEquals( "66670.00", b1.totalCalculator() );


    }

    @Test
    public void Toyota3() {
        Toyota b1 = new Toyota( "Ali", "Toyota", 35, 80000, 25000, 5000, 36, 2000, 0.09, 0.0031 );

        Assert.assertEquals( "1211.37", b1.leaseMonthlyCalculator() );
        System.out.println(b1.leaseMonthlyCalculator());

        Assert.assertFalse( b1.isAligable() );
        System.out.println(b1.isAligable());

        Assert.assertEquals( "44609.32", b1.totalCalculator() );

    }

    @Test
    public void Hyundai1() {
        Hyundai b1 = new Hyundai( "Ali", "Hyundai", 21, 200000, 32000, 5000, 48, 3000, 0.15, 0.0039 );

        Assert.assertEquals( "1289.94", b1.leaseMonthlyCalculator() );

        Assert.assertTrue( b1.isAligable() );

        Assert.assertEquals( "62917.12", b1.totalCalculator() );

    }

    @Test
    public void Hyundai2() {
        Hyundai b1 = new Hyundai( "Ali", "Hyundai", 35, 10000, 25000, 5000, 36, 2000, 0.09, 0.0031 );

        Assert.assertEquals( "1211.37", b1.leaseMonthlyCalculator() );

        Assert.assertFalse( b1.isAligable() );

        Assert.assertEquals( "44609.32", b1.totalCalculator() );

    }

    @Test
    public void Hyundai3() {
        Hyundai b1 = new Hyundai( "Someone", "Hyundai", 42, 100000, 25000, 5000, 48, 3000, 0.15, 0.0031 );
        System.out.println(b1.leaseMonthlyCalculator());
        Assert.assertEquals( "938.95", b1.leaseMonthlyCalculator() );
        System.out.println(b1.isAligable());

        Assert.assertFalse( b1.isAligable() );

        Assert.assertEquals( "46069.60", b1.totalCalculator() );

    }

}



