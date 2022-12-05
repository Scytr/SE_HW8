package tasks.task1;

public class Main {
    public static void main(String[] args) {
        //debuggingExercise1_2();
        debuggingExercise3();
    }

    public static  void debuggingExercise1_2() {
        ShoppingBasket johnShoppingBasket = new ShoppingBasket();
        johnShoppingBasket.addToBasket("Bread");
        johnShoppingBasket.addToBasket("Water");
        System.out.println("john bill : " + johnShoppingBasket.getBill());

        ShoppingBasket saraShoppingBasket = new ShoppingBasket();
        saraShoppingBasket.addToBasket("Pasta");
        saraShoppingBasket.addToBasket("Milk");
        System.out.println("sara bill : "+ saraShoppingBasket.getBill());
    }

    public static  void debuggingExercise3() {
        MonthPoem myMonth = new MonthPoem(Month.MAY);
        myMonth.PrintPoem();
    }
}