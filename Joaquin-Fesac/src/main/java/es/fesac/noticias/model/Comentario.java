package es.fesac.noticias.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Comentario {
	private String contenido;

	@ManyToOne
	private Usuario usuario;

	@OneToMany
	private Mensaje mensaje;

	public Comentario(String contenido, Usuario usuario, Mensaje mensaje) {
		super();
		this.contenido = contenido;
		this.usuario = usuario;
		this.mensaje = mensaje;
	}

	public Comentario() {
		super();
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

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

}
