public abstract class Abstractanimal {
    private String nickName;
    private double weight;
    private int age;
    private String gender;

    public Abstractanimal(String nickName, double weight, int age, String gender) {
        this.nickName = nickName;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

