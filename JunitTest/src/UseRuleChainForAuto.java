import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

public class UseRuleChainForAuto {
		@Rule
		public TestRule chain= 
				RuleChain.outerRule(new UpdateFile("ip=192.168.1.1")).
				around(new CreateFile("d:/test","junit410.txt")).
				around(new DeleteFile("d:/test/junit410.txt"));


		@Test
		public void example() {
			System.out.println("test started");
			assertTrue(true);
		}
}	


