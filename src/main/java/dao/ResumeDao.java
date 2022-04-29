package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import pojo.Resume;

public interface ResumeDao extends JpaRepository<Resume, Long> {
}
