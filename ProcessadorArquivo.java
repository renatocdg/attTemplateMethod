package attTemplateMethod;

public abstract class ProcessadorArquivo {

	public final void processarArquivo() {
		abrirArquivo();
		validarEstrutura();
		lerDados();
		processarDados();
		salvarResultado();
		fecharArquivo();
	}

	// Etapas comuns
	private void abrirArquivo() {
		System.out.println("Abrindo arquivo...");
	}

	private void salvarResultado() {
		System.out.println("Salvando resultado...");
	}

	private void fecharArquivo() {
		System.out.println("Fechando arquivo...");
	}

	// Etapas variáveis
	protected abstract void validarEstrutura();

	protected abstract void lerDados();

	protected abstract void processarDados();
}