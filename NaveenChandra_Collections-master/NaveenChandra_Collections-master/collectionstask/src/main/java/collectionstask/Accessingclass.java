package collectionstask;
import java.lang.instrument.Instrumentation;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class Accessingclass {
	 public  static Instrumentation instrumentation;
	private static final org.apache.logging.log4j.Logger naveen =LogManager.getLogger(Accessingclass.class);
	public static void main(String args[])
	{
		Scanner ama=new Scanner(System.in);
		ImplementationList<Object> am=new ImplementationList<Object>();
		while(true)
		{
			amaresh.info("Select the options 1.print the list 2.add elements 3.delete paartular position 4.fetch data at position 5.break");
			int s=ama.nextInt();
			if(s==1)
			{
				
				naveen.info(am);
				
			}
			else if(s==2)
			{
				amaresh.info("Enter the how many elements u want to add");
				int w=ama.nextInt();
				for(int i=0;i<w;i++)
				{
					am.adding(ama.next());
					
				}
				
				
			}
			else if(s==3)
			{
				amaresh.info("Enter the position to delete at particualar index");
				int g=ama.nextInt();
				
				
				am.remove(g);
				
			}
			else if (s==4)
			{
				amaresh.info("Enter the position to fetch the data or acess it");
				int g1=ama.nextInt();
				Object y1=am.getting(g1);
				amaresh.info(y1);
				
				
			}
			else
			{
				break;
			}
			
			
		}
	}
}
