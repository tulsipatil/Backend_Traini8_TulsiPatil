package com.example.trainingcentersregistry.services;

import com.example.trainingcentersregistry.entities.Center;
import com.example.trainingcentersregistry.payloads.CenterDto;
import com.example.trainingcentersregistry.repositories.CenterRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Implements CenterService interface
@Service
public class CenterServiceImpl implements CenterService
{
    @Autowired
    private CenterRepo centerRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CenterDto createCenter(CenterDto centerDto)
    {
        Center center = this.centerDtoToCenter(centerDto);
        Center savedCenter = this.centerRepo.save(center);
        return this.centerToCenterDto(savedCenter);
    }

    @Override
    public List<CenterDto> getAllCenters()
    {
        List<Center> centers = this.centerRepo.findAll();
        List<CenterDto> centerDtos = centers.stream().map(this::centerToCenterDto).toList();
        return centerDtos;
    }

    private Center centerDtoToCenter(CenterDto centerDto){
        Center center = this.modelMapper.map(centerDto, Center.class);
        return center;
    }

    private CenterDto centerToCenterDto(Center center){
        CenterDto centerDto = this.modelMapper.map(center, CenterDto.class);
        return centerDto;
    }
}
