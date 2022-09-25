package warehouse.delivery;

import warehouse.enums.Destination;
import warehouse.enums.PackageType;

import java.util.ArrayList;

public class Delivery {
    private String destination;
    private String packageType;
    private int price;
    private ArrayList<Integer> deliveryType = new ArrayList<>();

    public Delivery(Destination destination, PackageType packageType) {
        this.destination = destination.toString();
        this.packageType = packageType.toString();
        this.price = packageType.getPackagePrice();
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Integer> getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(ArrayList<Integer> deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "destination='" + destination + '\'' +
                ", packageType='" + packageType + '\'' +
                ", price=" + price +
                '}';
    }
}