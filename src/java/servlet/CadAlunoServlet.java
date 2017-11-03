/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CadAlunoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CadAlunoModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "CadAlunoServlet", urlPatterns = {"/CadAlunoServlet"})
public class CadAlunoServlet extends HttpServlet {

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
       String matricula = request.getParameter("matricula");
       String curso = request.getParameter("curso");
       String semestre = request.getParameter("semestre");
       String turno = request.getParameter("turno");
       
            try{
            CadAlunoDao cadAlunoDao = new CadAlunoDao();
            CadAlunoModel cadAlunoModel = new CadAlunoModel(nome, nascimento, sexo ,rg, cpf, email, telFixo, telCelular,
                    endereco, numero, bairro, cidade, estado, cep, matricula, curso, semestre, turno);
       cadAlunoDao.salvar(cadAlunoModel);
       response.sendRedirect("cadAluno.html");
       }catch(Exception e){
       response.sendRedirect("erros.jsp");
       e.printStackTrace();
       }
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
                response.setContentType("text/html;charset=UTF-8");
       response.setCharacterEncoding("UTF-8");
       request.setCharacterEncoding("UTF-8");
       Long id = Long.parseLong(request.getParameter("id"));
       String nascimento = request.getParameter("dataNascimento");
       String sexo = request.getParameter("sexo");
       String rg = request.getParameter("rg");
       String cpf = request.getParameter("cpf");
       String nome = request.getParameter("nomeCompleto");
       String email = request.getParameter("email");
       String telFixo = request.getParameter("telFixo");
       String telCelular = request.getParameter("telCelular");
       String endereco = request.getParameter("endereco");
       String numero = request.getParameter("numero");
       String bairro = request.getParameter("bairro");
       String cidade = request.getParameter("cidade");
       String estado = request.getParameter("estado");
       String cep = request.getParameter("cep");
       String matricula = request.getParameter("matricula");
       String curso = request.getParameter("curso");
       String semestre = request.getParameter("semestre");
       String turno = request.getParameter("turno");      
            try{
            CadAlunoDao cadAlunoDao = new CadAlunoDao();
            CadAlunoModel cadAlunoModel = new CadAlunoModel(id, nome, nascimento, sexo ,rg, cpf, email, telFixo, telCelular,
                    endereco, numero, bairro, cidade, estado, cep, matricula, curso, semestre, turno);
       cadAlunoDao.editar(cadAlunoModel);
       response.sendRedirect("alunCadastrados.jsp");
       }catch(Exception e){
           response.sendRedirect("erros.jsp");
       e.printStackTrace();
       }
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
