import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {
    public static void main(String[] args) {
        Collection<String> engenhariasAtuais = new ArrayList<>();

        engenhariasAtuais.add("Biomédica");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Computação");
        engenhariasAtuais.add("Telecomunicações");
        engenhariasAtuais.add("Elétrica");

        System.out.println(engenhariasAtuais);

        Collection<String> engenhariasFuturas = new ArrayList<>();

        engenhariasFuturas.add("Mecânica");
        engenhariasFuturas.add("Mecatrônica");

        System.out.println(engenhariasFuturas);

        // Concatenating Lists/Collections
        Collection<String> todasEngenharias = new ArrayList<>();

        todasEngenharias.addAll(engenhariasAtuais);
        todasEngenharias.addAll(engenhariasFuturas);

        System.out.println(todasEngenharias);
    }
}
