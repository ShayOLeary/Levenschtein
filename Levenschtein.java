import java.util.*;
import java.lang.*;

class Levenschtein
{
    public static void main (String[] args)
    {
	    int answer=    levens(args[0],args[1]);
	    System.out.println(answer);
    }
    
    public static int levens(String a, String b)
    {
        int[][] distance = new int[a.length()+1][b.length()+1];
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<a.length()+1;i++)
        {
            distance[i][0]=i;
        }    
        for(int j=0;j<b.length()+1;j++)
        {
                distance[0][j]=j;
        }
        
        for(int i=0;i<a.length();i++)
        {
	 int edit = 1;
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j))
                    edit =0;
                    
                distance[i+1][j+1]= Math.min(distance[i+1][j]+1,Math.min(distance[i][j]+edit,distance[i+1][j]+1));    
                    
                
            }
        }
        return distance[a.length()][b.length()];
    }
}




