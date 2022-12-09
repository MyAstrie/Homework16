package zoo;

import java.util.Objects;

public class FlyingBird extends Bird{
    private String movementType;

    public void fly(){};

    public FlyingBird(String name, Integer years, String area, String movementType) {
        super(name, years, area);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if(movementType == null || movementType.isEmpty())
            this.movementType = "летать";
        else
            this.movementType = movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlyingBird)) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return getMovementType().equals(that.getMovementType()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }

    @Override
    public String toString() {
        return super.toString() +
                "FlyingBird{" +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
