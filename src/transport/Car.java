package transport;

import java.time.LocalDate;

public class Car extends Transport{

    private final String[] fuels = {"бензин","дизель","электричество"};
    private Float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats ;
    private String rubberType;
    private Key key;
    private Insurance insurance;

    public Car(Integer productionYear, String productionCountry, String brand,
               String model, String color, Integer maxSpeed, Float engineVolume,
               String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String rubberType){

        super(productionYear, productionCountry, brand, model, color, maxSpeed);

        if(bodyType == null || bodyType.isEmpty())
            this.bodyType = "default";
        else
            this.bodyType = bodyType;

        if(numberOfSeats == null || numberOfSeats < 0)
            this.numberOfSeats = 4;
        else
            this.numberOfSeats = numberOfSeats;

       setEngineVolume(engineVolume);
       setTransmission(transmission);
       setRegistrationNumber(registrationNumber);
       setRubberType(rubberType);
       setKey(null);
       setInsurance(null);
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubberType() {
        return rubberType;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setKey(Key key) {
        if(key == null)
            key = new Key(false,false);

        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        if(insurance == null)
            insurance = new Insurance(null, 10_000, null);

        this.insurance = insurance;
    }

    public void setEngineVolume(Float engineVolume) {
        if(engineVolume == null || engineVolume < 0)
            this.engineVolume = 1.5f;
        else
            this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if(transmission == null || transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null || registrationNumber.isEmpty()
                || !registrationNumber.matches("^[a-zA-Z][0-9]{3}[a-zA-Z]{2}[0-9]{3}$"))
            this.registrationNumber = "х000хх000";
        else
            this.registrationNumber = registrationNumber;
    }

    public void setRubberType(String rubberType) {
        if(rubberType == null || rubberType.isEmpty())
            this.rubberType = "летняя";
        else
            this.rubberType = rubberType;
    }

    public void changeRubberType() {
        if(rubberType.equals("летняя"))
            this.rubberType = "зимняя";
        else
            this.rubberType = "летняя";
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + super.getProductionYear() +
                ", productionCountry='" + super.getProductionCountry() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", rubberType='" + rubberType + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void refill(String fuel){
        boolean checkRefueling = false;

        for(String i : fuels){
            if (i.equalsIgnoreCase(fuel)) {
                checkRefueling = true;
                break;
            }
        }

        if(checkRefueling){
            System.out.println("Заправка произведена");
        }
        else {
            System.out.println("Данный вид топлива не подходит для заправки");
        }
    }

    public static class Key{

        private final boolean remoteRun;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess) {
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRun(){
            return remoteRun;
        }

        public boolean isWithoutKeyAccess(){
            return withoutKeyAccess;
        }
    }

    public static class Insurance{

        private final LocalDate expireDate;
        private final Integer cost;
        private final String number;

        public Insurance(LocalDate expireDate, Integer cost, String number) {
            if(expireDate == null ){
                expireDate = LocalDate.now().plusYears(1);
            }
            this.expireDate = expireDate;

            if(cost <= 0){
                cost = 10_000;
            }
            this.cost = cost;

            if(number.isEmpty() || number == null){
                number = "XXXYYYZZZ";
            }
            this.number = number;
        }

        private boolean isExpired(){
            return expireDate.isAfter(LocalDate.now());
        }

        public void printExpired(){
            if(!isExpired()){
                System.out.println("Надо менять страховку");
            }
        }

        private boolean isNumberCheck(){
            return number.length() == 9;
        }

        public void printCheckNumber(){
            if(!isNumberCheck()){
                System.out.println("Номер страховки некорректный");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public Integer getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}
