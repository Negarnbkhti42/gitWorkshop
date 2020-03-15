package tamrinat;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Tamrin1_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String player,team;
		int num;
		HashMap<String,String> teams=new HashMap<String,String>();
		TreeSet<String> pnlty=new TreeSet<String>();
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=0;i<=n;i++) {
			player=s.nextLine();
			teams.put(player,"0");
		}
		for(int i=0;i<=m;i++) {
			team=s.nextLine();
			num=s.nextInt();
			for(int j=0;j<=num;j++) {
				player=s.nextLine();
				if(teams.containsKey(player)) {
					if(teams.get(player).equals("0")) {
						teams.put(player, team);
					}
					else{
						pnlty.add(team);
						pnlty.add(teams.get(player));
					}
				}
				else {
					pnlty.add(team);
				}
			}
			for(String str:pnlty) {
				System.out.println(str);
			}
		}
	}
}

