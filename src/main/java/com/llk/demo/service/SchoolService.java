package com.llk.demo.service;

import com.llk.demo.common.BaseModelExample;
import com.llk.demo.dao.SchoolMapper;
import com.llk.demo.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    public List<School> getSchoolData(BaseModelExample baseModelExample){
        return schoolMapper.getSchoolData(baseModelExample);
    }

    public int updateSchool(School schoolInfo){
        return schoolMapper.updateSchool(schoolInfo);
    }
}
