package br.com.kentec.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import br.com.kentec.domain.Modalidade;
import br.com.kentec.domain.TipoAtividade;
import br.com.kentec.domain.User;
import br.com.kentec.util.Comum;
import br.com.kentec.repository.ModalidadeRepository;
import br.com.kentec.repository.TipoAtividadeRepository;
import br.com.kentec.repository.UserRepository;

@Configuration
@Profile("dev")
public class CreateEntitysDefault {
	
	@Autowired
	private TipoAtividadeRepository tar;
	
	@Autowired
	private ModalidadeRepository mr;
	
	@Autowired
	private UserRepository ur;
	
	@Bean
	@Transactional
	CommandLineRunner executar() {
		return args ->{
			long tp = tar.count();
			if(tp == 0) {
				List<TipoAtividade> tipoAtividades = Arrays.asList(
					new TipoAtividade("Reconhecimento", "ATIVO"),
					new TipoAtividade("Pareamento", "ATIVO"),
					new TipoAtividade("Agrupamento", "ATIVO"),
					new TipoAtividade("Associação", "ATIVO")
			    );
				tar.saveAll(tipoAtividades);
			}
			
			long mod = mr.count();
			if(mod == 0) {
				List<Modalidade> modalidades = Arrays.asList(
					new Modalidade("Cores", "ATIVO"),
					new Modalidade("Formas", "ATIVO"),
					new Modalidade("Animais Domésticos", "ATIVO"),
					new Modalidade("Animais Fazenda", "ATIVO"),
					new Modalidade("Animais Silvestres", "ATIVO"),
					new Modalidade("Animais do Fundo do Mar", "ATIVO"),
					new Modalidade("Veículos", "ATIVO"),
					new Modalidade("Frutas", "ATIVO"),
					new Modalidade("Vogais", "ATIVO"),
					new Modalidade("Números", "ATIVO"),
					new Modalidade("Meios de Transporte", "ATIVO")
				);
				mr.saveAll(modalidades);
			}
			
			long users = ur.count();
			if(users == 0) {
				User user = new User();
				user.setNome("Kennedy Tomazete");
				user.setEmail("contato@kentec.com.br");
				user.setRole("DEV-SYSTEM");
				user.setStatus("Ativo");
				user.setSenhaUsuario(Comum.encrypt("devken"));
				user.setChaveUsuario(UUID.randomUUID().toString());
				ur.save(user);
			}
		};
	}

}
