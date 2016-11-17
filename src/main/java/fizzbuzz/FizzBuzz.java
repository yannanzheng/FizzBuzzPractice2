package fizzbuzz;

/**
 * Created by Yang Junfei on 16/11/17.
 */
public class FizzBuzz {
    public String[] printFizzBuzz() {

        String[] strNumberWithFizzBuzz = new String[100];

        for (int i = 1; i <= 100; i++) {


            if (i%3==0&&i % 5 == 0) {

                strNumberWithFizzBuzz[i - 1] = "FizzBuzz";

            }else if (i%3==0) {
                strNumberWithFizzBuzz[i - 1] = "Fizz";
            } else if (i % 5 == 0) {

                strNumberWithFizzBuzz[i - 1] = "Buzz";

            } else {

                strNumberWithFizzBuzz[i - 1] = Integer.toString(i);

            }

        }

        for (String strNumber:strNumberWithFizzBuzz
             ) {
            System.out.print(strNumber+" ");

        }

        return strNumberWithFizzBuzz;
    }
}
