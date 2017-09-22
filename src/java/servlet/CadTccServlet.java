/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CadastrarTccDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CadastrarTccModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "CadTcc", urlPatterns = {"/CadTcc"})
public class CadTccServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
    response.setCharacterEncoding("UTF-8");
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
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
                String resumo = request.getParameter("resumo");
                String pavra_chave = request.getParameter("pavra_chave");
                String autor = request.getParameter("autor");
                String orientador = request.getParameter("orientador");
                String curso = request.getParameter("curso");
                
                
                CadastrarTccDao cadastrarTccDao = new CadastrarTccDao();
                CadastrarTccModel cadastrarTccModel = new CadastrarTccModel();
                cadastrarTccModel.setResumo(resumo);
                cadastrarTccModel.setPalavraChave(pavra_chave);
                cadastrarTccModel.setAutor(autor);
                cadastrarTccModel.setOrientador(orientador);
                cadastrarTccModel.setCurso(curso);
                cadastrarTccDao.salvar(cadastrarTccModel);
                System.out.println("Salvo com sucesso!");
                //request.setAttribute("resumo", resumo);
                //request.setAttribute("pavra_chave", pavra_chave);
                //request.setAttribute("autor", autor);
                //request.setAttribute("orientador", orientador);
                //request.setAttribute("curso", curso);
                request.getRequestDispatcher("cadTcc.html").forward(request, response);
        
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
        processRequest(request, response);
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
