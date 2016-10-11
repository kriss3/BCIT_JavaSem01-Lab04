
/**
 * Base Model Class for Lab4 COMP 1409
 * 
 * @author Krzysztof Szczurowski
 * @version 1.0
 */
public class Model
{
    public static final double IN_PER_FOOT = 12.0;
    public static final double CM_PER_INCH = 2.54;
    public static final double LBS_PER_KILO = 2.2;
    public static final double BASE_RATE = 300.00;
    public static final double TALL_CM = 203.2;
    public static final double TALL_FIT_BONUS = 50.00;
    public static final double TRAVEL_BONUS = 40.00;
    public static final double SMOKER_DEDUCTION = 150.00;
    
    private String name;
    private String surname;
    private double height;
    private boolean doesWorkOut;
    private boolean canTravel;
    private boolean doesSmoke;
    
    public Model()
    {
        this.name = "Robin";
        this.surname = "Wright";
        this.height = 5.8;
        this.doesWorkOut = true;
        this.canTravel = true;
        this.doesSmoke = true;
    }
    
    public Model(String name, String surname, double height, boolean doesWorkOut, 
                 boolean canTravel, boolean doesSmoke)
    {
       setName(name);
       setSurname(surname);
       setHeight(height);
    }
    
    //Properties
    public String getName()
    {
        return this.name;
    }
    
    public final void  setName(String value)
    {
        this.name = value.equals("") || value == null ? "Robin" : value; 
    }
    
    public String getSurname()
    {
        return this.name;
    }
    
    public final void  setSurname(String value)
    {
        this.name = value.equals("") || value == null ? "Wright" : value; 
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public final void  setHeight(double value)
    {
        this.height = value > 182.3 || value < 213.4  ? value : 5.8; 
    }
    
    public boolean DoesWorkOut()
    {
        return this.doesWorkOut;
    }
    
    public final void DoesWorkOut(boolean value)
    {
        this.doesWorkOut = value;
    }
    
    public boolean CanTravel()
    {
        return this.canTravel;
    }
    
    public final void CanTravel(boolean value)
    {
        this.canTravel = value;
    }
    
    public boolean DoesSmoke()
    {
        return this.doesSmoke;
    }
    
    public final void DoesSmoke(boolean value)
    {
        this.doesSmoke = value;
    }
    
    public String convertHeightToFeetAndInches()
    {
        return ""; 
    }
    
    public int calculateHourlyRate()
    {
        return -1;
    }
    
    
    public void displayModel()
    {
        System.out.print("Name:\t\t" + name +  "\nSurname:\t" + surname + "\nHeight:\t\t" + height + 
        "\nWork Out:\t" + doesWorkOut + "\nTravel[?]: \t" + canTravel + "\nSmoke:\t\t" + doesSmoke);
    }
}
