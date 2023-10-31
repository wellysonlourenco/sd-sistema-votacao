package sd_sis_votacao_java_rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface ServicoDeResultados extends Remote {
    // Método remoto para obter os resultados da votação.
    // Retorna um mapeamento que associa o nome do candidato ao número total de votos recebidos.
    Map<String, Integer> getResultados() throws RemoteException;
}
