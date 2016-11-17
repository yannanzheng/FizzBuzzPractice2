import fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by y431722jf on 16/11/17.
 */
public class FizzBuzzTest {


    @Test
    public void should_print_Fizz_when_number_is_divisible_by_3(){

        FizzBuzz fizzBuzz=new FizzBuzz();

        String[] resultArray=fizzBuzz.printFizzBuzz();

        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 3 == 0&&(i + 1) % 5 != 0) {
                assertEquals("Fizz",resultArray[i]);
            }


        }


    }

    @Test
    public void should_print_Buzz_when_number_is_divisible_by_5(){

        FizzBuzz fizzBuzz=new FizzBuzz();
        String[] resultArray=fizzBuzz.printFizzBuzz();

        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 5 == 0&&(i + 1) % 3 != 0) {
                assertEquals("Buzz",resultArray[i]);
            }


        }


    }

    @Test
    public void should_print_Fizz_when_number_is_divisible_by_3_and_5(){

        FizzBuzz fizzBuzz=new FizzBuzz();
        String[] resultArray=fizzBuzz.printFizzBuzz();

        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 3 == 0&&(i + 1) % 5==0 ) {
                assertEquals("FizzBuzz",resultArray[i]);
            }


        }


    }

}
