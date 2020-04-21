package com.kgisl.task.service;

import java.util.List;
import com.kgisl.task.entity.Resources;


public interface ResourcesService {

    public List<Resources> getRes();

    public Resources createres(Resources res);

}
