package transport;
import java.time.LocalDate;

public class Train extends Transport{

    private final String fuels = "Дизель";
    private Double traverCost;
    private Integer travelTime;
    private String departureStation;
    private String arrivalStation;
    private Integer wagonNumber;

    public Train(Integer productionYear, String productionCountry,
                 String brand, String model, String color,
                 Integer maxSpeed, Double traverCost, Integer travelTime,
                 String departureStation, String arrivalStation, Integer wagonNumber) {
        super(productionYear, productionCountry,"Поезд " + brand, model, color, maxSpeed);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setWagonNumber(wagonNumber);
        setTraverCost(traverCost);
        setTravelTime(travelTime);
    }

    public void setTraverCost(Double traverCost) {
        if(traverCost <= 0 || traverCost == null)
            traverCost = 100.0;

        this.traverCost = traverCost;
    }

    public void setTravelTime(Integer travelTime) {
        if(travelTime < 0 || travelTime == null)
            travelTime = 8;

        this.travelTime = travelTime;
    }

    public void setDepartureStation(String departureStation) {
        if(departureStation == null || departureStation.isEmpty())
            departureStation = "default";

        this.departureStation = departureStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if(arrivalStation == null || arrivalStation.isEmpty())
            arrivalStation = "default";

        this.arrivalStation = arrivalStation;
    }

    public void setWagonNumber(Integer wagonNumber) {
        if(wagonNumber <= 0 || wagonNumber == null)
            wagonNumber = 4;

        this.wagonNumber = wagonNumber;
    }

    public Double getTraverCost() {
        return traverCost;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public Integer getWagonNumber() {
        return wagonNumber;
    }

    @Override
    public String toString() {
        return "Train{" +
                "productionYear=" + super.getProductionYear() +
                ", productionCountry='" + super.getProductionCountry() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", traverCost=" + traverCost +
                ", travelTime=" + travelTime +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", wagonNumber=" + wagonNumber +
                '}';
    }

    public void refill(String fuel){

        boolean checkRefueling = fuels.equalsIgnoreCase(fuel);

        if(checkRefueling){
            System.out.println("Заправка произведена");
        }
        else {
            System.out.println("Данный вид топлива не подходит для заправки");
        }
    }
}
