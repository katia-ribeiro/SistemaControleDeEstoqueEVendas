package models;

public class Produtos {
	private int codigoproduto;
	private String nome;
	private int quantidade;
	private double precovenda;
	private String codigobarras;
	private int estoquemin;
	int fk_codigofornecedor;
	
	public Produtos() {
		super();
		this.codigoproduto = codigoproduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.precovenda = precovenda;
		this.codigobarras = codigobarras;
		this.estoquemin = estoquemin;
		this.fk_codigofornecedor = fk_codigofornecedor;
	}

	public int getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(double precovenda) {
		this.precovenda = precovenda;
	}

	public String getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public int getEstoquemin() {
		return estoquemin;
	}

	public void setEstoquemin(int estoquemin) {
		this.estoquemin = estoquemin;
	}

	public int getFk_codigofornecedor() {
		return fk_codigofornecedor;
	}

	public void setFk_codigofornecedor(int fk_codigofornecedor) {
		this.fk_codigofornecedor = fk_codigofornecedor;
	}

	@Override
	public String toString() {
		return "Produtos [codigoproduto=" + codigoproduto + ", nome=" + nome + ", quantidade=" + quantidade
				+ ", precovenda=" + precovenda + ", codigobarras=" + codigobarras + ", estoquemin=" + estoquemin
				+ ", fk_codigofornecedor=" + fk_codigofornecedor + "]";
	}
}
	