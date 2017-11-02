/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDao;

import java.util.List;
import model.CadAlunoModel;

/**
 *
 * @author Usuário
 */
public interface ICadAlunoDao {
    public void salvar(CadAlunoModel cadAlunoModel);
    public void deletar(CadAlunoModel id);
    public List<CadAlunoModel> listar(String aluno);
    public CadAlunoModel buscar(Long id);
    public void editar(CadAlunoModel cadAlunoModel);   
    
    
    
}
