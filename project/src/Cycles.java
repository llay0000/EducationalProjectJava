import java.util.Scanner;

public class Cycles {
    private static int сyclesRandomOne;
    private static int[] сyclesRandomTwo;
    private static int сyclesRandomThree;


    public static void main(String[] args) {
        Cycles.run();
    }

    public static void run() {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        do {
            num = number.nextInt();
            switch (num) {
                case 1:
                    System.out.println("result: " + сyclesRandomOne());
                    break;
                case 2:
                    int[] randomNumbers = сyclesRandomTwo();
                    int number1 = randomNumbers[0];
                    int number2 = randomNumbers[1];
                    System.out.println("Первое число: " + number1);
                    System.out.println("Второе число: " + number2);
                    break;
                case 3:
                    Scanner numberTwo = new Scanner(System.in);
                    int numTwo = numberTwo.nextInt();
                    System.out.println(сyclesRandomThree(numTwo));
                    break;
            }
        } while (num != 0);
        number.close();
    }

    private static int сyclesRandomOne() {
        int num;
        int num2 = 0;
        for (int i = 0; i <= 20; i++) {
            num = (int) (Math.random() * 99);
            if (num >= num2) {
                num2 = num;
            }
        }
        return num2;
    }

    private static int[] сyclesRandomTwo() {
        int[] result = new int[2];
        int numTwo;
        int numTwo2 = 0;
        int numTwo3 = 0;
        for (int i = 0; i <= 20; i++) {
            numTwo = (int) (Math.random() * 80 - 40);
            if (numTwo >= numTwo2) {
                numTwo3 = numTwo2;
                numTwo2 = numTwo;
            } else if (numTwo <= numTwo3) {
                numTwo3 = numTwo;
            }
        }
        result[0] = numTwo2;
        result[1] = numTwo3;
        return result;
    }

    private static int сyclesRandomThree(int numberTh) {
        Scanner nummberThree = new Scanner(System.in);
        int numThree = nummberThree.nextInt();
        do {
            numThree = nummberThree.nextInt();
            if (0 < numThree) {
                System.out.println("Положительное");
            } else if (0 > numThree) {
                System.out.println("Отрицательное");
            } else {
                System.out.println("Ноль");
            }
        } while (numThree == 0);
        return 0;
    }

}


//3.Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение О.
// Для каждого введенного с клавиатуры положительного числа класс должен выводить на экран
// текст положительное, для каждого отрицательного - текст Отрицательное.
//
//4.На прогулочном пароходе есть определенное количество мест для взрослых и определенное
// количество мест для детей. Напишите класс, который принимает с клавиатуры два целых
// положительных числа: количество мест для взрослых и количество мест для детей. Затем
// класс должен принять пары целых чисел: первое число в паре - количество билетов для
// взрослых, второе - количество билетов для детей, которое покупает очередная группа.
// Продажа билетов заканчивается либо когда очередная пара содержит хотя бы одно неположительное
// значение, либо когда нет возможности выполнить очередной заказ. Вывести на экран следующую
// итоговую информацию:
//   - число групп, купивших билеты;
//   - количество взрослых и количество детей на пароходе;
//   - количество непроданных взрослых и детских мест.