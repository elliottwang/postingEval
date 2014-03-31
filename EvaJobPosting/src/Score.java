import java.util.*;

	public enum Score{
		salaries(10),
		equal(10),
		equity(10),
	    free(10),
	    gym(10),
	    java(10),
	    sql(10),
	    j2ee(10),
	    growing(10),
	    python(10);	    
	
		public int value;
		private Score(int value){
			this.value = value;
		}
		
		public int getScore(){
			return this.value;
		}
		
		public String returnString(){
			switch (this) {
	         case salaries:
	              return "salaries";
	         case equal:
	              return "equal";
	         case equity:
	              return "equity";
	         case free:
	              return "free";
	         case gym:
	        	  return "gym";
	         case java:
	        	  return "java";
	         case sql:
	        	  return "sql";
	         case j2ee:
	        	  return "j2ee";
	         case growing:
	        	  return "growing";
	         case python:
	        	  return "python";	        	  
	        }
			return null;
		}


	}
