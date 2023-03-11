import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multiplicationTable();// task_0
        System.out.println("----------------------------------------------");
        sumOfAllFives();// task_1
        System.out.println("----------------------------------------------");
        arbitraryTriangle();// task_2
        System.out.println("----------------------------------------------");
        cyrillicAlphabetCharacters();// task_3
        System.out.println("----------------------------------------------");
        maxNumberInArray();// task_4
        System.out.println("----------------------------------------------");
        multiplicationTableArray();
        System.out.println("----------------------------------------------");
        compareTwoArrays();
    }

    public static void multiplicationTable() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int k = (i + 1) * (j + 1);
                System.out.print(k + "  ");
                if (k < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void sumOfAllFives() {
        int sumForWhile = 0;
        int sumForFori = 0;
        int sumForDoWhile = 0;
        int maxNumWhile = 0;
        int maxNumDoWhile = 0;

        while (maxNumWhile < 151) {
            sumForWhile += maxNumWhile;
            maxNumWhile += 5;
        }
        System.out.println("For cycle \"while\" - sum from 5 to 150 multiply of 5 is: " + sumForWhile);
        System.out.println();

        for (int i = 5; i < 151; i += 5) {
            sumForFori += i;
        }
        System.out.println("For cycle \"for\" - sum from 5 to 150 multiply of 5 is: " + sumForFori);
        System.out.println();

        do {
            sumForDoWhile += maxNumDoWhile;
            maxNumDoWhile += 5;
        } while (maxNumDoWhile < 151);
        System.out.println("For cycle \"do-while\" - sum from 5 to 150 multiply of 5 is: " + sumForDoWhile);
    }

    public static void arbitraryTriangle() {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {
            char star = '*';
            int starCount = i + 1;
            for (int j = 0; j < starCount; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
    public static void cyrillicAlphabetCharacters() {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъьэюя";
        char[] cyrillicAlphabet = new char[alphabet.length()];
        int i = 0;
        for (char elementAlphabet : alphabet.toUpperCase().toCharArray()) {
            cyrillicAlphabet[i] = elementAlphabet;
            i++;
        }
        System.out.println(cyrillicAlphabet);
    }

    public static void maxNumberInArray() {
        System.out.println("Please enter five numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arrayNum = new int[5];
        for (int i = 0; i < 5; i++) {
            int numFromUser = scanner.nextInt();
            arrayNum[i] = numFromUser;
        }
        int max = arrayNum[0];
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > max) {
                max = arrayNum[i];
            }
        }
        System.out.println("Max number is: " + max);
    }

    public static void multiplicationTableArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two number from 1 to 9:");
        int firstNumber = scanner.nextInt() - 1;
        int secondNumber = scanner.nextInt() - 1;
        if (firstNumber < 0 || firstNumber > 9 && !scanner.hasNextInt()) {
            System.out.println("Error! Please enter number from 1 to 9");
        }
        if (secondNumber < 0 || secondNumber > 9 && !scanner.hasNextInt()) {
            System.out.println("Error! Please enter number from 1 to 9");
        }

        int[][] arrayMultiTable = new int[10][10];
        for (int i = 0; i < arrayMultiTable.length; i++) {
            for (int j = 0; j < arrayMultiTable.length; j++) {
                arrayMultiTable[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("The product of your two numbers is: " + arrayMultiTable[firstNumber][secondNumber]);
        System.out.println("The position of the product in the array is located in the coordinates" + "[" + (firstNumber + 1) + "]" + "[" + (secondNumber + 1) + "]");
    }

    public static void compareTwoArrays() {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        int[] arrayThree = new int[5];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 10);
            System.out.print(arrayOne[i] + " VS ");
            arrayTwo[i] = (int) (Math.random() * 10);
            System.out.print(arrayTwo[i]);
            System.out.println();
                    if (arrayOne[i] >= arrayTwo[i]) {
                        arrayThree[i] = arrayOne[i];
                    } else {
                        arrayThree[i] = arrayTwo[i];
                    }
            }
        System.out.print("Result array: ");
        for (int elementOfArrayThree : arrayThree) {
            System.out.print(elementOfArrayThree);
        }
        System.out.println();
    }
}