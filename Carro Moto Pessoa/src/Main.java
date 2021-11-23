package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro cr =  new Carro();
		cr.setFabricante("Enzo Ferrari");
		cr.setModelo("Lamborguini");
		cr.setCor("Vermelho");
		cr.setAno(2013);
		cr.motor.setMarca("Ferrari");
		cr.motor.setPotencia(640);
		cr.motor.setCilindros(10);
		cr.motor.setCombustivel("Gasolina");
		cr.dono.setNome("Marco");
		cr.dono.setEndereço("Rua Caetano Veloso,420");
		System.out.println((cr));
		
		
	
		
		
		
		
		
		
		
	}

}