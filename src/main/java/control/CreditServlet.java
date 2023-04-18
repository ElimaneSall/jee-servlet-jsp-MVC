package control;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import metier.ICredit;
import metier.ImplCredit;

import java.io.IOException;

@WebServlet(name = "CreditServlet", value = "/CreditServlet")
public class CreditServlet extends HttpServlet {

    private ICredit metier ;

    @Override
    public void init() throws ServletException {
        super.init();

        metier = new ImplCredit();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("CreditModel", new CreditModel());
        request.getRequestDispatcher("/WEB-INF/VueCredit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get des donnees
        double capital = Double.parseDouble(request.getParameter("montant"));
        double taux = Double.parseDouble(request.getParameter("taux"));
        double duree = Double.parseDouble(request.getParameter("duree"));

        // Valider les donnees cote serveur

        // stocker les donnees
        CreditModel model = new CreditModel();
        model.setCapital(capital);
        model.setDuree(duree);
        model.setTaux(taux);

        // traitement

        double res = metier.CalculMensualite(capital, taux, duree);

        model.setMensualite(res);

        // Stocker le modele dans l'objet request
        request.setAttribute("CreditModel", model);
        //Redirection

        request.getRequestDispatcher("/WEB-INF/VueCredit.jsp").forward(request, response);

    }
}
