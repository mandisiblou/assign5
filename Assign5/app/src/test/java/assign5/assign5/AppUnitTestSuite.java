package assign5.assign5;

/**
 * Created by 211014486 on 4/17/2016.
 */

import assign5.assign5.Factories.AddrecTest;
import assign5.assign5.Factories.CodeTest;
import assign5.assign5.Factories.DepartmentTest;
import assign5.assign5.Factories.PersonTest;
import assign5.assign5.Factories.QuestionsTest;
import assign5.assign5.Factories.ResultsTest;
import assign5.assign5.Factories.StaffsTest;
import assign5.assign5.Factories.StudentTest;
import assign5.assign5.Factories.TestsTest;
import assign5.assign5.Factories.VenueTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        PersonTest.class,
        ResultsTest.class,
        QuestionsTest.class,
        AddrecTest.class,
        DepartmentTest.class,
        CodeTest.class,
        VenueTest.class,
        TestsTest.class,
        StaffsTest.class})
public class AppUnitTestSuite {}
