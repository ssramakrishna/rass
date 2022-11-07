package generic;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class FileLib 
{
	public String getproperty(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/ram.property");
		Properties p = new Properties();
		p.load(fis);
		String data = getproperty(key);
		return data;
	}
}
