package transport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransportService {

	
	@Autowired
	TransportRepository transportRepository;
	
	public List<Transport> findAll(){
		return transportRepository.findAll();
	}
	
	public Transport findOne(long id) {
		return transportRepository.getOne(id);
	}
	
	public Transport save(Transport stop) {
		return transportRepository.save(stop);
	}
	
	public void delete(Transport stop) {
		transportRepository.delete(stop);

	}
}
