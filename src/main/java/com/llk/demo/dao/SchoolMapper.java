package com.llk.demo.dao;

import com.llk.demo.common.BaseModelExample;
import com.llk.demo.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {
    List<School> getSchoolData(BaseModelExample baseModelExample);
    int updateSchool(School schoolInfo);
}
