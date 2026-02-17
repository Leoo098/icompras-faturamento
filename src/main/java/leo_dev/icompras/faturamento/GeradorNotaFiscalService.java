package leo_dev.icompras.faturamento;

import leo_dev.icompras.faturamento.model.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GeradorNotaFiscalService {

    public void gerar(Pedido pedido){
        log.info("Gerada nota fiscal para o pedido {} ", pedido.codigo());
    }
}
