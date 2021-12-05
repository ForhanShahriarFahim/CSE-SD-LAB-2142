import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList
{
	public static void main(String[] args)
	{

		//Check arguments
		//if the arguments is not given or given string's length is greater than 1 then it will not terminate

		if(args.length == 0 || args.length > 1)
		{
			System.out.println("Program terminated.\nPlease Enter a valid argument");
			return;
		}
		else if(args[0].equals("a"))
		{
			System.out.println("Loading data ...");
			try
			{
<<<<<<< HEAD
				BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String line = fileStream.readLine();
				String input[] = line.split(",");
=======
<<<<<<< HEAD
				String reader = loadData("students.txt");
				String input[] = reader.split(",");
>>>>>>> task4
				for(String output : input)
=======
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
				String r = s.readLine();
				String i[] = r.split(",");			
				for(String j : i)
>>>>>>> parent of 68ae1fb (Task 3 completed)
				{
					System.out.println(j);
				}
			}
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r"))
		{
			System.out.println("Loading data ...");
			try
			{
<<<<<<< HEAD
				BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String line = fileStream.readLine();
				String input[] = line.split(",");
				Random random = new Random();
				int output = random.nextInt(input.length);
				System.out.println(input[output]);
			}
=======
<<<<<<< HEAD
				String reader = loadData("students.txt");
				String input[] = reader.split(",");
				Random random = new Random();
				int output = random.nextInt(input.length);
				System.out.println(input[output]);
=======
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
				String r = s.readLine();			
				String i[] = r.split(",");	
				Random x = new Random();
				int y = x.nextInt(i.length);
				System.out.println(i[y]);
>>>>>>> parent of 68ae1fb (Task 3 completed)
			} 
>>>>>>> task4
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");
			try
			{
<<<<<<< HEAD
				BufferedWriter file = new BufferedWriter(new FileWriter("students.txt", true));
				String text = args[0].substring(1);
				Date date = new Date();
				String dateformation = "dd/mm/yyyy-hh:mm:ss a";
				DateFormat dateFormat = new SimpleDateFormat(dateformation);
				String formateOfDate= dateFormat.format(date);
				file.write(", "+text+"\nList last updated on "+formateOfDate);
				file.close();
=======
				BufferedWriter s = new BufferedWriter(
						new FileWriter("students.txt", true));
				String t = args[0].substring(1);
		        Date d = new Date();
		        String df = "dd/mm/yyyy-hh:mm:ss a";
		        DateFormat dateFormat = new SimpleDateFormat(df);
		        String fd= dateFormat.format(d);
				s.write(", "+t+"\nList last updated on "+fd);
				s.close();
>>>>>>> task4
			}
			catch (Exception e)
			{

			}

			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("?"))
		{
			System.out.println("Loading data ...");
			try
			{
<<<<<<< HEAD
				BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String line = fileStream.readLine();
				String input[] = line.split(",");
=======
<<<<<<< HEAD
				String reader = loadData("students.txt");
				String input[] = reader.split(",");
=======
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
				String r = s.readLine();
				String i[] = r.split(",");	
>>>>>>> parent of 68ae1fb (Task 3 completed)
>>>>>>> task4
				boolean done = false;
				String t = args[0].substring(1);
				for(int idx = 0; idx<i.length && !done; idx++)
				{
					if(i[idx].equals(t))
					{
						System.out.println("We found it!");
						done=true;
					}
				}
			}
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("c"))
		{
			System.out.println("Loading data ...");
			try
			{
<<<<<<< HEAD
				BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String reader = fileStream.readLine();
=======
<<<<<<< HEAD
				String reader = loadData("students.txt");
>>>>>>> task4
				char character[] = reader.toCharArray();
=======
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
				String D = s.readLine();
				char a[] = D.toCharArray();			
>>>>>>> parent of 68ae1fb (Task 3 completed)
				boolean in_word = false;
				int count=0;
				for(char c:a)
				{
					if(c ==' ') 
					{
						if (!in_word) {	count++; in_word =true;	}
						else { in_word=false;}			
					}
				}
<<<<<<< HEAD
				System.out.println(count +" word(s) found " + character.length);
			}
=======
				System.out.println(count +" word(s) found " + a.length);
			} 
>>>>>>> task4
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");
		}
	}
}
