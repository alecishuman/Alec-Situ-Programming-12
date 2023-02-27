public class RockPlanet extends Planet{
    boolean habitable;

    public RockPlanet(int orbitTime, String designation, boolean habitable) {
        super(orbitTime, designation);
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "RockPlanet{" +
                "orbitTime=" + orbitTime +
                ", moons=" + moons +
                ", designation='" + designation + '\'' +
                ", habitable=" + habitable +
                '}';
    }
}
