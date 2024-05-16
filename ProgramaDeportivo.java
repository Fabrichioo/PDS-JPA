package SportTrainning;

import java.util.Calendar;

import javax.persistence.*;

@Entity
public class ProgramaDeportivo {
	
	@Id
	@GeneratedValue
	private long idPrograma;
	
	private Double precio;
	
	private Integer numDias;
	
	public enum Franja {MAÑANA, TARDE};

	@Enumerated(EnumType.STRING)
	private Franja franja;
	
	@ManyToOne
	private CentroDeportivo centro;
	
	@ManyToOne
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaInicio;
}
