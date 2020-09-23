package fernando.br.valida;

import fernando.br.OutroService;

import java.util.logging.Logger;

public class ClasseServiceEarlyReturn {

    private static final Logger LOGGER = Logger.getLogger(ClasseServiceEarlyReturn.class.getName());
    private OutroService outroService;

    public void metodoPublic() {
        if(!outroService.podeExecutar()) {
            return;
        }

        executaAlgo();
        depoisExecutaAlgo();
    }

    public boolean metodoPublicValidar() {
        if(!outroService.podeExecutar()) {
            return false;
        }

        executaAlgo();
        depoisExecutaAlgo();
        return true;
    }

    private void depoisExecutaAlgo() {
        LOGGER.info("executei 2");
    }

    private void executaAlgo() {
        LOGGER.info("executei");
    }
}
