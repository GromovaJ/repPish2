import java.time.LocalDateTime;
import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя:");
        String sName = scn.nextLine();
        scn.close();

        if (hour >= 5  && hour < 12){
            System.out.print("Доброе утро");
        }
        else if (hour >=12 && hour < 18) {
            System.out.print("Добрый день");
        }
        else if (hour >=18 && hour < 24) {
            System.out.print("Добрый вечер");
        }
        else if (hour >=0 && hour < 5) {
            System.out.print("Доброй ночи");
        }
       /* System.out.println("Hello, world!");
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().getHour());
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя:");
        String sName = scn.nextLine();
        scn.close();*/
        System.out.println(", "+sName);

        int[] arr = {1,1,0,1,1,1};
        int result = Array.MaxCnt(arr);
        System.out.println(result);
    }
}


class Array {
    public static int MaxCnt(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount ++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    System.out.println(num + " - " +currentCount + " - " + maxCount);
                }

            }
            else currentCount = 0;
            System.out.println(num + " - " +currentCount + " - " + maxCount);
        }
        return maxCount;
    }
}
