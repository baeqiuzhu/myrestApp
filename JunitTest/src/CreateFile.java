import org.junit.rules.*;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import java.io.File;
import java.io.IOException;

public class CreateFile implements TestRule{
	
	public CreateFile(String path,String fileName){
		
		//path=dir
		String newpath = path;
		File f = new File(newpath);
		if(!f.exists()){
		  f.mkdirs();
		} 
		// fileName=filename and it's type
		
		String newFileName = fileName;
		File file = new File(f,newFileName);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
		
		public Statement apply(final Statement base,final Description desciption){
			System.out.println("Step2:New file is created");
			return base;
				}
}