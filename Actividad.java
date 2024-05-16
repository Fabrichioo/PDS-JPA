package SportTrainning;

import java.util.LinkedList;

import javax.persistence.*;

@Entity
public class Actividad {

	@Id
	@GeneratedValue
	private long idActividad;
	
	public enum Deporte {SPINNING, ZUMBA, TENIS, PILATES};
	
	@Enumerated(EnumType.STRING)
	private Deporte deporte;
	
	@OneToMany(mappedBy="actividad")
	private LinkedList<ReservaActividad> reservas;
	
	@ManyToOne
	private CentroDeportivo centro;
	
	private Double precio;
}
