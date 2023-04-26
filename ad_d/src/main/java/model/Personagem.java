package model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Personagem {
	
	@ID
	@GenerateValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoria;
	private String nome;
	private int vida;
	private int forca;
	private int defesa;
	private int agilidade;
	private int quantidadeDeDados;
	private int facesDoDado;
}
