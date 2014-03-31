

import java.util.*;

public class EvaJobPosting {
	String str;
	
	
 public EvaJobPosting(String str)
 {
	 this.str = str;
 }
	
int  CalSearchKey(String str)
{
	if(str == null) return 0;
	 
	int num = 0;
	if((str.toLowerCase()).equals("salaries"))
		num += Score.salaries.getScore();
    if((str.toLowerCase()).equals("equal"))
		num += Score.equal.getScore();
    if((str.toLowerCase()).equals("equity"))
    	num += Score.equity.getScore();
    if((str.toLowerCase()).equals("free"))
    	num += Score.free.getScore();
    if((str.toLowerCase()).equals("gym"))
    	num += Score.gym.getScore();
    if((str.toLowerCase()).equals("java"))
    	num += Score.java.getScore();
    if((str.toLowerCase()).equals("sql"))
    	num += Score.sql.getScore();
    if((str.toLowerCase()).equals("j2ee"))
    	num += Score.j2ee.getScore();
    if((str.toLowerCase()).equals("growing"))
    	num += Score.growing.getScore();
    if((str.toLowerCase()).equals("python"))
    	num += Score.python.getScore();
	return num;
}

int CalculateScore(int num)
{
	int score = num %100;
	return score;
}
}
