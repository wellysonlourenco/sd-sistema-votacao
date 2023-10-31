package sd_sis_votacao_java_rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ServicoDeVotacaoImpl extends UnicastRemoteObject implements ServicoDeVotacao {
    private Map<String, String> votos; // Mapeia o eleitor para o candidato

    public ServicoDeVotacaoImpl() throws RemoteException {
        super();
        votos = new HashMap<>();
    }

    @Override
    public void votar(String eleitor, String candidato) throws RemoteException {
        // Verifica se o eleitor já votou
        if (votos.containsKey(eleitor)) {
            System.out.println("Eleitor " + eleitor + " já votou.");
        } else {
            // Registra o voto do eleitor
            votos.put(eleitor, candidato);
            System.out.println("Voto de " + eleitor + " registrado para " + candidato);
        }
    }

    @Override
    public Map<String, String> getVotos() throws RemoteException {
        return votos;
    }
}
