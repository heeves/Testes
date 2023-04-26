package web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Personagem;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
	
	private List<Personagem> personagens =  new ArrayList<>();
	
		@Autowired
		private UserRepository userRepository;	
		
		Personagem personagens = new Personagem();
		
		personagens.SetId(1);
		personagens.SetCategoria("Heróis");
		personagens.SetNome("Guerreiro");
		personagens.SetVida(20);
		personagens.SetForca(7);
		personagens.SetDefesa(5);
		personagens.SetAgilidade(6);
		personagens.SetQuantidadeDeDados(1);
		personagens.SetFacesDoDado(12);
		personagens.add(personagens);
		
		personagens.SetId(2);
		personagens.SetCategoria("Heróis");
		personagens.SetNome("Barbáro");
		personagens.SetVida(21);
		personagens.SetForca(10);
		personagens.SetDefesa(2);
		personagens.SetAgilidade(5);
		personagens.SetQuantidadeDeDados(2);
		personagens.SetFacesDoDado(8);
		personagens.add(personagens);
		
		personagens.SetId(3);
		personagens.SetCategoria("Heróis");
		personagens.SetNome("Cavalheiro");
		personagens.SetVida(26);
		personagens.SetForca(6);
		personagens.SetDefesa(8);
		personagens.SetAgilidade(3);
		personagens.SetQuantidadeDeDados(2);
		personagens.SetFacesDoDado(6);
		personagens.add(personagens);
		
		personagens.SetId(4);
		personagens.SetCategoria("Montros");
		personagens.SetNome("Orc");
		personagens.SetVida(42);
		personagens.SetForca(7);
		personagens.SetDefesa(1);
		personagens.SetAgilidade(2);
		personagens.SetQuantidadeDeDados(3);
		personagens.SetFacesDoDado(4);
		personagens.add(personagens);
		
		personagens.SetId(5);
		personagens.SetCategoria("Montros");
		personagens.SetNome("Gigante");
		personagens.SetVida(34);
		personagens.SetForca(10);
		personagens.SetDefesa(4);
		personagens.SetAgilidade(4);
		personagens.SetQuantidadeDeDados(2);
		personagens.SetFacesDoDado(6);
		personagens.add(personagens);
		
		personagens.SetId(6);
		personagens.SetCategoria("Montros");
		personagens.SetNome("Lobisomem");
		personagens.SetVida(34);
		personagens.SetForca(7);
		personagens.SetDefesa(4);
		personagens.SetAgilidade(7);
		personagens.SetQuantidadeDeDados(2);
		personagens.SetFacesDoDado(4);
		personagens.add(personagens);
		
		@PostMapping("/")
		public Personagem personagem(@RequestBody Personagem personagem) {
			return this.userRepository.save(user);
	
		}
		
		@GetMapping("/List")
		public List<Personagem> List() {
			return this.userRepository.findAll();
		}
		@GetMapping("/List"/{"dano"} *)
		public List<Personagem> List(Morethan(@PathVariable("dano") int dano) {
			return this.userRepository.findByDanoGreaterThan(dano);
		}
	}


