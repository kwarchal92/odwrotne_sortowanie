package odwrotne_sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<>();

        lista.add("Ewelina");
        lista.add("Robert");
        lista.add("Adam");
        lista.add("Małgorzata");

        System.out.println("Lista przed sortowaniem: ");
        System.out.print(lista);

        Collections.sort(lista, (String a, String b) -> //Funkcja wyzszego rzedu
        {
            return b.compareTo(a); //metoda ta porownuje dwa obiekty
        });

        System.out.println("\nLista po odwrotnym sortowaniu: ");
        System.out.print(lista);

    }
}
