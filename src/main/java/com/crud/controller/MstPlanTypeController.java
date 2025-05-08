package com.crud.controller;

import com.crud.entity.MstPlanType;
import com.crud.service.impl.MstPlanTypeServiceImpl;
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
    public ResponseEntity<MstPlanType> add(@RequestBody MstPlanType mstPlanType){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.add(mstPlanType));
    }

    @PutMapping("/update/{guid}")
    public ResponseEntity<MstPlanType> update(@PathVariable String guid, @RequestBody MstPlanType updatedData){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.updateByGuid(guid, updatedData));
    }

    @DeleteMapping("/delete/{guid}")
    public void delete(@PathVariable String guid){
         mstPlanTypeServiceImpl.deleteByGuid(guid);
    }

    @GetMapping("/all")
    public List<MstPlanType> getAll(){
        return mstPlanTypeServiceImpl.findAll();
    }

    @GetMapping("/getById/{guid}")
    public ResponseEntity<MstPlanType> getByGuid(@PathVariable String guid){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.getByGuid(guid));
    }


}
