package day2;

import java.util.Scanner;

public class Trask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей в здании: ");
        int floor = scanner.nextInt();
        if (floor>=1 && floor<=4){
            System.out.println("Малоэтажный дом");
        }else if (floor>=5 && floor<=8){
            System.out.println("Среднеэтажный дом");
        }else if (floor>=9){
            System.out.println("Многоэтажный дом");
        } else{
            System.out.println("Ошибка ввода");
        }
    }
}
