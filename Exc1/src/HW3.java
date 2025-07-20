import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        //Integer vStone = 0;
        //Integer vScissors = 1;
        //Integer vPaper = 2;
        String[] items = {"Камень", "Ножницы", "Бумага"};

        Random rand = new Random();
        Random rand2 = new Random();
        Integer cnt = rand.nextInt(items.length);
        Integer cnt2 = rand2.nextInt(items.length);
        //String randomItem = items[rand.nextInt(items.length)];
        String randomItemVasya = items[cnt];
        String randomItemPeter = items[cnt2];
        System.out.println("У Васи - " + randomItemVasya);
        System.out.println("У Пети - " + randomItemPeter);
        if (randomItemVasya == randomItemPeter) {
            System.out.println("Результат игры: ничья");
        } else if ((randomItemVasya == "Бумага" && randomItemPeter == "Камень") ||
                (randomItemVasya == "Ножницы" && randomItemPeter == "Бумага") ||
                (randomItemVasya == "Камень" && randomItemPeter == "Ножницы")) {
            System.out.println("Результат игры: выиграл Вася");
        } else {
            System.out.println("Результат игры: выиграл Петя");
        }

    }
}

