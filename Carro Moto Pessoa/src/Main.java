package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro cr =  new Carro();
		cr.dono.setNome("Marco");
		cr.dono.setEndereço("Rua Caetano Veloso,420");
		cr.motor.setMarca("Ferrari");
		cr.motor.setPotencia(640);
		cr.motor.setCilindros(10);
		cr.motor.setConbustivel("Gasolina");
		cr.setAno(2000);
		cr.setCor("Vermelho");
		cr.setModelo("Lamborguini");
		cr.setFabricante("Enzo Ferrari");
		System.out.println((cr));
		
		
	}

}