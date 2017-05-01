
import java.io.*;
import java.util.*;

public class TidyNumbers  
{
	private static final String IN_FILE_PATH = "/storage/61BF-1504/AppProjects/GoogleCodeJam2017/files/B-large.in";
	private static final String OUT_FILE_PATH = "/storage/61BF-1504/AppProjects/GoogleCodeJam2017/files/B-large.out";
	
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		Scanner in = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(OUT_FILE_PATH,true);
			fis = new FileInputStream(IN_FILE_PATH);
			in = new Scanner(fis);
			int t = in.nextInt();
			for(int i=1;i<=t;i++) {
				long n = in.nextLong();
				String rs = getResultString(i,n);
				fw.write(rs);
				System.out.println(rs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				fis.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getResultString(int i, long n) {
		// TODO: Implement this method
		long result = getResult(n);
		return resultToString(i,result);
	}

	private static long getResult(long n) {
		// TODO: Implement this method
		//String ns = String.valueOf(n);
		int i = 0;
		return getTidyNumber(i,n);
	}

	private static long getTidyNumber(int i, long n) {
		// TODO: Implement this method
		String ns = String.valueOf(n);
		if(isTidy(ns)) {
			return n;
		}
		int lastDigit = Integer.parseInt(String.valueOf((ns.charAt(ns.length()-1-i))))+1;
		
		long subs = (long) Math.pow(10,i) * lastDigit;
		System.out.println("Given="+n+" last digit="+lastDigit+" subs="+subs);
		i++;
		return getTidyNumber(i,n-subs);
	}

	private static boolean isTidy(String ns) {
		// TODO: Implement this method
		int max = Integer.parseInt(String.valueOf(ns.charAt(0)));
		
		for(int i=1;i<ns.length();i++) {
			int c = Integer.parseInt(String.valueOf(ns.charAt(i)));
			System.out.println("max="+max+",,,C="+c);
			if(c<max) {
				return false;
			} else {
				max = c;
			}
		}
		return true;
	}
	
	private static String resultToString(int i, long r) {
		// TODO: Implement this method
		StringBuilder sb = new StringBuilder();
		sb.append("Case #").append(i).append(": ").append(r).append("\n");
		return sb.toString();
	}
}
