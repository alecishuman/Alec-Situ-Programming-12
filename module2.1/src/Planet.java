import java.util.Objects;

public class Planet {
    private String designation;

    private double massKg;

    private double orbitEarthYears;

    private PlanetType type;



    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(designation, planet.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designation);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "designation='" + designation + '\'' +
                ", type=" + type +
                '}';
    }
}
