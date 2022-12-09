package transport;

public abstract class Transport {
    private final Integer productionYear;
    private final String productionCountry;
    private final String brand;
    private final String model;
    private String color;
    private Integer maxSpeed;

    public Transport(Integer productionYear, String productionCountry, String brand, String model, String color, Integer maxSpeed) {

        if(brand == null || brand.isEmpty())
            this.brand = "default";
        else
            this.brand = brand;

        if(model == null || model.isEmpty())
            this.model = "default";
        else
            this.model = model;

        if(productionYear == null || productionYear < 0)
            this.productionYear = 2000;
        else
            this.productionYear = productionYear;

        if(productionCountry == null || productionCountry.isEmpty())
            this.productionCountry = "default";
        else
            this.productionCountry = productionCountry;

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty())
            this.color = "Белый";
        else
            this.color = color;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if(maxSpeed <= 0)
            this.maxSpeed = 100;
        else
            this.maxSpeed = maxSpeed;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract void refill(String fuel);
}
