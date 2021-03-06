/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginModel;

/**
 *
 * @author Marcos Ferreira
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
                
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String msg = "Usuario e ou senha invalidos!";
        HttpSession sessao = request.getSession();
           // request.setAttribute("login", login);
            //request.setAttribute("senha", senha);
        LoginDao loginDao = new LoginDao();
        LoginModel loginModel = new  LoginModel();
        loginModel.setUsuario(login);
        loginModel.setSenha(senha);
        LoginModel valida = loginDao.verificarLogin(loginModel);
        try{
        
        if(valida.getUsuario().equals(login) && valida.getSenha().equals(senha)){
            sessao.setAttribute("usuario", valida.getUsuario());
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
        }else{
           request.setAttribute("msg", msg);
           request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        }catch(ServletException | IOException e){
            //request.setAttribute("msg", msg);
            //request.getRequestDispatcher("index.jsp").forward(request, response);
            //response.sendRedirect("index.jsp");
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
