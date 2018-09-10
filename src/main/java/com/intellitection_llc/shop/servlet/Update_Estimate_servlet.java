package com.intellitection_llc.shop.servlet;

import com.intellitection_llc.shop.controller.ControllerFactory;
import com.intellitection_llc.shop.controller.custom.EstimateController;
import com.intellitection_llc.shop.controller.custom.EstimateDetailsController;
import com.intellitection_llc.shop.controller.custom.ItemController;
import com.intellitection_llc.shop.dto.EstimateDTO;
import com.intellitection_llc.shop.dto.EstimateDetailsDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/Test")
public class Update_Estimate_servlet extends HttpServlet {

    private EstimateController estimateController;
    private EstimateDetailsController estimateDetailsController;
    private ItemController itemController;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            estimateController = (EstimateController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerType.ESTIMATE);
            estimateDetailsController = (EstimateDetailsController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerType.ESTIMATEDETAILS);
            itemController = (ItemController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerType.ITEMS);

            String estimateid = req.getParameter("txtEstimateid");
            String status = req.getParameter("txtStatus");
            String itemcode = req.getParameter("txtItemcode");
            String qty = req.getParameter("txtUnit");

            EstimateDTO estimateDTO = new EstimateDTO(estimateid,status);
            EstimateDetailsDTO estimateDetailsDTO = new EstimateDetailsDTO(estimateid,itemcode,qty);

            boolean estimaupdate = estimateController.update(estimateDTO);
            boolean estimaDetailsupdate = estimateDetailsController.update(estimateDetailsDTO);

            if(estimaupdate && estimaDetailsupdate){
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Manage_Estimate.jsp");
                requestDispatcher.include(req,resp);

            }else {
                resp.sendRedirect(req.getContextPath() + "/Manage_Estimate.jsp");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
