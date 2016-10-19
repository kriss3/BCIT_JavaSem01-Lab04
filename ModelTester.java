/**
 * Session 4 Take Home Lab (Model/ModelTester project)
 * Class: ModelTester Class for Lab4 COMP 1409
 * 
 * @author Krzysztof Szczurowski
 * @date 10/16/2016
 * @version 1.1 //more in Readme.txt
 * @since 10/10/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2078019/View
 */
public class ModelTester
{
    /**
     *  Main, startup method to invoke Model class and call its public methods.
     */
    public static void main(String[]args)
    {
        Model model1 = new Model();
        Model model2= new Model("Joanna", "Krupa", 193, true, false, true); 
        
        System.out.println("Model's Height in Feet and Inches: " + model1.convertHeightToFeetAndInches());
        System.out.println("Model 1 hourly rate: " + model1.calculateHourlyRate());
        model1.displayModel();
               
        System.out.println("\n");
        System.out.println("Model's Height in Feet and Inches: " + model2.convertHeightToFeetAndInches());
        System.out.println("Model 2 hourly rate: " + model2.calculateHourlyRate());
        model2.displayModel();
        
        System.out.println("\n");
        System.out.println("Total number of Model objects created: " + Model.getEmployeeCounter());
    }
}
