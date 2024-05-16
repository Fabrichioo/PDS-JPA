package SportTrainning;

import javax.persistence.*;

@Entity
public class ReservaInstalacion extends Reserva{

	@ManyToOne
	private Instalacion instalacion;
	
	public ReservaInstalacion(Instalacion instalacion) {
		super();
		this.instalacion = instalacion;
	}
}
