
import java.io.*;
import java.util.*;
import BathroomStalls.*;

public class BathroomStalls 
{
	private static final String IN_FILE_PATH = 
	"/storage/61BF-1504/AppProjects/GoogleCodeJam2017/files/"+
	
	"C-large.in"
	;
	private static final String OUT_FILE_PATH = 
	"/storage/61BF-1504/AppProjects/GoogleCodeJam2017/files/"+
	
	"C-large.out"
	;

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
				long k = in.nextLong();
				String rs = getResultString(i,n,k);
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

	private static String getResultString(int i, long n, long k) {
		long[] results = getFinalResults(n,k);
		long max = results[1];
		long min = results[0];
		return resultToString(i,max, min);
	}
	
	private static long[] getMinMax(long n) {
		long max = n/2;
		long min = n- max -1;
		return new long[]{min,max};
	}
	
	private static long[] getFinalResults(long n, long k) {
		long[] minMax = getMinMax(n);
		long max = minMax[1];
		long min = minMax[0];
		if(k==1) {
			return minMax;
		} else if(k==2) {
			return getMinMax(max);
		} else if(k==3) {
			return getMinMax(min);
		}
		long maxCount = 1;
		long minCount = 1;
		
		long totalCount = 3;
		while(totalCount<k) {
			long mx1,mn1,mx2,mn2,mxc = 0,mnc = 0;
			
			mx1 = max/2;
			mn1 = max - mx1 - 1;

			mx2 = min/2;
			mn2 = min - mx2 - 1;

			max = mx1;
			mxc += maxCount;
			totalCount += maxCount;
			if(totalCount>=k) {
				return getMinMax(mx1);
			}
			
			if(mx2==max) {
				mxc += minCount;
			} else {
				mnc += minCount;
			}

			totalCount += minCount;
			if(totalCount>=k) {
				return getMinMax(mx2);
			}
			
			if(mn1==max) {
				mxc += maxCount;
			} else {
				mnc += maxCount;
			}
			
			totalCount += maxCount;
			if(totalCount>=k) {
				return getMinMax(mn1);
			}
			
			min = mn2;
			mnc += minCount;
			totalCount += minCount;
			if(totalCount>=k) {
				return getMinMax(mn2);
			}
			maxCount = mxc;
			minCount = mnc;
		}
		
		return new long[]{min,max};
	}

	private static String resultToString(int i, long max, long min) {
		StringBuilder sb = new StringBuilder();
		sb.append("Case #").append(i).append(": ").append(max).append(" ").append(min).append("\n");
		return sb.toString();
	}
	

}
