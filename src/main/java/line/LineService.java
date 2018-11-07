package line;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineService {

	@Autowired
	LineRepository lineRepository;
	
	public List<Line> findAll(){
		return lineRepository.findAll();
	}
	
	public Line findOne(long id) {
		return lineRepository.getOne(id);
	}
	
	public Line save(Line line) {
		return lineRepository.save(line);
	}
	
	public void delete(Line line) {
		lineRepository.delete(line);

	}
	
}

