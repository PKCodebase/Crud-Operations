package com.crud.controller;

import com.crud.entity.MstPlanType;
import com.crud.service.impl.MstPlanTypeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plan")
@Tag(name="Mst Plan Controller")
public class MstPlanTypeController {

    private final MstPlanTypeServiceImpl mstPlanTypeServiceImpl;

    public MstPlanTypeController(MstPlanTypeServiceImpl mstPlanTypeServiceImpl) {
        this.mstPlanTypeServiceImpl = mstPlanTypeServiceImpl;
    }

    @Operation(summary = "ADD" , description = "Add new plan")
    @ApiResponse(
            responseCode = "200", description = "Successfully added"
    )
    @PostMapping("/add")
    public ResponseEntity<MstPlanType> add(@RequestBody MstPlanType mstPlanType){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.add(mstPlanType));
    }


    @Operation(summary = "UPDATE BY ID" , description = "Update plan by id")
    @ApiResponse(
            responseCode = "200", description = "Successfully updated"
    )
    @PutMapping("/update/{guid}")
    public ResponseEntity<MstPlanType> update(@PathVariable String guid, @RequestBody MstPlanType updatedData){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.updateByGuid(guid, updatedData));
    }


    @Operation(summary="DELETE BY ID" , description="Delete plan")
    @ApiResponse(responseCode = "200", description = "Deleted Successfully")
    @DeleteMapping("/delete/{guid}")
    public void delete(@PathVariable String guid){
         mstPlanTypeServiceImpl.deleteByGuid(guid);
    }

    @Operation(summary="GET ALL",description = "Get all plan")
    @ApiResponse(responseCode = "200", description = "Successfully fetched all")
    @GetMapping("/all")
    public List<MstPlanType> getAll(){
        return mstPlanTypeServiceImpl.findAll();
    }

    @Operation(summary="GET BY ID" , description = "Get plan by id")
    @ApiResponse(responseCode = "200", description = "Successfully fetched By Id")
    @GetMapping("/getById/{guid}")
    public ResponseEntity<MstPlanType> getByGuid(@PathVariable String guid){
        return ResponseEntity.ok(mstPlanTypeServiceImpl.getByGuid(guid));
    }


}
