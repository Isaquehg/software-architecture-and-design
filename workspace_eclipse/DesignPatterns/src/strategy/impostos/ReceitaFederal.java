package strategy.impostos;

import java.util.List;

/**
 * Supported taxes types
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ReceitaFederal {

    /**
     * Avaliable taxes' types
     * @return list of avaliable taxes indexes
     */
    public List<Tributavel> buscarListaImpostosVigentes(){
        return List.of(
                new ImpostosISS(),
                new ImpostoICMS(),
                new ImpostoIVA()
        );
    }
}
