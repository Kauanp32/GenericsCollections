package GenericsCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VoteCounter {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário.

		Map<String, Integer> votes = new LinkedHashMap<>(); // Mapa para armazenar o número de votos por nome.

		System.out.print("Enter file full path: ");
		String path = sc.nextLine(); // Lê o caminho do arquivo fornecido pelo usuário.

		// Tenta abrir o arquivo especificado pelo caminho.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // Lê a primeira linha do arquivo.
			while (line != null) {

				String[] fields = line.split(","); // Divide a linha em campos usando a vírgula como delimitador.
				String name = fields[0]; // Nome do candidato.
				int count = Integer.parseInt(fields[1]); // Número de votos para o candidato.

				// Atualiza o número de votos no mapa.
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name); // Obtém o número de votos já contabilizados.
					votes.put(name, count + votesSoFar); // Atualiza o total de votos.
				} else {
					votes.put(name, count); // Adiciona um novo candidato ao mapa.
				}

				line = br.readLine(); // Lê a próxima linha do arquivo.
			}

			// Imprime o total de votos para cada candidato.
			for (String key : votes.keySet()) {
				System.out.println(key + " : " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Trata exceções de entrada/saída.
		}

		sc.close(); // Fecha o Scanner.
	}
}