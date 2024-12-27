package com.richa.TestingApp.services.impl;

import com.richa.TestingApp.services.DataService;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImplDev implements DataService {

    @Override
    public String getData() {
        return "Dev Data";
    }
}
