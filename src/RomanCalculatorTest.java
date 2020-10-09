import org.junit.Test;

import static org.junit.Assert.*;

public class RomanCalculatorTest {
    RomanCalculator rc= new RomanCalculator();

    @Test
    public void value() {
        char val='I';

        assertEquals(rc.value(val) ,1);
    }
    @Test
    public void value1() {
        char val='V';

        assertEquals(rc.value(val) ,5);
    }
    @Test
    public void value2() {
        char val='X';

        assertEquals(rc.value(val) ,10);
    }

    @Test
    public void romanToDecimal() {
        String val="IX";

        assertEquals(rc.romanToDecimal(val) , 9);
    }
    @Test
    public void romanToDecimal1() {
        String val="X";

        assertEquals(rc.romanToDecimal(val) , 10);
    }
    @Test
    public void romanToDecimal2() {
        String val="III";

        assertEquals(rc.romanToDecimal(val) , 3);
    }   @Test
    public void romanToDecimal3() {
        String val="VI";

        assertEquals(rc.romanToDecimal(val) , 6);
    }


    @Test
    public void addition() {
        int val1=9;
        int val2=1;
        assertEquals(rc.Addition(val2,val1), 10);
    }
    @Test
    public void addition1() {
        int val1=4;
        int val2=1;
        assertEquals(rc.Addition(val2,val1), 5);
    }
    @Test
    public void addition2() {
        int val1=9;
        int val2=3;
        assertNotEquals(rc.Addition(val1,val2),39);
        assertEquals(rc.Addition(val2,val1), 12);
    }
    @Test
    public void addition3() {
        int val1=9;
        int val2=7;
        assertEquals(rc.Addition(val2,val1), 16);
    }

    @Test
    public void subtraction() {
        int val1=12;
        int val2=7;
        assertNotEquals(rc.Subtraction(val1,val2),2);
        assertEquals(rc.Subtraction(val1,val2), 5);
    }
    @Test
    public void subtraction1() {
        int val1=3;
        int val2=7;
        assertNotEquals(rc.Subtraction(val1,val2),39);
        assertEquals(rc.Subtraction(val1,val2), -4);
    }
    @Test
    public void subtraction2() {
        int val1=5;
        int val2=5;
        assertNotEquals(rc.Subtraction(val1,val2),3);
        assertEquals(rc.Subtraction(val1,val2), 0);
    }
    @Test
    public void subtraction3() {
        int val1=91;
        int val2=7;
        assertNotEquals(rc.Subtraction(val1,val2),9);
        assertEquals(rc.Subtraction(val1,val2), 84);
    }


    @Test
    public void multiply() {
        int val1=1;
        int val2=7;
        assertNotEquals(rc.Multiply(val1,val2),9);
        assertEquals(rc.Multiply(val1,val2), 7);

    }
    @Test
    public void multiply1() {
        int val1=10;
        int val2=1;
        assertNotEquals(rc.Multiply(val1,val2),92);
        assertEquals(rc.Multiply(val1,val2), 10);

    }
    @Test
    public void multiply2() {
        int val1=11;
        int val2=7;
        assertNotEquals(rc.Multiply(val1,val2),9);
        assertEquals(rc.Multiply(val1,val2), 77);

    }
    @Test
    public void multiply3() {
        int val1=12;
        int val2=3;
        assertNotEquals(rc.Multiply(val1,val2),9);
        assertEquals(rc.Multiply(val1,val2), 36);

    }



    @Test
    public void division() {
        int val1=7;
        int val2=1;
        assertNotEquals(rc.Division(val1,val2),9);
        assertEquals(rc.Division(val1,val2), 7);
    }
    @Test
    public void division1() {
        int val1=21;
        int val2=7;
        assertNotEquals(rc.Division(val1,val2),3.2);
        assertEquals(rc.Division(val1,val2), 3);
    }
    @Test
    public void division2() {
        int val1=9;
        int val2=3;
        assertNotEquals(rc.Division(val1,val2),9);
        assertEquals(rc.Division(val1,val2), 3);
    }
    @Test
    public void division3() {
        int val1=100;
        int val2=25;
        assertNotEquals(rc.Division(val1,val2),19);
        assertEquals(rc.Division(val1,val2), 4);
    }

    @Test
    public void isInteger() {
        String val= "12";
        String val2="ten";
        assertNotEquals(rc.isInteger(val2),true);
        assertEquals(rc.isInteger(val),true);
        assertNotEquals(rc.isInteger(val),false);
    }
    @Test
    public void isIntegerr() {
        String val= "1212";
        String val2="five";
        assertNotEquals(rc.isInteger(val2),true);
        assertEquals(rc.isInteger(val),true);
        assertNotEquals(rc.isInteger(val),false);
    }
    @Test
    public void isInteger1() {
        String val= "124321234";
        String val2="asda";
        assertNotEquals(rc.isInteger(val2),true);
        assertEquals(rc.isInteger(val),true);
        assertNotEquals(rc.isInteger(val),false);
    }  @Test
    public void isInteger2() {
        String val= "1";
        String val2="tan tna tan";
        assertNotEquals(rc.isInteger(val2),true);
        assertEquals(rc.isInteger(val),true);
        assertNotEquals(rc.isInteger(val),false);
    }
    @Test
    public void isInteger3() {
        String val= "122";
        String val2="one to one";
        assertNotEquals(rc.isInteger(val2),true);
        assertEquals(rc.isInteger(val),true);
        assertNotEquals(rc.isInteger(val),false);
    }

}