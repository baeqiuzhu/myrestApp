import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;


public class NorOutput {
	@Rule
	public UpdateFile rule = new UpdateFile("without chain");

	@Test
	public void example() {
		System.out.println("test started");
		assertTrue(true);
	}
}
