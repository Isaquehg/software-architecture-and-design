package strategy.impostos;

import java.util.List;

public class ReceitaFederal {

    public List<Tributavel> buscarListaImpostosVigentes(){
        return List.of(
                new ImpostosISS(),
                new ImpostoICMS(),
                new ImpostoIVA()
        );
    }
}
