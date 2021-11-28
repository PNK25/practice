package Small_programsIN_java;

public class DiamondPattern {

	public static void main(String[] args) {
			int row=8;
				for(int i=0;i<row;i++) {
					for(int j=(row-i);j>0;j--) {
						System.out.print(" ");
					}
					
					for(int j=0;j<=i;j++) {
						System.out.print("*"+" ");
					
					}
					System.out.println();
				}
				for(int i=row;i<=row;i--) {
					for(int j=(row-i);j>0;j--) {
						System.out.print(" ");
					}
					
					for(int j=0;j<=i;j++) {
						System.out.print("*"+" ");
									}
					System.out.println();
					if(i==0) {
						break;
					}
				}
			}
			}


