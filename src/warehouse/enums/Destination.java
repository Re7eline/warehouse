package warehouse.enums;

public enum Destination {
    CITY(20),
    REGION(CITY.deliveryPrice + 10),
    COUNTRY(CITY.deliveryPrice * 2);
    private int deliveryPrice;
    Destination(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}
