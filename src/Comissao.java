
public class Comissao {

	public static void main(String[] args) {
		
		int[] vendas = new int[1000];
		
		System.out.println("Salários vendedores\n");
		
		for(int i = 0; i < vendas.length; i++){
			vendas[i] = 200 + i;
		}
		
		for(int i = 0; i < vendas.length; i++){
			if(vendas[i]%100 == 0){
				System.out.printf("\n%d-%d\t", vendas[i], vendas[i] + 99);
				if(vendas[i] < 1000){
					System.out.printf("\t");
				}
			}
			
			System.out.printf("%d\t", vendas[i]);
		}
	

	}

}
