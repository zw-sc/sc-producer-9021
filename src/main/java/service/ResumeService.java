package service;


import pojo.Resume;

public interface ResumeService {

    Resume findDefaultResumeByUserId(Long userId);
}
