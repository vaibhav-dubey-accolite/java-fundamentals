/*
 * 
 */
package firstPackage;

// TODO: Auto-generated Javadoc
/**
 * The Class AmericanFlag.
 */
class AmericanFlag{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
		double ratio = 3.0;
		int flagHeight = 31;
		int flagWidth = (int)(flagHeight*ratio);
		int starBoxHeight = 11;
		int starBoxWidth = (int)(starBoxHeight*ratio);
		char STAR = '*';
		char CHAR1 = 219;
		AmericanFlag obj = new AmericanFlag();
						
		System.out.println("Flag width= " + flagWidth);
		System.out.println("\u0811123");
		
		for(int i=0; i<flagHeight; i++){
			for(int j=0; j<flagWidth; j++){
				
				if( (i<starBoxHeight) && (j<starBoxWidth) ){
					if( (i%2 == 0 && j%2 == 0) || (i%2 != 0 && j%2 != 0) ){
						System.out.printf("%c", STAR);
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					if(i%2 == 0){
						System.out.printf("%c", CHAR1);
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}