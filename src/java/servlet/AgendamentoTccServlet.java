/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.AgendamentoTccDao;
import dao.CadastrarTccDao;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AgendamentoTccModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "agendamentoTccServlet", urlPatterns = {"/agendamentoTccServlet"})
public class AgendamentoTccServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html; charset=UTF-8");
                request.setCharacterEncoding("UTF-8");
                String tcc = request.getParameter("tcc");
                String tituloTcc = request.getParameter("tituloTcc");
                
                String aluno = request.getParameter("aluno");
                String curso = request.getParameter("curso");
                
                String orientador = request.getParameter("orientador");
                String avaliadorInterno = request.getParameter("avaliadorInterno");
                
                String avaliadorExterno = request.getParameter("avaliadorExterno");
                String areaConhecimento = request.getParameter("areaConhecimento");
                
                String dataInicio = request.getParameter("dataInicio");
                String dataFinal = request.getParameter("dataFinal");
                
                String dataDefesa = request.getParameter("dataDefesa");
                String resultDefesa = request.getParameter("resultDefesa");
                
                AgendamentoTccDao agendamentoTccDao = new AgendamentoTccDao();
                
                AgendamentoTccModel agendamentoTccModel = new AgendamentoTccModel(
                tcc, tituloTcc, aluno, curso,orientador ,avaliadorInterno, avaliadorExterno,
                areaConhecimento,dataInicio,dataFinal,dataDefesa, resultDefesa
                );
                agendamentoTccDao.salvar(agendamentoTccModel);
                
            request.getRequestDispatcher("agendamentoTcc.jsp").forward(request, response);
    }
    
     protected void processRequestEditar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html; charset=UTF-8");
                request.setCharacterEncoding("UTF-8");
                Long id = Long.parseLong(request.getParameter("id"));
                String tcc = request.getParameter("tcc");
                String tituloTcc = request.getParameter("tituloTcc");
                
                String aluno = request.getParameter("aluno");
                String curso = request.getParameter("curso");
                
                String orientador = request.getParameter("orientador");
                String avaliadorInterno = request.getParameter("avaliadorInterno");
                
                String avaliadorExterno = request.getParameter("avaliadorExterno");
                String areaConhecimento = request.getParameter("areaConhecimento");
                
                String dataInicio = request.getParameter("dataInicio");
                String dataFinal = request.getParameter("dataFinal");
                
                String dataDefesa = request.getParameter("dataDefesa");
                String resultDefesa = request.getParameter("resultDefesa");
                
                AgendamentoTccDao agendamentoTccDao = new AgendamentoTccDao();
                
                AgendamentoTccModel agendamentoTccModel = new AgendamentoTccModel(id,
                tcc, tituloTcc, aluno, curso,orientador ,avaliadorInterno, avaliadorExterno,
                areaConhecimento,dataInicio,dataFinal, dataDefesa, resultDefesa
                );
                agendamentoTccDao.editar(agendamentoTccModel);
                
                response.sendRedirect("pescAgendamentos.jsp");
            //request.getRequestDispatcher("pescAgendamentos.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
               

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequestEditar(request, response);
                      
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
