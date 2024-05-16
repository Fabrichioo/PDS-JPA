package SportTrainning;

import java.util.LinkedList;

import javax.persistence.*;

@Entity
public class CentroDeportivo {

	@Id
	@GeneratedValue
	private long idCentro;
	
	@OneToMany(mappedBy="centro")
	private LinkedList<ProgramaDeportivo> programas;
	
	@OneToMany(mappedBy="centro")
	private LinkedList<Actividad> actividades;
	
	@OneToMany(mappedBy="centro")
	private LinkedList<Reserva> instalaciones;
	
}
