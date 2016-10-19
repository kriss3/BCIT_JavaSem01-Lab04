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
        model1.displayModel();
        
        System.out.println("Model's Height in Feet and Inches: " + model2.convertHeightToFeetAndInches());
        model2.toString();
        
        model2.displayModel();
        
        Model.getEmployeeCounter();
    }
}
