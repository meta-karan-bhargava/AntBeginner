import java.util.Properties;
import java.util.Scanner;
public class SayHello
{
	public static String name = "";
	public static void main(String[] args)
	{
		String testProp = "name.property";
        Properties sysProps = System.getProperties();
		System.out.println("Hello "+ sysProps.getProperty(testProp));
	}
}