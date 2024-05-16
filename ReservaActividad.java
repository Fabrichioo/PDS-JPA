package SportTrainning;

import javax.persistence.*;

@Entity
public class ReservaActividad extends Reserva{
	
	@ManyToOne
	private Actividad actividad;
	
	public ReservaActividad(Actividad actividad) {
		super();
		this.actividad = actividad;
	}

}
