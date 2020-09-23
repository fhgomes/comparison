package fernando.br.valida2x;

import fernando.br.OutroService;

import java.util.logging.Logger;

public class ClasseService2ValidacoesSingleExit {

    private static final Logger LOGGER = Logger.getLogger(ClasseService2ValidacoesSingleExit.class.getName());
    private OutroService outroService;

    public void metodoPublic() {
        if(outroService.podeExecutar() && outroService.podeExecutar2()) {
            executaAlgo();
            depoisExecutaAlgo();
        }

    }

    public boolean metodoPublicValidar() {
        if(outroService.podeExecutar()) {
            executaAlgo();
            if(outroService.podeExecutar2()) {
                depoisExecutaAlgo();
                return true;
            }
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
