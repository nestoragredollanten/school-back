package com.nray.school.repository;

import com.nray.school.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query(value = "SELECT " +
            "p.id AS id, " +
            "p.name AS name, " +
            "GROUP_CONCAT(DISTINCT s.name ORDER BY s.name ASC) AS nameSubjects, " +
            "GROUP_CONCAT(DISTINCT stu.name ORDER BY stu.name ASC) AS nameStudents " +
            "FROM professor p " +
            "INNER JOIN subject s ON p.id = s.professor_id " +
            "LEFT JOIN student_subject ss ON s.id = ss.subject_id " +
            "LEFT JOIN student stu ON ss.student_id = stu.id " +
            "WHERE p.id = :professorId " +
            "GROUP BY p.id, p.name",
            nativeQuery = true)
    Map<String, Object> getProfessorSubjectsAndStudents(@Param("professorId") Long professorId);
}
