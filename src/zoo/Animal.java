package zoo;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private Integer years;

    public void eat(){};
    public void go(){};
    public void sleep(){};

    public Animal(String name, Integer years) {
        setYears(years);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public Integer getYears() {
        return years;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty())
            this.name = name;
    }

    public void setYears(Integer years) {
        if(years != null && years > 0)
            this.years = years;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getName().equals(animal.getName()) && getYears().equals(animal.getYears());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYears());
    }
}
