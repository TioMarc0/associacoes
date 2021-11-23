package src;

public class Pessoa {
	private String nome;
	private String endereço;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		if(nome.length()>0)
			this.endereço = endereço;
			
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append("]");
		return builder.toString();
	}
	
	
}