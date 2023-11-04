package com.exercises.modules.m24_unitTests.services;

import com.exercises.modules.m24_unitTests.dao.IContractDAO;

public class UpdateContractService implements IUpdateContractService {

    private final IContractDAO contractDAO;
    public UpdateContractService(final IContractDAO dao) {
        this.contractDAO = dao;
    }
    @Override
    public boolean execute() {
        try {
            contractDAO.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
