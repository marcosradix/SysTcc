/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CadTecnicoAdmDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CadTecnicoAdmModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "CadTecnicoAdmServlet", urlPatterns = {"/CadTecnicoAdmServlet"})
public class CadTecnicoAdmServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
     
       String nascimento = request.getParameter("dataNascimento");
       String sexo = request.getParameter("sexo");
       String matricula = request.getParameter("matricula");
       String rg = request.getParameter("rg");
       String cpf = request.getParameter("cpf");
       String nome = request.getParameter("nome");
       String email = request.getParameter("email");
       String telFixo = request.getParameter("telFixo");
       String telCelular = request.getParameter("telCelular");
       String endereco = request.getParameter("endereco");
       String numero = request.getParameter("numero");
       String bairro = request.getParameter("bairro");
       String cidade = request.getParameter("cidade");
       String estado = request.getParameter("estado");
       String cep = request.getParameter("cep");
       CadTecnicoAdmModel cadTecnicoAdmModel = new CadTecnicoAdmModel(nome, nascimento,sexo, matricula, rg, cpf, email, telFixo, telCelular, endereco, numero,bairro, cidade, estado, cep  );
       CadTecnicoAdmDao cadTecnicoAdmDao = new CadTecnicoAdmDao();
       cadTecnicoAdmDao.salvar(cadTecnicoAdmModel);
       request.getRequestDispatcher("cadTecnicoAdm.jsp").forward(request, response);
       
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
        //processRequest(request, response);
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
