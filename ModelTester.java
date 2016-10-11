
/**
 * Write a description of class ModelTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModelTester
{
    public static void main(String[]args)
    {
        Model m = new Model();
        Model m1 = new Model("Petra", "Wadraczkowa", 5.9, true, false, true);
        m.displayModel();
        m1.displayModel();
    }
}
