package hackerrank.regex;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ippattern {



	    public static boolean MyRegex(String ip ){
	        
	        
//	        Pattern pattern=Pattern.compile("^[0-255]{3}.[0-255]{3}.[0-255]{3}.[0-255]{3}$");
//	    	Pattern pattern=Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
	    	Pattern pattern=Pattern.compile("()");
	    	Matcher matcher=pattern.matcher(ip);
	        return matcher.find();
	    }

	    public static void main(String[] args) {
	        Scanner in =new Scanner(System.in);
	        String ip=in.next();
	        System.out.println(MyRegex(ip));
//	        while(in.hasNext()){
//	            String ip=in.next();
//	            System.out.println(MyRegex(ip));
//	            
//	        }
	        
	    }
	}


