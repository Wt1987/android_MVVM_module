package com.repository;





public class RealRepository {
    private static final RealRepository instance = new RealRepository();

    private RealRepository() {
    }

    public static RealRepository getInstance() {
        return instance;
    }

}
