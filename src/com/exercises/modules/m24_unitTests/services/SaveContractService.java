package com.exercises.modules.m24_unitTests.services;

import com.exercises.modules.m24_unitTests.dao.IContractDAO;

public class SaveContractService implements ISaveContractService {

    private final IContractDAO contractDAO;
    public SaveContractService(final IContractDAO dao) {
        this.contractDAO = dao;
    }

    @Override
    public boolean execute() {
        try{
            contractDAO.save();
            return true;
        } catch (Exception e) {
            throw e;
        }

    }
}
