import javax.swing.JOptionPane;
public class usoArray2 {
	public static void main (String[] args){
		
		/*String[] paises=new String[8];
		paises[0]="Espa�a";
		paises[1]="M�xico";
		paises[2]="Colombia";
		paises[3]="Per�";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		/*for(int i=0;i<paises.length;i++){
			System.out.println("Pais " + (i+1) +" " + paises[i]);
		}*/
		
		/*for(int i=0;i<paises.length;i++){
			paises[i]=JOptionPane.showInputDialog("Introduce pa�s " + (i+1));
		}
		
		for(String elemento:paises){
			System.out.println("Pa�s: " + elemento);
		}*/
		
		int[] aleatorios=new int[150];
		
		for (int i=0;i<aleatorios.length;i++){
			aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int j=0;j<aleatorios.length;j++){
			
			System.out.print(aleatorios[j] + " ");
			if(j%10==0){
			System.out.println( "");
				
			
			}	
		}
		
	}
}
