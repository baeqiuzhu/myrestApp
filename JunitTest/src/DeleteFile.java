import java.io.File;

import org.junit.rules.*;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DeleteFile implements TestRule{
	
	public DeleteFile(String test){
			
	File file = new File(test);


	if(file.isFile() && file.exists()){

	file.delete();

	System.out.println("Succefully delete junit410.txt");

	}else{
	System.out.println("junit410.txt do not exist.create a new one");

	}
	}


	
	public Statement apply(final Statement base,final Description desciption){
		System.out.println("Step1:Old file is deleted");	
		return base;
		}

}
