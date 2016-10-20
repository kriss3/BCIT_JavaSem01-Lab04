

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ModelTest
{
    /**
     * Default constructor for test class ModelTest
     */
    public ModelTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestThatHourlyRateIs300()
    {
        Model model1 = new Model("Eva", "Longoria", 180, false, false, false);
        assertEquals(300.0, model1.calculateHourlyRate(), 0.1);
    }

    @Test
    public void TestThatTallFitModelGetsABonus()
    {
        Model model1 = new Model("Eva", "Longoria", 215, true, false, false);
        assertEquals(350.0, model1.calculateHourlyRate(), 0.1);
        assertEquals(350.0, model1.calculateHourlyRate(), 0.1);
        model1.displayModel();
    }

    @Test
    public void TestThatModelThatSmokesLooses150()
    {
        Model model1 = new Model("Eva", "Longoria", 180, false, false, true);
        assertEquals(150.0, model1.calculateHourlyRate(), 0.1);
    }

    @Test
    public void TestThatTravelModelGetsBonus()
    {
        Model model1 = new Model("Eva", "Longoria", 180, false, true, false);
        assertEquals(340.0, model1.calculateHourlyRate(), 0.1);
        model1.displayModel();
    }
}




