/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDao;

import dao.CadastrarTccDao;
import java.util.List;
import model.AgendamentoTccModel;


/**
 *
 * @author Marcos Ferreira
 */
public interface IAgendamentoTcc {
    public void salvar(AgendamentoTccModel agendamentoTcc);
    public void deletar(AgendamentoTccModel id);
    public List<AgendamentoTccModel> listar(String curso);
    public AgendamentoTccModel buscar(Long id);
    //public CadastrarTccDao buscarNome(String nome);
    public void editar(AgendamentoTccModel agendamentoTccTccModel);
}
