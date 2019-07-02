import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;

public class LeappFrogChapterOne {
  private static ArrayList < Integer > integers;
    private static File f=new File("Solution3.txt");
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("leapfrog_ch_ (1).txt");
        LineNumberReader lnr = new LineNumberReader(fr);
        int T = Integer.parseInt(lnr.readLine().trim());
        FileWriter fw=new FileWriter(f);
        if(T >= 0 && T <= 500)
        {
        for (int i = 0; i < T; i++) {
           String result = getResult(lnr.readLine().trim());
        if(i<T-1)
        {
        fw.write("Case #" + (i+1) + ": " + result+"\r\n");
        
        }
       else 
           fw.write("Case #" + (i+1) + ": " + result + "\r\n");
       fw.flush();
        }
        }
	}

    private static String getResult(String string) throws Exception
    {
      int countA = 0;
      int countB = 0;
      int countPeriod = 0;
      
      
           if((string.length() >= 2) && (string.length() <= 5000))
           {
              for(int a = 0; a < string.length(); a++)
              {
                 if(string.charAt(a) == 'A')
                    ++countA;
                 if(string.charAt(a) == 'B')
                    ++countB;
                 if(string.charAt(a) == '.')
                    ++countPeriod;
              }
           if((countA == 1) && (countPeriod != 0) && (countB != 0) && ((countB >= countPeriod) || (countPeriod-1 == countB)))
           {   
              return "Y";
           }
           
           }
           
        
      return "N";

}
}