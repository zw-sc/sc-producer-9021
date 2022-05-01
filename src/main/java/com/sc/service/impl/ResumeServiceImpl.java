package com.sc.service.impl;


import com.sc.dao.ResumeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import pojo.Resume;
import com.sc.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume findDefaultResumeById(Long id) {
        Resume resume = new Resume();
        resume.setId(id);
        // 查询默认简历
        Example<Resume> example = Example.of(resume);
        return resumeDao.findOne(example).get();
    }
}
