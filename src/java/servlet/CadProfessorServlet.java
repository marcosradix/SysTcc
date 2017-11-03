/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CadProfessorDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CadProfessorModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "CadProfessorServlet", urlPatterns = {"/CadProfessorServlet"})
public class CadProfessorServlet extends HttpServlet {
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
        
        String nome = request.getParameter("nomeCompleto");
       String nascimento = request.getParameter("dataNascimento");
       String sexo = request.getParameter("sexo");
       String matriculaFunc = request.getParameter("matricula");
       String rg = request.getParameter("rg");
       String cpf = request.getParameter("cpf");
       String email = request.getParameter("email");
       String telFixo = request.getParameter("telFixo");
       String telCelular = request.getParameter("telCelular");
       String endereco = request.getParameter("endereco");
       String numero = request.getParameter("numero");
       String bairro = request.getParameter("bairro");
       String cidade = request.getParameter("cidade");
       String estado = request.getParameter("estado");
       String cep = request.getParameter("cep");
       //request.setAttribute("nome", nome);
       //request.setAttribute("dataNascimento", nascimento);
       try{
                  CadProfessorDao cadProfessorDao = new CadProfessorDao();
       CadProfessorModel cadProfessorModel = new CadProfessorModel(nome, nascimento, sexo, matriculaFunc, rg, cpf, email
               , telFixo, telCelular, endereco,numero, bairro, cidade, estado, cep);
       cadProfessorDao.salvar(cadProfessorModel);
       response.sendRedirect("cadProfessor.html");
       }catch(Exception e){
       response.sendRedirect("erros.jsp");
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
       String nome = request.getParameter("nomeCompleto");
       String nascimento = request.getParameter("dataNascimento");
       String sexo = request.getParameter("sexo");
       String matriculaFunc = request.getParameter("matricula");
       String rg = request.getParameter("rg");
       String cpf = request.getParameter("cpf");
       String email = request.getParameter("email");
       String telFixo = request.getParameter("telFixo");
       String telCelular = request.getParameter("telCelular");
       String endereco = request.getParameter("endereco");
       String numero = request.getParameter("numero");
       String bairro = request.getParameter("bairro");
       String cidade = request.getParameter("cidade");
       String estado = request.getParameter("estado");
       String cep = request.getParameter("cep");
       //request.setAttribute("nome", nome);
       //request.setAttribute("dataNascimento", nascimento);
       try{
       CadProfessorDao cadProfessorDao = new CadProfessorDao();
       CadProfessorModel cadProfessorModel = new CadProfessorModel(id,nome, nascimento, sexo, matriculaFunc, rg, cpf, email
               , telFixo, telCelular, endereco,numero, bairro, cidade, estado, cep);
       cadProfessorDao.editar(cadProfessorModel);
       response.sendRedirect("profCadastrados.jsp");
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
