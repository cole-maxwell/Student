package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw04.Student.StudentStatus;

public class StudentTest {
	
	@Test
	public void verifyInStateStudent()
	{
		Student s = Student.createInStateStudent("Lamar Jackson", "M&T Bank Stadium, Baltimore");
		StudentStatus expected = StudentStatus.INSTATE;
		StudentStatus actual = s.getStatus();
		assertTrue(s instanceof Student);
		assertEquals(expected, actual);
	}
	
	@Test
	public void verifyOutStateStudent()
	{
		Student s = Student.createOutStateStudent("Alvin Kamera", "Mercedes-Benz Superdome, New Orleans", 28);
		StudentStatus expected = StudentStatus.OUTSTATE;
		StudentStatus actual = s.getStatus();
		assertTrue(s instanceof Student);
		assertEquals(expected, actual);

	}

	@Test
	public void verifyIntlStudent()
	{
		Student s = Student.createIntlStudent("Daniel Theis", "TD Garden, Boston", 27, "Germany");
		StudentStatus expected = StudentStatus.INTL;
		StudentStatus actual = s.getStatus();
		assertTrue(s instanceof Student);
		assertEquals(expected, actual);

	}
}