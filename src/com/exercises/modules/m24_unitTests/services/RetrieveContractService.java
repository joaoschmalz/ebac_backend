package com.exercises.modules.m24_unitTests.services;

import com.exercises.modules.m24_unitTests.dao.IContractDAO;

public class RetrieveContractService implements IRetrieveContractService {

    private final IContractDAO contractDAO;
    public RetrieveContractService(final IContractDAO dao) {
        this.contractDAO = dao;
    }

    @Override
    public String execute(Long id) {
        try {
            return contractDAO.retrieve();
        } catch (Exception e) {
            return "";
        }
    }
}
