//Link URI: https://www.urionlinejudge.com.br/judge/en/problems/view/1030

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<>(); 
			int t=0;
			t=scan.nextInt();
			
			for(int i=1; i <= t; i++){
				list.clear();
				int n = scan.nextInt();
				int k = scan.nextInt(); 
				int indice=0;
				
				for(int j=1; j<=n; j++){
					list.add(j);
				}
				
				do{
					indice = (indice + (k-1))%list.size();
					list.remove(indice);
				}while (list.size()>1);
				System.out.println("Case "+ i + ": " + list.get(0));
			}
			scan.close();
		}
}


