import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập sô");
        number = scanner.nextInt();
        String read = "";
        String donvi = "";
        String chuc = "";
        String tram = "";
        if (number == 0) {
            read = "zero";
        }
        if (number < 0 || number > 10) {
            read = "Out of ability";
        } else {
            switch (number%10) {
                case 1:
                    read = "One";
                    break;
                case 2:
                    read = "Two";
                    break;
                case 3:
                    read = "Three";
                    break;
                case 4:
                    read = "Four";
                    break;
                case 5:
                    read = "Five";
                    break;
                case 6:
                    read = "Six";
                    break;
                case 7:
                    read = "Seven";
                    break;
                case 8:
                    read = "Eight";
                    break;
                case 9:
                    read = "Nine";

            }
            System.out.println(read);
        }

        if (number >= 10 && number < 20){
            switch (number%10){
                case 1:
                    read = "Eleven";
                    break;
                case 2:
                    read = "Twelve";
                    break;
                case 3:
                    read = "Thirteen";
                    break;
                case 4:
                    read = "Fourteen";
                    break;
                case 5:
                    read = "Fifteen";
                    break;
                case 6:
                    read = "Sixteen";
                    break;
                case 7:
                    read = "Seventeen";
                    break;
                case 8:
                    read = "Eighteen";
                    break;
                case 9:
                    read = "Nineteen";
                    break;
            }
            System.out.println(read);

        }
        if (number >= 20 && number < 100){
            System.out.println();
            switch (number/10){
                case 2:
                    chuc = "Twenty";
                    break;
                case 3:
                    chuc = "Thirty";
                    break;
                case 4:
                    chuc = "Forty";
                    break;
                case 5:
                    chuc = "Fifty ";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "Seventy";
                    break;
                case 8:
                    chuc = "Eighty";
                    break;
                case 9:
                    chuc = "Ninety";
            }
            switch (number%10){
                case 1:
                    donvi = " One";
                    break;
                case 2:
                    donvi = " Two";
                    break;
                case 3:
                    donvi = " Three";
                    break;
                case 4:
                    donvi = " Four";
                    break;
                case 5:
                    donvi = " Five";
                    break;
                case 6:
                    donvi = " Six";
                    break;
                case 7:
                    donvi = " Seven";
                    break;
                case 8:
                    donvi = " Eight";
                    break;
                case 9:
                    donvi = " Nine";

            }
            System.out.println(chuc + donvi);
        }
    }
}