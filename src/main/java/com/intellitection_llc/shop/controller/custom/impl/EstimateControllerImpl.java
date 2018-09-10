package com.intellitection_llc.shop.controller.custom.impl;

import com.intellitection_llc.shop.controller.custom.EstimateController;
import com.intellitection_llc.shop.dao.DAOFactory;
import com.intellitection_llc.shop.dao.custom.EstimateDAO;
import com.intellitection_llc.shop.dto.EstimateDTO;
import com.intellitection_llc.shop.dto.ViewAllEstimateDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class EstimateControllerImpl implements EstimateController {

    private EstimateDAO estimateDAO;

    public EstimateControllerImpl() throws SQLException, ClassNotFoundException {
        estimateDAO = (EstimateDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ESTIMATE);
    }

    @Override
    public ArrayList<ViewAllEstimateDTO> getAllEstimates() throws Exception {
        return estimateDAO.getAllEstimates();
    }


    @Override
    public boolean add(EstimateDTO dto) throws Exception {

        boolean result = estimateDAO.add(dto);
        return result;
    }

    @Override
    public boolean update(EstimateDTO dto) throws Exception {

        boolean result = estimateDAO.update(dto);
        return result;
    }

    @Override
    public EstimateDTO search(String key) throws Exception {
        return null;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return false;
    }

    @Override
    public ArrayList<EstimateDTO> getAll() throws Exception {
        return estimateDAO.getAll();
    }
}
