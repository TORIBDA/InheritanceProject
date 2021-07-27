public class Felidae extends Animal
{
    private String UNIQUE_BEHAVIOR = "Producing the meowing meowing sound";

    public Felidae()
    {

    }

    public String getUNIQUE_BEHAVIOR()
    {
        return this.UNIQUE_BEHAVIOR;
    }

    public void produceMeowSound()
    {
        System.out.println("Meow meow");
    }
}
