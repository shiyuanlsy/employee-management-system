package com.itheima.service.impl;

import com.itheima.mapper.JobTitleMapper;
import com.itheima.pojo.JobTitle;
import com.itheima.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleServiceImpl implements JobTitleService {

    @Autowired
    private JobTitleMapper jobTitleMapper;

    @Override
    public List<JobTitle> list() {
        return jobTitleMapper.list();
    }

    @Override
    public void delete(Integer id) {
        jobTitleMapper.deleteById(id);
    }

    @Override
    public void add(JobTitle job) {

        jobTitleMapper.insert(job);
    }
}