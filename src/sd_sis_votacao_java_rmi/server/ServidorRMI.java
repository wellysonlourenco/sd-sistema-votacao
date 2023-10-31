package sd_sis_votacao_java_rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Cria e inicia o registro RMI na porta
            LocateRegistry.createRegistry(1099);

            // Cria uma instância do serviço de votação
            ServicoDeVotacao servicoDeVotacao = new ServicoDeVotacaoImpl();

            // Registra o serviço de votação com um nome
            Naming.rebind("ServicoDeVotacao", servicoDeVotacao);

            // Cria uma instância do serviço de resultados passando o serviço de votação
            ServicoDeResultados servicoDeResultados = new ServicoDeResultadosImpl(servicoDeVotacao);

            // Registra o serviço de resultados com um nome
            Naming.rebind("ServicoDeResultados", servicoDeResultados);

            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            // Em caso de erro, imprime detalhes do erro no console
            System.err.println("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
