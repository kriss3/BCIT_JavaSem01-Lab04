
/**
 * Session 4 Take Home Lab (Model/ModelTester project) <br>
 * Class: Model Class for Lab4 COMP 1409
 * 
 * @author Krzysztof Szczurowski
 * @date 10/16/2016
 * @version 1.1 *more in Readme.txt*
 * @since 10/10/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2078019/View
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
    private boolean doesWorkout;
    private boolean canTravel;
    private boolean doesSmoke;
    
    /**
     * Public parameterless Model constructor
     * Initializing all local variables to specified, default values
     * Increments each newly created object of a type Model
     */
    public Model()
    {
        this.name = "Robin";
        this.surname = "Wright";
        this.height = 212;
        this.doesWorkout = true;
        this.canTravel = true;
        this.doesSmoke = true;
        
        employeeNumber = employeeCounter++;
    }
    
    /**
     * Public custom constructor. Takes six parameters described below: <br>
     * @param name as String;
     * @param surname as String;
     * @param height as double;
     * @param doesWorkout as boolean;
     * @param canTravel as boolean;
     * @param doesSmoke as boolean;
     * 
     * Increments each newly created object of type Model <br>
     * Uses mutators to set values of instance variables
     */
    public Model(String name, String surname, double height, boolean doesWorkout, 
                 boolean canTravel, boolean doesSmoke)
    {
       setName(name);
       setSurname(surname);
       setHeight(height);
       doesWorkout(doesWorkout);
       canTravel(canTravel);
       doesSmoke(doesSmoke);
       
       employeeNumber = employeeCounter++;
    }
    
    //Properties
    /**
     * Public getter for Employee Number
     * @return current employee number as Integer
     */
    public int getEmployeeNumber()
    {
        return this.employeeNumber;
    }
    
    /**
     * Public static getter for EmployeeCounter.<br>
     * Takes no parameter;
     * @return returns Employee counter as interger;
     */
    public static int getEmployeeCounter()
    {
        return employeeCounter;
    }
    
    /**
     * Public getter for Employee Number <br>
     * Does not take any parameter;
     * @return Name as String;
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Public setter for Model's name. <br>
     * Takes value as a new Name to setup. <br>
     * It does not return value.
     * @param takes value as String
     */
    public final void  setName(String value)
    {
        this.name = value.equals("") || value == null ? "Robin" : value; 
    }
    
    /**
     * Public getter for Surname <br>
     * Does not take any parameter;
     * @return returns Surname as String
     */
    public String getSurname()
    {
        return this.surname;
    }
    
    /**
     * Publuc setter for Model's Surname. <br>
     * Takes value as a new Surname to setup; <br>
     * It does not return value.
     * @param takes value as String
     */
    public final void  setSurname(String value)
    {
        this.surname = value.equals("") || value == null ? "Wright" : value; 
    }
    
    /**
     * Public getter for model Height <br>
     * Does not take any parameter;
     * @return returns Height as double
     */
    public double getHeight()
    {
        return this.height;
    }
    
    /**
     * Public setter for Model's Height. <br>
     * Takes value as a new Height to setup <br>
     * It does not return value.
     * @param takes value as String
     */
    public final void  setHeight(double value)
    {
        this.height = value > 182.3 || value < 213.4  ? value : 5.8; 
    }
    
    /**
     * Public getter for model Workout flag <br>
     * Does not take any parameter;
     * @return returns Workout flag as boolean
     */
    public boolean doesWorkout()
    {
        return this.doesWorkout;
    }
    
    /**
     * Public setter for model Workout flag <br>
     * Takes value as a new doesWorkout flat to set <br>
     * It does not return value.
     * @param takes value doesWorkout as boolean
     */
    public final void doesWorkout(boolean value)
    {
        this.doesWorkout = value;
    }
    
    /**
     * Public getter for model Travel flag <br>
     * Does not take any parameter;
     * @return returns canTravel flag as boolean
     */
    public boolean canTravel()
    {
        return this.canTravel;
    }
    
    /**
     * Public setter for Model's Trabel flag <br>
     * Takes value as a new canTravel flag to set <br>
     * It does not return value.
     * @param takes value canTravel as boolean
     */
    public final void canTravel(boolean value)
    {
        this.canTravel = value;
    }
    
    /**
     * Public getter for model Smoke flag <br>
     * Does not take any parameter;
     * @return returns doesSmoke flag as boolean
     */
    public boolean doesSmoke()
    {
        return this.doesSmoke;
    }
    
    /**
     * Public setter for model Smoke flag <br>
     * Takes value as a new Smoke flag to set <br>
     * It does not return value.
     * @param takes value canSmoke as boolean
     */
    public final void doesSmoke(boolean value)
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
    
    /**
     * Public method that calculates the Model's hourly rate; <br>
     * It does not take any parameter; <br>
     * Evaluates hourly rate and adjust based on Travel, Workout and Smoke preferences.
     * @return returns calculated hourly rate as double
     */
    public double calculateHourlyRate()
    {
        double hireRate = BASE_RATE ;
        
        if(doesWorkout && (height >= TALL_CM))
        {
            hireRate += TALL_FIT_BONUS;
        }
        
        if(canTravel)
        {
            hireRate += TRAVEL_BONUS;
        }
        
        if(doesSmoke)
        {
            hireRate -= SMOKER_DEDUCTION;
        }
        
        return hireRate;
    }
    
    /**
     * Public method that display String with representation of class Model
     * It does not take any parameter; <br>
     * @return returns text representation of Model Class as String;
     */
    public String toString()
    {
        return String.format("Name: " + name +
                             ";Last Name: " + surname + 
                             ";Height: " + height + "cm" +
                             ";WorkOut[?]: " + doesWorkout +
                             ";Travel[?]: " + canTravel +
                             ";Smokes[?]:" + doesSmoke);
    }
    
    /**
     * Public method that prints the details of the class Model;
     * It does not take any parameter; <br>
     * It does not return any value;
     */
    public void displayModel()
    {
        System.out.print("Name:\t\t" + name +  "\nSurname:\t" + surname + "\nHeight:\t\t" + height + "cm" +
        "\nWorkOut[?]:\t" + doesWorkout + "\nTravel[?]: \t" + canTravel + "\nSmokes[?]:\t" + doesSmoke);
    }
}
