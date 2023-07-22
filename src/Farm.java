import java.util.Arrays;

public class Farm {
private String address;
private String ownerName;
private Cow[]cows;
private Hjrse[]hjrses;
private Sheep[]sheep;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hjrse[] getHjrses() {
        return hjrses;
    }

    public void setHjrses(Hjrse[] hjrses) {
        this.hjrses = hjrses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Farm(String address, String ownerName, Cow[] cows, Hjrse[] hjrses, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.hjrses = hjrses;
        this.sheep = sheep;

    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +"\n"+
                ", ownerName='" + ownerName + '\'' +"\n"+
                ", cows=" + Arrays.toString(cows) +"\n"+
                ", hjrses=" + Arrays.toString(hjrses) +"\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                '}';
    }
}



