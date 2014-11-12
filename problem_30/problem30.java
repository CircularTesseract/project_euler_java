public class problem30 {
	//1,2,10,20,50,100,200

	public int countWithBase() {
		int counter=0;

			for(int j = 0; j <= 200; j++) {
				for(int k = 0; k <=100;k++ ) {
					for(int v=0; v<=40;v++) {
						for(int h=0; h <= 20; h++) {
							for(int p=0;p<=10;p++) {
								for(int l=0;l<=4;l++) {
									for(int m=0;m<=2;m++) {
										int values = j*1 + k*2 + v*5 + h *10 + p*20+l*50+m*100; 
										if( values == 200) {
											counter++; 
											continue; 
										} else if(values>200) {
											continue;
										}
									}
								}
							}
						}
					}
				}
			}
		
		return counter; 
	}
	public static void main(String[] args) {
		problem30 prob = new problem30();
		int counter = 0;
		counter += prob.countWithBase(200); 
		System.out.println(++counter); 
	}
}