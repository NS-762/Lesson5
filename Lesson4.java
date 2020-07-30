import java.util.Scanner;

public class Lesson4 {



    public static void main(String args[]) { // задание 4

        Scanner scan = new Scanner(System.in);
        int bigBowl = 0;
        int appetite;
        int food;
        boolean proverka = false;

        Cat[] catsArr = new Cat[3];
        catsArr[0] = new Cat(50, 1, 10, 2, 5);
        catsArr[1] = new Cat(50, 1, 10, 2, 10);
        catsArr[2] = new Cat(50, 1, 10, 2, 14);

        for (int i = 0; i < 3; i++) { // задание 6-7
            appetite = catsArr[i].getAppetite();
            proverka = false;
            while (!proverka) {
                if (bigBowl - appetite >= 0) { // кормим кота
                    bigBowl -= appetite;
                    proverka = true;
                    System.out.printf("------Котик №%d накормлен------\n\n", i);
                } else { // наполняем миску
                    System.out.println("Кол-во еды в миске: " + bigBowl);
                    System.out.printf("Котик №%d не накормлен, надо наполнить миску. Введите кол-во ед. пищи: ", i);
                    food = scan.nextInt();
                    bigBowl += food;
                }
            }
        }

        System.out.println("\nЗадание 1-5:");
        Cat an1 = new Cat(50, 1, 10, 2, 10);
        an1.eatUp();
        an1.setBowl(11);
        an1.getBowl();
        an1.eatUp();
    }
}
