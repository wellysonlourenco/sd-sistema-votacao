package sd_sis_votacao_java_rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ServicoDeResultadosImpl extends UnicastRemoteObject implements ServicoDeResultados {
    private ServicoDeVotacao servicoDeVotacao;

    //construtor
    public ServicoDeResultadosImpl(ServicoDeVotacao servicoDeVotacao) throws RemoteException {
        super();
        this.servicoDeVotacao = servicoDeVotacao;
    }

    @Override
    public Map<String, Integer> getResultados() throws RemoteException {
        // Recupera os votos do serviço de votação
        Map<String, String> votos = servicoDeVotacao.getVotos(); // Suponha que a classe ServicoDeVotacao tenha um método getVotos()

        // Realiza a contagem dos votos por candidato
        Map<String, Integer> resultados = new HashMap<>();
        
        // Percorre todos os votos registrados
        for (String candidato : votos.values()) {
        // Verifica se o candidato já possui votos registrados; se não, inicializa com 0
            resultados.put(candidato, resultados.getOrDefault(candidato, 0) + 1);
        }

        return resultados;
    }
}
