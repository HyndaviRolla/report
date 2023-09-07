package com.prodapt.learningspring.repository;
 
import com.prodapt.learningspring.entity.Comment;
import com.prodapt.learningspring.entity.CommentReport;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentReportRepository extends JpaRepository<CommentReport, Long> {

	List<CommentReport> findByComment(Comment comment);
	
}
