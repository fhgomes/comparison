package fernando.br.valida;

import fernando.br.OutroService;

import java.util.logging.Logger;

public class ClasseServiceSingleExit {

    private static final Logger LOGGER = Logger.getLogger(ClasseServiceSingleExit.class.getName());
    private OutroService outroService;

    public void metodoPublic() {
        if(outroService.podeExecutar()) {
            executaAlgo();
            depoisExecutaAlgo();
        }

    }

    public boolean metodoPublicValidar() {
        if(outroService.podeExecutar()) {
            executaAlgo();
            depoisExecutaAlgo();
            return true;
        }

        return false;
    }

    private void depoisExecutaAlgo() {
        LOGGER.info("executei 2");
    }

    private void executaAlgo() {
        LOGGER.info("executei");
    }
}
