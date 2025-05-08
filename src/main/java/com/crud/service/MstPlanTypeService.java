package com.crud.service;

import com.crud.entity.MstPlanType;

import java.util.List;

public interface MstPlanTypeService {
    MstPlanType add(MstPlanType mstPlanType);
    MstPlanType updateByGuid(String guid, MstPlanType updatedData);
    void deleteByGuid(String guid);
    List <MstPlanType> findAll();
    MstPlanType getByGuid(String guid);
}
