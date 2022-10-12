package com.promineotech.jeep.service;

import java.util.List;
//import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public interface JeepSalesService {
  
  /**
   * 
   * @param model
   * @param trim
   * @return
   */
  
  List<Jeep> fetchJeeps(JeepModel model, String trim);
  
  }


