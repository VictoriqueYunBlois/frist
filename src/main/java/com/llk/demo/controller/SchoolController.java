package com.llk.demo.controller;

import com.llk.demo.common.BaseModelExample;
import com.llk.demo.common.BaseResult;
import com.llk.demo.common.BootstrapTable;
import com.llk.demo.common.QueryParams;
import com.llk.demo.model.School;
import com.llk.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SchoolController {
    private int myId;
    @Autowired
    SchoolService schoolService;

    @RequestMapping("/getSchoolData")
    @ResponseBody
    public BootstrapTable getSchoolData(@RequestBody(required = false) final QueryParams queryParams){
        System.out.println("..." + queryParams);
        int index = queryParams.getLimit();
        int pageSize = queryParams.getOffset();
        BaseModelExample baseModelExample = new BaseModelExample();
        baseModelExample.setRowIndex(index);
        baseModelExample.setPageSize(pageSize);
        System.out.println(baseModelExample.toString());
        List<School> schoolData = schoolService.getSchoolData(baseModelExample);
        return new BootstrapTable(60,schoolData);
    }

    @RequestMapping("/school/index.html")
    public String school(){
        return "school/index";
    }

    @RequestMapping("/{id}/new")
    public String newEdit(@PathVariable int id){
//        System.out.println("...id:" + id);
        myId = id;
        return "school/new";
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public BaseResult save(@RequestBody School schoolInfo){
        System.out.println("...scInfo" + schoolInfo);
        schoolInfo.setId(myId);
        int r = schoolService.updateSchool(schoolInfo);
        BaseResult baseResult = new BaseResult();
        if(r > 0){
            baseResult.setResultCode("200");
        }else{
            baseResult.setResultCode("500");
        }
        return baseResult;
    }
}
