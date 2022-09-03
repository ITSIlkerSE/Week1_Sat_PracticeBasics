public class PracticeBasics {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(15));

    }

    public static String fizzBuzz (int number){

        boolean isDividableBy3And5 = number % 3 == 0 && number % 5 == 0;
        boolean isDividableBy3 = number % 3 == 0;
        boolean isDividableBy5 = number % 5 == 0;

        if(isDividableBy3And5){
            return "fizzbuzz";
        } else if (isDividableBy5) {
            return "buzz";
        } else if (isDividableBy3) {
            return "fizz";
        }


        return String.valueOf(number);
    }

}
