package com.gsu.app.jobsplanet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsu.app.jobsplanet.entity.Interview;
import com.gsu.app.jobsplanet.entity.JobSeeker;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {

}