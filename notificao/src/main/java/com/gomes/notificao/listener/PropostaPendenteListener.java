package com.gomes.notificao.listener;

import com.gomes.notificao.constante.MensagemConstante;
import com.gomes.notificao.domain.Proposta;
import com.gomes.notificao.service.NotificacaoSnsService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PropostaPendenteListener {

private NotificacaoSnsService notificacaoSnsService;
@RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta){
        String mensagem = String.format(MensagemConstante.PROPOSTA_EM_ANALISE,proposta.getUsuario().getNome());
        notificacaoSnsService.notificar(proposta.getUsuario().getTelefone(), mensagem);
    }
}
