import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;

public class TestEvaJobPosting {

	public static void main(String sgrs[])
	{
		File file;
		
		
		String filename = "sample.txt";
		
		file = new File(filename);
		String content = file.getAbsolutePath();
		
		EvaJobPosting ejp = new EvaJobPosting(content);
		try 
		{
			BufferedReader br = new BufferedReader( new FileReader(content));
			String currentLine;
			int totalScore = 0;
			while( (currentLine = br.readLine()) != null )
			{
				String[] tokens = currentLine.split("\\s+");
				for(int i = 0; i < tokens.length; i++)
					totalScore += ejp.CalSearchKey(tokens[i]);
			}
			
			int returnScore = ejp.CalculateScore(totalScore);
			System.out.println(returnScore);
			
		}catch(IOException e)
		{
			
		}
	}
}
