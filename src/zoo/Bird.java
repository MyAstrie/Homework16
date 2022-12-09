package zoo;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String area;

    public Bird(String name, Integer years, String area) {
        super(name, years);
        setArea(area);
    }

    public void hunt(){};

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area != null && !area.isEmpty())
            this.area = area;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Bird{" +
                "area='" + area + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return getArea().equals(bird.getArea()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea());
    }
}
