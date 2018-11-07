package schedule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import myLocalTime.MyLocalTime;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private Date dateFrom;
	
	@Column(nullable = false)
	private int dateType;
	/*
	 * 1 - workDay
	 * 2 - saturday
	 * 3 - sunday
	 */
	
	@Column(nullable = false)
	private MyLocalTime myLocalTime;
}
