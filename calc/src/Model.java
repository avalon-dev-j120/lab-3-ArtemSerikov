public class Model {

    public long calculate(long num1, long num2, String operation){
        switch (operation){

            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
        }
        System.out.println("Unknown operator: " + operation);

        return 0;
    }




}
