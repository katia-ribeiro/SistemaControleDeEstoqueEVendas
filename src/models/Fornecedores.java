package models;

public class Fornecedores {

	private int codigoFornecedor;
	private String nome;
	private String endereco;
	private String telefone;
	
	public Fornecedores() {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Fornecedores [codigoFornecedor=" + codigoFornecedor + ", nome=" + nome + ", endereco=" + endereco
				+ ", telefone=" + telefone + "]";
	}
	
	
}