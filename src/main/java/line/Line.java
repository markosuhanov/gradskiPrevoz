package line;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Stop.Stop;
import schedule.Schedule;
import transport.Transport;

@Entity
public class Line {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany
	@Column(nullable = false)
	private List<Stop> stop;
	
	@Column(nullable = false)
	private Schedule schedule;
	
	@Column(nullable = false)
	private Transport transport;
}
