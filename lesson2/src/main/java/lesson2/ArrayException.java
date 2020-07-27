package lesson2;

import java.util.Scanner;

public class ArrayException {

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    /*try {
        arr [4][4];
    } catch (MyArraySizeException e) {
        System.out.println("Неверный размер массива");
    }*/

    public static void arrayException() throws MyArraySizeException, MyArrayDataException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int b = sc.nextInt(); //ввод размера массива

        /*try {
            if (a == 4 & b == 4) System.out.println("Верный размер массива");
        } catch (MyArraySizeException) {
        }*/
        
        if (a != 4 & b != 4) {
          throw new MyArraySizeException ("Неверный размер массива");
        } // проверка размера массива


        Object[][] arr = new Object[a][b]; //создание массива



        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.next();
            }
        } //наполнение массива

        /*for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                try {
                    arr[i][j] = (int) arr[i][j];
                } catch (Exception e) {
                    e.printStackTrace(MyArrayDataException);
                } finally {

                }
            }
        }*/ //проверка массива
    }

    public static void main(String[] args) {

        arrayException();
    }
    //MyArraySizeException Character.highSurrogate


    //MyArrayDataException
}
