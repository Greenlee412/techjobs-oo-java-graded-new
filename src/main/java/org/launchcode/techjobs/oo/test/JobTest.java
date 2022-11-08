package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.launchcode.techjobs.oo.Employer;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1 = new Job();
    Job job2 = new Job();

    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    Job jobToString = new Job();

    @Test
    public void testSettingJobId() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job job2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1.getId(), job2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(job3.getName().toString(), "Product tester");
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(),"Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(),"Persistence");
    }
//    The following test should return false. IT DOES. Do I leave the failing test in for grading?
    @Test
    public void testJobsForEquality() {
//        assertNotEquals("IDs are equal", job1.getId() == job2.getId());
        assertNotEquals(job1, job2);
        assertFalse(job1.equals(job2));
        }



@Test
    public void testToStringStartsAndEndsWithNewLine() {
    String jobString = job.toString();


//            "\n" +
//                    "ID: " + job.getId() + "\n" +
//                    "Name: " + job.getName() + "\n" +
//                    "Employer: " + job.getEmployer()+ "\n" +
//                    "Location: " + job.getLocation() + "\n" +
//                    "Position Type: " + job.getPositionType() + "\n" +
//                    "Core Competency: " + job.getCoreCompetency() + "\n";
assertEquals(jobString.charAt(0), '\n');
assertEquals((jobString.charAt(jobString.length()-1)), '\n');

//    assertEquals(jobString.charAt(0), jobString.charAt(jobString.length()-1));

    }

@Test
    public void testToStringContainsCorrectLabelsAndData() {
    String jobString =
            "\n" +
                    "ID: " + job.getId() + "\n" +
                    "Name: " + job.getName() + "\n" +
                    "Employer: " + job.getEmployer()+ "\n" +
                    "Location: " + job.getLocation() + "\n" +
                    "Position Type: " + job.getPositionType() + "\n" +
                    "Core Competency: " + job.getCoreCompetency() + "\n";

assertEquals(job.toString(), jobString);
}

@Test
    public void testToStringHandlesEmptyField() {
    Job emptyField = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String jobString =
            "\n" +
                    "ID: " + emptyField.getId() + "\n" +
                    "Name: " + emptyField.getName() + "\n" +
                    "Employer: " + emptyField.getEmployer() + "\n" +
                    "Location: " + emptyField.getLocation() + "\n" +
                    "Position Type: " + emptyField.getPositionType() + "\n" +
                    "Core Competency: " + emptyField.getCoreCompetency() + "\n";

    assertEquals(emptyField.toString(), jobString);
}


    }

