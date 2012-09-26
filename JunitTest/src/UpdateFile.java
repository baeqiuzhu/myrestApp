import org.junit.rules.*;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class UpdateFile implements TestRule{
	
	private final String string;

	public UpdateFile(final String string) {
		this.string = string;
	}
	
	public Statement apply(final Statement base,final Description desciption){
			System.out.println("Step3:write 'ip=192.168.1.1' into file");
			return base;
		}
	


}
