package src;

public class Pessoa {
	private String nome;
	private String enderešo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		if(nome.length()>0)
			this.enderešo = enderešo;
			
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", enderešo=");
		builder.append(enderešo);
		builder.append("]");
		return builder.toString();
	}
	
	
}