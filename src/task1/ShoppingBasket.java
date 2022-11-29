package task1;

public class ShoppingBasket {
    public static Items itemList = new Items();
    private Integer totalPrice;

    public ShoppingBasket() {
        totalPrice = 0;
    }

    public void addToBasket(String item) {
        setTotalPrice(getTotalPrice()+ itemList.getPrice(item));
    }

    public Integer getBill() {
        return getTotalPrice();
    }

    public  Integer getTotalPrice() {
        return totalPrice;
    }

    public  void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}