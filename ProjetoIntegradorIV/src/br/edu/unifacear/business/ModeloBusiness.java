package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Modelo;

public class ModeloBusiness {
	
public void inserir(Modelo modelo) throws BusinessException{
		
		if (modelo.getDescricao() == null) { 
			throw new BusinessException("Erro: Nome n�o pode ser vazio");
		}
			
		Dao<Modelo> ModeloDao = FabricaDao.criarModeloDao();
		ModeloDao.inserir(modelo);
	}

}
