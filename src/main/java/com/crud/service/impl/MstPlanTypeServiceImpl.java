package com.crud.service.impl;

import com.crud.entity.MstPlanType;
import com.crud.exception.ResourceNotFoundException;
import com.crud.repository.MstPlanTypeRepository;
import com.crud.service.MstPlanTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MstPlanTypeServiceImpl implements MstPlanTypeService {

    private final MstPlanTypeRepository mstPlanTypeRepository;

    public MstPlanTypeServiceImpl( MstPlanTypeRepository mstPlanTypeRepository) {
        this.mstPlanTypeRepository = mstPlanTypeRepository;
    }

    @Override
    public MstPlanType add(MstPlanType mstPlanType) {
        Integer maxNumber = mstPlanTypeRepository.maxGuidNumber();
        int nextNumber = (maxNumber == null) ? 1 : maxNumber+1;
        String newGuidNum = "GUID" + nextNumber;
        mstPlanType.setPlanTypeGuid(newGuidNum);
        return mstPlanTypeRepository.save(mstPlanType);
    }

    @Override
    public MstPlanType updateByGuid(String guid, MstPlanType updatedData) {
        MstPlanType existingData = mstPlanTypeRepository.findById(guid)
                .orElseThrow(() -> new ResourceNotFoundException("GUID not found : " + guid));
        existingData.setPlanTypeCode(updatedData.getPlanTypeCode());
        existingData.setPlanTypeId(updatedData.getPlanTypeId());
        existingData.setPlanTypeNameEn(updatedData.getPlanTypeNameEn());
        existingData.setPlanTypeNameHi(updatedData.getPlanTypeNameHi());
        existingData.setPlanTypeNameRl(updatedData.getPlanTypeNameRl());
        existingData.setPlanTypeDescription(updatedData.getPlanTypeDescription());
        existingData.setCreatedBy(updatedData.getCreatedBy());
        existingData.setRemarks(updatedData.getRemarks());
        return mstPlanTypeRepository.save(existingData);

    }

    @Override
    public void deleteByGuid(String guid) {
        MstPlanType  existingData = mstPlanTypeRepository.findById(guid)
                .orElseThrow(() -> new ResourceNotFoundException("GUID not found: " + guid));
        mstPlanTypeRepository.delete(existingData);
    }

   @Override
    public List<MstPlanType> findAll() {
        return mstPlanTypeRepository.findAll();
    }

    @Override
    public MstPlanType getByGuid(String guid) {
      return mstPlanTypeRepository.findById(guid)
                .orElseThrow(() -> new ResourceNotFoundException("GUID not found : " + guid));

    }


}
