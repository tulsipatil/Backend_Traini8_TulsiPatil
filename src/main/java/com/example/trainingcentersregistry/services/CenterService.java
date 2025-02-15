package com.example.trainingcentersregistry.services;

import com.example.trainingcentersregistry.payloads.CenterDto;

import java.util.List;

public interface CenterService
{
    CenterDto createCenter(CenterDto centerDto);
    List<CenterDto> getAllCenters();
}
