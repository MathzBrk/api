package med.voll.api.domain.consulta.validacoes.agendamento;
import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidatorHorarioAntecedencia implements IValidatorAgendamentoDeConsultas {

    public void validar( DadosAgendamentoConsulta dados) {
        var dadosConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaMinutos = Duration.between(agora, dadosConsulta).toMinutes();

        if(diferencaMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedencia mínima de 30 minutos");
        }
    }

}
