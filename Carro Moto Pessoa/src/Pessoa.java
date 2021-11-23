package src;

public class Pessoa {
	private String nome;
	private String endere�o;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		if(nome.length()>0)
			this.endere�o = endere�o;
			
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", endere�o=");
		builder.append(endere�o);
		builder.append("]");
		return builder.toString();
	}
	
	
}