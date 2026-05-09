package attTemplateMethod;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== PROCESSAMENTO DE CLIENTES ===");
		ProcessadorArquivo clientes = new ProcessadorClientes();
		clientes.processarArquivo();

		System.out.println("\n=== PROCESSAMENTO DE PRODUTOS ===");
		ProcessadorArquivo produtos = new ProcessadorProdutos();
		produtos.processarArquivo();

		System.out.println("\n=== PROCESSAMENTO DE VENDAS ===");
		ProcessadorArquivo vendas = new ProcessadorVendas();
		vendas.processarArquivo();
	}
}