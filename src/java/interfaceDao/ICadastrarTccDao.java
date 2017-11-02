/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDao;

import dao.CadastrarTccDao;
import java.util.List;
import model.CadastrarTccModel;

/**
 *
 * @author Marcos Ferreira
 */
public interface ICadastrarTccDao {
    public void salvar(CadastrarTccModel cadastrarTccModel);
    public void deletar(CadastrarTccModel id);
    public List<CadastrarTccModel> listar(String tcc);
    public CadastrarTccModel buscar(Long id);
    //public CadastrarTccDao buscarNome(String nome);
    public void editar(CadastrarTccModel cadastrarTccModel);
    
    
    
}
