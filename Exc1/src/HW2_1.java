import java.util.Random;

public class HW2_1 {
    public static void main(String[] args) {
        String[] items = {"Камень", "Ножницы", "Бумага"};

        Random randVasya = new Random();
        Random randPeter = new Random();
        String randomItemVasya = items[randVasya.nextInt(items.length)];
        String randomItemPeter = items[randPeter.nextInt(items.length)];
        System.out.println("У Васи - " + randomItemVasya);
        System.out.println("У Пети - " + randomItemPeter);
        if (randomItemVasya.equals(randomItemPeter)) {
            System.out.println("Результат игры: Ничья");
        } else if ((randomItemVasya == "Бумага" && randomItemPeter == "Камень") ||
                (randomItemVasya == "Ножницы" && randomItemPeter == "Бумага") ||
                (randomItemVasya == "Камень" && randomItemPeter == "Ножницы")) {
            System.out.println("Результат игры: выиграл Вася");
        } else {
            System.out.println("Результат игры: выиграл Петя");
        }
    }
}


