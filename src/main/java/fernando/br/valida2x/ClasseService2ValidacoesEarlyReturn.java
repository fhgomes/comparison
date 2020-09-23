package fernando.br.valida2x;

import fernando.br.OutroService;

import java.util.logging.Logger;

public class ClasseService2ValidacoesEarlyReturn {

    private static final Logger LOGGER = Logger.getLogger(ClasseService2ValidacoesEarlyReturn.class.getName());

    private OutroService outroService;

    public void metodoPublic() {
        if (!outroService.podeExecutar() || !outroService.podeExecutar2()) {
            return;
        }

        executaAlgo();
        depoisExecutaAlgo();
    }

    public boolean metodoPublicValidar() {
        if (!outroService.podeExecutar()) {
            return false;
        }

        executaAlgo();
        if (!outroService.podeExecutar2()) {
            return false;
        }

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
