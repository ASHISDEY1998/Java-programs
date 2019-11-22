import java.util.*;
public class DiceGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the first player name");
		String fname=sc.next();
		System.out.println("Enter the second player name");
		String sname=sc.next();
		int ftotal=0,stotal=0;
		
		while(true)
		{
			System.out.println(fname+" Press any button to flip the dice");
			sc.next();
			int fr=rd.nextInt(6)+1;
			System.out.println("you score "+fr);
			if(ftotal+fr<=100)
				ftotal=ftotal+fr;
			if(ftotal==100)
			{
				System.out.println(fname+"Wons the game");
				break;
			}
			
			
			System.out.println(sname+" Press any button to flip the dice");
			sc.next();
			int sr=rd.nextInt(6)+1;
			System.out.println("you score "+sr);
			if(stotal+sr<=100)
				stotal=stotal+sr;
			if(stotal==100)
			{
				System.out.println(sname+"Wons the game");
				break;
			}
		}
		
	
		
	}
}
