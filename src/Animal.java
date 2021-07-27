public class Animal
{
    private int age;
    private double weight;
    private boolean running;
    private boolean eating;

    public Animal()
    {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isEating() {
        return eating;
    }
}
