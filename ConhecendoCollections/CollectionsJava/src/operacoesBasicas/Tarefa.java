package operacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;

	//criar construtor mac atalho -> option+command+s
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return  descricao;
	}
	
	

//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//	

	


	
	
	
}
