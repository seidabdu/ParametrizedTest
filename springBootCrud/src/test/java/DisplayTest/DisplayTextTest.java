package DisplayTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.att.bizops.controller.DIsplayText;

@RunWith(Parameterized.class)
public class DisplayTextTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "seid","This is text with parameters your name is seid" }, 
                 { "abdu","This is text with parameters your name is abdu" },
                 { "edris","This is text with parameters your name is edris"}, 
                 { "seid","This is text with parameters your name is seid" }, 
                 { "seid","This is text with parameters your name is seid" }, 
                 { "seid","This is text with parameters your name is seid" }, 
                 { "seid","This is text with parameters your name is seid" }  
           });
    }

    private String fInput;

    private String fExpected;

    public DisplayTextTest(String input, String expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

    @Test
    public void test() {
    	
    	System.out.println(fExpected +"----"+ DIsplayText.display(fInput));
        assertEquals(fExpected, DIsplayText.display(fInput));
    }
}
