package com.example.driveremote.services;

import com.example.driveremote.models.Results;
import com.example.driveremote.models.User;

import java.util.List;
import java.util.Optional;

public interface ResultsService {
    Results saveResult(Results result);
    List<Results> findAll();
    List<Results> getResultsByUserId(Integer userId);
    Results getLastResultByUserId(Integer userId);
}
