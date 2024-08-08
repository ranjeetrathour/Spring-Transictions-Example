package com.example.dto;

import com.example.entity.Course;
import com.example.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataRecieveAckonwledgement {

    private String status;
    private Course course;
    private Student student;

    public DataRecieveAckonwledgement(String dataSavedSuccess, String studentName, String courseType) {
    }
}
