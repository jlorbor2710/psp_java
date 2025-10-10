package psp;

import java.util.Scanner;

public class Menu_Java {
		public static void main(String[] args) throws Exception{
			Scanner sc = new Scanner(System.in);
			
			int rc;
			int num = 0;
			
			
			
			while (num != 5) {
				
				System.out.println("1.uname -a");
				System.out.println("2.hostnamectl");
				System.out.println("3.lscpu");
				System.out.println("4.timedatectl status");
				System.out.println("5.salir");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
					rc = new ProcessBuilder(Utils.sh(String.join(" ", "uname -a"))).inheritIO().start().waitFor();
					break;
				case 2:
					rc = new ProcessBuilder(Utils.sh(String.join(" ", "hostnamectl"))).inheritIO().start().waitFor();
					break;
				case 3:
					rc = new ProcessBuilder(Utils.sh(String.join(" ", "lscpu"))).inheritIO().start().waitFor();
					break;
				case 4:
					rc = new ProcessBuilder(Utils.sh(String.join(" ", "timedatectl status"))).inheritIO().start().waitFor();
					break;
				default:
					break;
				}
			
			}
			
			
		
		}
}
