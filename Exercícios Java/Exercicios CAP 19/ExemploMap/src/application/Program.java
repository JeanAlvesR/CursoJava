package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","Maria@gmail.com");
        cookies.put("phone","99711122");

        cookies.remove("email");
        cookies.put("phone", "458999658");//Sobrescreve phone, pois não aceita repetições

        //Verificar se contém
        System.out.println(cookies.containsKey("phone") +" --> Phone: "+cookies.get("phone"));

        System.out.println("ALL COOKIES: ");
        for (String key:
                cookies.keySet()) {//keySet retorna a chave
            System.out.println(key +": "+cookies.get(key));
        }
 
    }
}
