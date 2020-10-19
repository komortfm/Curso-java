/**
 * Criado Por Fábio Medeiros
 * Data: 18/10/2020
 */

public class SistemaOperacional{

	public static void main(String[] args){

		// Todas as informações sobre as keys (chaves) do sistema operacional (SO).
		// https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getProperties--

		// Dados sobre o Java.
		String javaVersao = System.getProperty("java.version");
		String javaDiretorio = System.getProperty("java.home");

		String jvmEspecificacaoVersao =  System.getProperty("java.vm.specification.version");
		String jvmEspecificacaoDistribuidor = System.getProperty("java.vm.specification.vendor");
		String jvmEspecificacaoNome = System.getProperty("java.vm.specification.name");

		String jvmImplementacaoVersao = System.getProperty("java.vm.version");
		String jvmImplementacaoDistribuidor = System.getProperty("java.vm.vendor");
		String jvmImplementacaoNome = System.getProperty("java.vm.name");

		String jreEspecificacaoVersao = System.getProperty("java.specification.version");
		String jreEspecificacaoDistribuidor = System.getProperty("java.specification.vendor");
		String jreEspecificacaoNome = System.getProperty("java.specification.name");

		String classeJava = System.getProperty("java.class.version");
		String classeCaminho = System.getProperty("java.class.path");

		// Dados do Sistema Operacional.
		String listaBibliotecas = System.getProperty("java.library.path");
		String caminhoArquivosTemporarios = System.getProperty("java.io.tmpdir");
		String soDistribuidor = System.getProperty("java.vendor");
		String soDistribuidorUrl = System.getProperty("java.vendor.url");
		String so = System.getProperty("os.name");
		String soArquitetura = System.getProperty("os.arch");
		String soVersao = System.getProperty("os.version");
		String soSeparadorArquivos = System.getProperty("file.separator");
		String soSeparadorCaminho = System.getProperty("path.separator");
		String soSeparadorLinha = System.getProperty("line.separator");

		// Dados do Usuário.
		String usuarioConta = System.getProperty("user.name");
		String usuarioHome = System.getProperty("user.home");
		String usuarioDir = System.getProperty("user.dir");

		System.out.println("A versão do Java:\t\t\t" + javaVersao);
		System.out.println("O diretório do java:\t\t\t" + javaDiretorio + "\n");

		System.out.println("A versão da especificação da JVM:\t" + jvmEspecificacaoVersao);
		System.out.println("O distribuidor da especificação da JVM:\t" + jvmEspecificacaoDistribuidor);
		System.out.println("O nome da especificação da JVM:\t\t" + jvmEspecificacaoNome + "\n");

		System.out.println("A versão da implementação da JVM:\t" + jvmImplementacaoVersao);
		System.out.println("O distribuidor da implementação da JVM:\t" + jvmImplementacaoDistribuidor);
		System.out.println("O nome da implementação da JVM:\t\t" + jvmImplementacaoNome + "\n");

		System.out.println("A versão da especificação do JRE:\t" + jreEspecificacaoVersao);
		System.out.println("O distribuidor da especificação do JRE:\t" + jreEspecificacaoDistribuidor);
		System.out.println("O nome da especificação do JRE:\t\t" + jreEspecificacaoNome + "\n");

		System.out.println("A versão da classe java:\t\t" + classeJava);
		System.out.println("O caminho da classe java:\t\t" + classeCaminho + "\n");

		System.out.println("Lista das bibliotecas do SO:\t\t" + listaBibliotecas);
		System.out.println("O caminho temporário dos arquivos:\t" + caminhoArquivosTemporarios);
		System.out.println("A distribuição:\t\t\t\t" + soDistribuidor);
		System.out.println("A url da distribuição:\t\t\t" + soDistribuidorUrl);
		System.out.println("O sistema operacional (SO):\t\t" + so);
		System.out.println("A arquitetura do SO:\t\t\t" + soArquitetura);
		System.out.println("A versão do SO:\t\t\t\t" + soVersao);
		System.out.println("O separador de pasta (tipo de barra):\t" + soSeparadorArquivos);
		System.out.println("O separador de caminho:\t\t\t" + soSeparadorCaminho);
		System.out.println("O separador de Linha (Enter):\t\t" + soSeparadorLinha + "\n");

		System.out.println("A conta do usuário:\t\t\t" + usuarioConta);
		System.out.println("O diretório do usuario:\t\t\t" + usuarioHome);
		System.out.println("O diretório atual:\t\t\t" + usuarioDir);
	}
}
