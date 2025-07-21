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
        System.out.print("Результат игры: ");
        if (randomItemVasya.equals(randomItemPeter)) {
            //System.out.println("Результат игры: Ничья");
            System.out.println("Ничья");
        } else if ((randomItemVasya.equals("Бумага") && randomItemPeter.equals("Камень")) ||
                (randomItemVasya.equals("Ножницы") && randomItemPeter.equals("Бумага")) ||
                (randomItemVasya.equals("Камень") && randomItemPeter.equals("Ножницы"))) {
            //System.out.println("Результат игры: выиграл Вася");
            System.out.println("выиграл Вася");
        } else {
            //System.out.println("Результат игры: выиграл Петя");
            System.out.println("выиграл Петя");
        }
    }
}


