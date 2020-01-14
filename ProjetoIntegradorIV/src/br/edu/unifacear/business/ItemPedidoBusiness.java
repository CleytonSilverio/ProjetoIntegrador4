package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.ItemPedido;

public class ItemPedidoBusiness {

	public void inserir(ItemPedido itempedido ) throws BusinessException{
		
		if (itempedido.getDescricao() == null) { 
			throw new BusinessException("Erro: Nome n�o pode ser vazio");
		}
			
		Dao<ItemPedido> ItemPedidoDao = FabricaDao.criarItemPedidoDao();
		ItemPedidoDao.inserir(itempedido);
	}

}
