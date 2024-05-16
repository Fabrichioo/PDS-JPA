package SportTrainning;

import java.util.LinkedList;

import javax.persistence.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private long idUsuario;
	
	private Integer edad;
	
	private Integer puntosEstrella;
	
	public enum Sexo {HOMBRE, MUJER};
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@OneToMany(mappedBy="usuario")
	private LinkedList<ProgramaDeportivo> programas;
	
	public Usuario(Integer edad, Sexo sexo) {
		this.edad = edad;
		this.sexo = sexo;
		this.puntosEstrella = 0;
		this.programas = new LinkedList<ProgramaDeportivo>();
	}
}
