package GenericsCollection;

import java.util.Map;
import java.util.TreeMap;

public class CookieManager {
    public static void main(String[] args) {
        // Cria um TreeMap para armazenar cookies (pares chave-valor) em ordem natural das chaves.
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "kauan"); // Adiciona um cookie com chave "username".
        cookies.put("email", "kauan@gmail.com"); // Adiciona um cookie com chave "email".
        cookies.put("phone", "99771122"); // Adiciona um cookie com chave "phone".
        cookies.remove("email"); // Remove o cookie com chave "email".
        cookies.put("phone", "99771133"); // Atualiza o valor do cookie com chave "phone".

        // Verifica e imprime se a chave "phone" está presente no mapa.
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        // Obtém e imprime o valor associado à chave "phone".
        System.out.println("Phone number: " + cookies.get("phone"));
        // Tenta obter e imprimir o valor associado à chave "email" (que foi removida).
        System.out.println("Email: " + cookies.get("email"));
        // Imprime o tamanho do mapa (número de entradas).
        System.out.println("Size: " + cookies.size());

        // Imprime todos os cookies no mapa.
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key)); // Imprime cada chave e valor.
        }
    }
}