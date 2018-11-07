package transport;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Stop.Stop;

@Entity
public class Transport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private int transportType;  
	/*\
	 * 1 - bus
	 * 2 - tram
	 * 3 - metro
	 */
	
	@OneToMany
	@Column(nullable = false)
	private List<Stop> stop;
}
