# TRABALHO 3 – SISTEMAS DISTRIBUÍDOS TSI 3713
<p><img src="https://i.ibb.co/3sNMDtV/Instituto-Federal-de-Mato-Grosso-do-Sul.png"  title="IFMS" width="160px"></img></p>

SISTEMA DE VOTAÇÃO DISTRIBUÍDO USANDO JAVA RMI</br>
O trabalho consiste em desenvolver um sistema de votação distribuído, onde os eleitores podem votar remotamente em candidatos e os resultados são agregados em um servidor central.


REQUISITOS FUNCIONAIS
1. Crie uma interface remota chamada ‘ServicoDeVotacao’ que define, pelo menos, o seguinte método:
   - `void votar(String eleitor, String candidato) throws RemoteException` <br>
      Permite que um eleitor vote em um candidato.

2. Implemente a interface ‘ServicoDeVotacao’ em uma classe remota chamada ‘ServicoDeVotacaoImpl’. Essa classe deve manter uma estrutura de dados para que seja possível rastrear os votos.

3. Crie um servidor RMI que registre a classe ‘ServicoDeVotacaoImpl’.

4. Crie uma interface remota adicional chamada ‘ServicoDeResultados’ que define métodos para recuperar os resultados da votação, como:
   - `Map<String, Integer> getResultados() throws RemoteException` <br>
    Retorna um mapa com os resultados da votação (candidato -> total de votos).

5. Implemente a interface ‘ServicoDeResultados’ em uma classe remota chamada ‘ServicoDeResultadosImpl’.

6. Configure um registro RMI e registre a classe ‘ServicoDeResultadosImpl’ no registro RMI.
<br>
<br>
Sua solução deve, pelo menos:

1. Implementar um cliente RMI que permita que os eleitores votem remotamente em candidatos. O cliente deve ser capaz de:
   - Solicitar o nome do eleitor;
   - Apresentar uma lista de candidatos;
   - Eleitor indica o candidato em que deseja votar;
   - Chamar o método remoto `votar` no servidor RMI para registrar o voto;
   - Receber a confirmação do voto.

2. Implementar um cliente adicional que possa consultar os resultados da votação chamando o método ‘getResultados’ no servidor RMI.

3. Implemente tratamento de exceções adequado para lidar com exceções de RMI, como ‘RemoteException’.



```

Importação projeto no Eclipse
----------------------------
--- Passo a passo de como realizar a importação do projeto no eclipse
https://www.youtube.com/watch?v=WjQpxCwKd0w


Vai pedir usuario e senha para importar!
Precisa gerar o token
Click on settings Settings->Developer settings->Personal access tokens-> Generate new token.
https://www.youtube.com/watch?v=H_uyu9pzUE0
 
