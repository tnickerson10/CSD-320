public class Equations {

        public static void main(String[] args) {
            double equation1 =  4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);
            System.out.println(equation1);
            double equation2 =  4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
            System.out.println(equation2);
        /* The difference in these two equations is that in equation1 there
        are decimal values that represent doubles within the parenthesis which allows for java to
        create a proper double return value including the numbers after the decimal place (0.8209346209346211).
        Then it is multiplied by 4. (3.2837384837384844)

        However in equation2 the parenthesis equation is missing decimals so Java assumes int
        data types and cuts off the values after the decimal place leaving the value (1). This
        is then multiplied by 4 and then passed into the variable and converted to a double (4.0)
        You could also make the data type int and the answer would be stored as an int (4). I left
        the data type as a double for uniformity and because Java will type cast the int to a double
        automatically due to wide casting.

        I believe that equation1 is the better version in this case as it displays the decimal values and
        best represents the true math. However, this equation could be used for other purposes where the exact math
        is not needed.
         */

        }

}
