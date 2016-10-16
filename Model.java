
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
    
    private int employeeNumber;
    private static int employeeCounter = 0;
    
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
        this.height = 212;
        this.doesWorkOut = true;
        this.canTravel = true;
        this.doesSmoke = true;
        
        employeeCounter++;
        employeeNumber = employeeCounter;
    }
    
    public Model(String name, String surname, double height, boolean doesWorkOut, 
                 boolean canTravel, boolean doesSmoke)
    {
       setName(name);
       setSurname(surname);
       setHeight(height);
       
       employeeCounter++;
       employeeNumber = employeeCounter;
    }
    
    //Properties
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    public static int getEmployeeCounter()
    {
        return employeeCounter;
    }
    
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
    
    
    /**
     * Public method to convert Model's height in cm to Feet and Inches. <br>
     * Source to help me out with formula: http://www.manuelsweb.com/ft_in_cm.htm <br>
     * It does not take any parameters <br>
     * @return height expressed in Feet and Inches as String
     */
    public String convertHeightToFeetAndInches()
    {
        //convert to Inches
        double magicNumber = 0.3937008;
        double feet = (height * magicNumber)/12;
        //1 inch  = 2.54 cm
        //To express Feet in Inches multiple feet value by 12
        double inches = (height/2.54) - ((int)feet * 12);
        
        return String.format((int)feet + " feet " + String.format("%.1f", inches) + " inches"); 
    }
    
    public int calculateHourlyRate()
    {
        double hRate = BASE_RATE ;
        
        if(doesWorkOut && (height >= TALL_CM))
        {
            hRate += TALL_FIT_BONUS;
        }
        
        if(canTravel)
        {
            hRate += TRAVEL_BONUS;
        }
        
        if(doesSmoke)
        {
            hRate -= SMOKER_DEDUCTION;
        }
        
        //possible loss of decimal part, funciton returns int but BASE_RATE is double      
        return (int)hRate;
    }
    
    public String toString()
    {
        return String.format("Name: " + name +
                             ";Last Name: " + surname + 
                             ";Height: " + height + "cm" +
                             ";WorkOut[?]: " + doesWorkOut +
                             ";Travel[?]: " + canTravel +
                             ";Smokes[?]:" + doesSmoke);
    }
    
    public void displayModel()
    {
        System.out.print("Name:\t\t" + name +  "\nSurname:\t" + surname + "\nHeight:\t\t" + height + "cm" +
        "\nWorkOut[?]:\t" + doesWorkOut + "\nTravel[?]: \t" + canTravel + "\nSmokes[?]:\t" + doesSmoke);
    }
}
