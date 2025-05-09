package com.crud.controller;

import com.crud.entity.MstPlanType;
import com.crud.service.impl.MstPlanTypeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mst-plan")
public class MstPlanTypeController {

    private final MstPlanTypeServiceImpl mstPlanTypeServiceImpl;

    public MstPlanTypeController(MstPlanTypeServiceImpl mstPlanTypeServiceImpl) {
        this.mstPlanTypeServiceImpl = mstPlanTypeServiceImpl;
    }

    @PostMapping("/add")
    @Operation(summary = "ADD")
    public ResponseEntity<MstPlanType> add(@RequestBody MstPlanType mstPlanType){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.add(mstPlanType));
    }

    @PutMapping("/update/{guid}")
    @Operation(summary = "UPDATE")
    public ResponseEntity<MstPlanType> update(@PathVariable String guid, @RequestBody MstPlanType updatedData){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.updateByGuid(guid, updatedData));
    }

    @DeleteMapping("/delete/{guid}")
    @Operation(summary="DELETE")
    public void delete(@PathVariable String guid){
         mstPlanTypeServiceImpl.deleteByGuid(guid);
    }

    @GetMapping("/all")
    @Operation(summary="GET ALL")
    public List<MstPlanType> getAll(){
        return mstPlanTypeServiceImpl.findAll();
    }

    @GetMapping("/getById/{guid}")
    @Operation(summary="GET BY ID")
    public ResponseEntity<MstPlanType> getByGuid(@PathVariable String guid){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.getByGuid(guid));
    }


}
