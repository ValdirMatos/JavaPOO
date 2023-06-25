
public class Funcionario {
	
	// Atributos (dados)
	
	public String nome;
	public double valorPorHora;
	public int horas;
	
	// Métodos (funções) (comportamento)
	public double total() {
		return valorPorHora * horas;
	}
}
