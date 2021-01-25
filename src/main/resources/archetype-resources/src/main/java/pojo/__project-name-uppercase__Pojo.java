#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pojo;

/**
 * @author lgdamy on 25/01/2021
 */
public class ${project-name-uppercase}Pojo {

    private int randomNumber;

    public ${project-name-uppercase}Pojo(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public boolean isEven() {
        return randomNumber % 2 == 0;
    }

    public boolean isOdd() {
        return randomNumber % 2 != 0;
    }

    public boolean isPrime() {
        return java.math.BigInteger.valueOf(randomNumber).isProbablePrime(10);
    }
}
