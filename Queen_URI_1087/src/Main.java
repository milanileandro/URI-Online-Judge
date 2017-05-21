//Link URI: https://www.urionlinejudge.com.br/judge/en/problems/view/1087

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	int x1 = 0;
    	int y1 = 0;
    	int x2 = 0;
    	int y2 = 0;
    	int answer = 0;
    	Scanner scan = new Scanner(System.in);
    	
    	while (true){
        	x1 = scan.nextInt();
        	y1 = scan.nextInt();
        	x2 = scan.nextInt();
        	y2 = scan.nextInt();
        	if (x1 == 0 && y1 == 0 & x2 == 0 && y2 == 0) break;
        	if (x1 == x2 && y1 == y2)	answer = 0;
        	else if ( (x1 == x2 || y1 == y2) || ( (x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2 ) ) ) answer = 1;
        	else answer = 2; 
        	System.out.println(answer);
    	}
    	scan.close();
    }
 
}