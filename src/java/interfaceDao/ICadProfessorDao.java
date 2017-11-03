/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDao;

import java.util.List;
import model.CadProfessorModel;

/**
 *
 * @author lricardo
 */
public interface ICadProfessorDao {
    public void salvar(CadProfessorModel cadProfessorModel);
    public void deletar(CadProfessorModel id);
    public List<CadProfessorModel> listar(String Professor);
    public CadProfessorModel buscar(Long id);
    public void editar(CadProfessorModel cadProfessorModel);   
    
    
    
}
