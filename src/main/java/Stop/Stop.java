package Stop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stop {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private double xCoordinate;
	
	@Column(nullable = false)
	private double yCoordinate;
	
	@Column(nullable = false)
	private String name;
	

}
