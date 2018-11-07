package schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	public List<Schedule> findAll(){
		return scheduleRepository.findAll();
	}
	
	public Schedule findOne(long id) {
		return scheduleRepository.getOne(id);
	}
	
	public Schedule save(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}
	
	public void delete(Schedule schedule) {
		scheduleRepository.delete(schedule);

	}
}
