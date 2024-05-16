package SportTrainning;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Reserva {
	@Id
	@GeneratedValue
	private long idReserva;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaReserva;
	
	@Temporal(TemporalType.TIME)
	private Calendar horaReserva;
	
	public enum EstadoReserva {PENDIENTE, CONFIRMADA, REALIZADA};

	@Enumerated(EnumType.STRING)
	private EstadoReserva estado;
	
	private Double precio;
}
