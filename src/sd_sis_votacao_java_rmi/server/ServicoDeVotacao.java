package sd_sis_votacao_java_rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface ServicoDeVotacao extends Remote {
    // Método remoto para permitir que um eleitor registre seu voto.
    // Recebe o nome do eleitor e o número do candidato escolhido.
    void votar(String eleitor, String candidato) throws RemoteException;


    // Método remoto para obter a lista de votos registrados.
    // Retorna um mapeamento que associa o nome do eleitor ao número do candidato que votou.
    Map<String, String> getVotos() throws RemoteException; // Método para obter os votos
}
