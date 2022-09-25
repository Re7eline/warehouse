package warehouse.enums;

public enum PackageType {
    PLASTICBOX( 10),
    PAPERBOX (PLASTICBOX.packagePrice*2),
    WOODBOX(PLASTICBOX.packagePrice*3);
    private int packagePrice;

    PackageType(int packagePrice) {
        this.packagePrice = packagePrice;
    }

    public int getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(int packagePrice) {
        this.packagePrice = packagePrice;
    }
}
