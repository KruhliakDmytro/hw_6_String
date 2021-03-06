/*
 Составить из букв введенной строки слова
        Вводится строка, состоящая из букв и пробелов. Составить из входящих в нее букв несколько любых их сочетаний (слов)
        любой длины. Каждую букву строки можно использовать неограниченное количество раз.

*/
package exercise_1;

public class Main {
    public static void main(String[] args) {
        String resultString;
        String enteredString = "Holla is a String with Spaces and UPPERCases";
        String replaceSpace = enteredString.replaceAll(" ", "");
        String[] splitedEnteredString = replaceSpace.split("");
        int numbersOfWords = rnd(2, replaceSpace.length() / 4);
        System.out.println(enteredString);
        for (int i = 0; i < numbersOfWords; i++) {

            resultString = "";

            for (int j = 0; j < rnd(3, 5); j++) {
                resultString += splitedEnteredString[rnd(0, replaceSpace.length() - 1)];
            }

            System.out.println(resultString.toLowerCase());
        }
    }

    private static int rnd(int low, int high) {
        return (int) (Math.random() * (high - low + 1)) + low;
    }

}
