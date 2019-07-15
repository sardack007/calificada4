package clases;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name="clases.Controlador", urlPatterns="/controlador")
public class Controlador extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ColeccionCanalRadio coleccionRadios = new ColeccionCanalRadio();
        String tipo = request.getParameter("tipo");
        IFIterator iteradoTipo = coleccionRadios.createIteratorTipo(tipo);
        ArrayList<CanalRadio> lista = new ArrayList<>();
        while(iteradoTipo.hasNextItem()){
            lista.add(iteradoTipo.nextItem());
        }
        request.setAttribute("lista",lista);
        request.getRequestDispatcher("respuesta.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
