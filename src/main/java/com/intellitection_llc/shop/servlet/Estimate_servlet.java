package com.intellitection_llc.shop.servlet;

import com.intellitection_llc.shop.controller.custom.EstimateController;
import com.intellitection_llc.shop.controller.custom.EstimateDetailsController;
import com.intellitection_llc.shop.controller.custom.ItemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Estimate_servlet extends HttpServlet {

    private EstimateController estimateController;
    private EstimateDetailsController estimateDetailsController;
    private ItemController itemController;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String estimateid = req.getParameter("txtEstimateid");
        String status = req.getParameter("txtEstimatestaus");




    }
}
