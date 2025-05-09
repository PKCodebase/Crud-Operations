package com.crud.repository;

import com.crud.entity.MstPlanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MstPlanTypeRepository extends JpaRepository<MstPlanType,String>{
    @Query(value = "SELECT MAX(CAST(SUBSTRING(plan_type_guid FROM 5) AS INTEGER)) FROM obps.mst_plan_type WHERE plan_type_guid LIKE 'GUID%'", nativeQuery = true)
    Integer maxGuidNumber();

}
