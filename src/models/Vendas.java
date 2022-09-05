package models;

import java.util.Date;

public class Vendas {
	private int codigoVenda;
	private Date data;
	private double total;
	private double desconto;
	Produtos fk_codigoproduto;
	
	public Vendas(int codigoVenda, Date data, double total, double desconto, Produtos fk_codigoproduto) {
		super();
		this.codigoVenda = codigoVenda;
		this.data = data;
		this.total = total;
		this.desconto = desconto;
		this.fk_codigoproduto = fk_codigoproduto;
	}

	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Produtos getFk_codigoproduto() {
		return fk_codigoproduto;
	}

	public void setFk_codigoproduto(Produtos fk_codigoproduto) {
		this.fk_codigoproduto = fk_codigoproduto;
	}

	@Override
	public String toString() {
		return "Vendas [codigoVenda=" + codigoVenda + ", data=" + data + ", total=" + total + ", desconto=" + desconto
				+ ", fk_codigoproduto=" + fk_codigoproduto + "]";
	}
    
	
    
}