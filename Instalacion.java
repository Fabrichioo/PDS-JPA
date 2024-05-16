package SportTrainning;

import java.util.LinkedList;

import javax.persistence.*;

public class Instalacion {

	@Id
	@GeneratedValue
	private long idInstalacion;
	
	public enum Deporte {ROCODROMO, GIMNASIO, PISTA_TENIS, PISTA_PADEL};

	@Enumerated(EnumType.STRING)
	private Deporte deporte;
	
	@OneToMany(mappedBy="instalacion")
	private LinkedList<ReservaActividad> reservas;
	
	@ManyToOne
	private CentroDeportivo centro;
	
}
