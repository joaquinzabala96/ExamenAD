package es.fesac.noticias.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import es.fesac.noticias.model.Usuario;

@Entity
public class Mensaje {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private ArrayList<String> comentarios = new ArrayList<String>();

	@Lob
	private String contenido;

	@ManyToOne
	private Usuario usuario;
	
	public Mensaje(long id, ArrayList<String> comentarios, String contenido, Usuario usuario) {
		super();
		this.id = id;
		this.comentarios = comentarios;
		this.contenido = contenido;
		this.usuario = usuario;
	}
	
	public Mensaje() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<String> comentarios) {
		this.comentarios = comentarios;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
