public class main {

    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Bob";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }
        public static void hello() {
            System.out.println("Hello, World!");
        }

        public static void positiveOrNegative (int number){
            if (number > 0) {
                System.out.println("This number is positive!");
            } else {
                System.out.println("This number is negative!");
            }
        }

        public static void positiveOrZeroOrNegative(int number){
            if (number == 0) {
                System.out.println("This number is zero!");
            } else if (number < 0) {
                System.out.println("This number is negative!");
            } else {
                System.out.println("This number is positive!");
            }
        }

        public static void bartender (String name){
            String drink = null;
            switch (name) {
                case "Bob":
                    drink = "drinkt alles behalve alcohol";
                    break;
                case "Anne":
                    drink = "champagne";
                    break;
                case "Sinterklaas":
                    drink = "chocomel";
            }
            System.out.println(drink);
        }

        public static void sum ( int input1, int input2){
            System.out.println("The sum of number " + input1 + " and number " + input2 + " is " + (input1 + input2));
        }
}
