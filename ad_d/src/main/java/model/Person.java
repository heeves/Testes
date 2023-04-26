package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@JsonIgnoreProperties(ignoreUnknown = true)

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	public int getQuantidadeDeDados() {
		return quantidadeDeDados;
	}
	public void setQuantidadeDeDados(int quantidadeDeDados) {
		this.quantidadeDeDados = quantidadeDeDados;
	}
	public int getFacesDoDado() {
		return facesDoDado;
	}
	public void setFacesDoDado(int facesDoDado) {
		this.facesDoDado = facesDoDado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
