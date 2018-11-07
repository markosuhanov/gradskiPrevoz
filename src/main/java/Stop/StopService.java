package Stop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StopService {

	@Autowired
	StopRepository stopRepository;
	
	public List<Stop> findAll(){
		return stopRepository.findAll();
	}
	
	public Stop findOne(long id) {
		return stopRepository.getOne(id);
	}
	
	public Stop save(Stop stop) {
		return stopRepository.save(stop);
	}
	
	public void delete(Stop stop) {
		stopRepository.delete(stop);

	}
}
