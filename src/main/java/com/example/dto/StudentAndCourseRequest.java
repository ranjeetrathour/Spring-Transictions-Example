package com.example.dto;

import com.example.entity.Course;
import com.example.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAndCourseRequest {
    private Student student;
    private Course course;
}
