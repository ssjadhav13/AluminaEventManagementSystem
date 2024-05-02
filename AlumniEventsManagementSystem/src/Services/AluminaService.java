package Services;

import Model.AluminaModel;
import Repository.AluminaRepository;

public class AluminaService {
	AluminaRepository aRepo = new AluminaRepository();
		public int addAlumina(AluminaModel model) 
		{	
			return aRepo.addAlumina(model)?1:0;
			
		}
	
}
