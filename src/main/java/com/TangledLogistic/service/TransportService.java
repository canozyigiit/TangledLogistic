package com.TangledLogistic.service;

import com.TangledLogistic.domain.Box;
import com.TangledLogistic.domain.response.TransportResponse;

import java.util.List;

public interface TransportService {


    TransportResponse transportBoxes(List<Box> boxes);
}
