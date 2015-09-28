package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
    //Verify print() being called 10 times
    //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?


    private Printer printer;
    private TacitKnowledgePrinter tkPrinter;


    @Before
    public void setUp() {
        printer = mock(Printer.class);
        tkPrinter = new TacitKnowledgePrinter(printer);

    }

    @Test
    public void testPrintNumbersTimes10() {

        tkPrinter.printNumbers(10);
        verify(printer, times(10)).print(anyString());

    }

   @Test(expected = Exception.class)
    public void testPrintNumberLimitZero(){
       tkPrinter.printNumbers(0);
    }

    @Test
    public void testCalculate1(){
        assertEquals(tkPrinter.calculate(3), "Tacit");
    }

    @Test
    public void testCalculate2(){
        assertEquals(tkPrinter.calculate(15),"TacitKnowledge");
    }

    @Test
    public void testCalculate3(){
        assertEquals(tkPrinter.calculate(5),"Knowledge");
    }


}
