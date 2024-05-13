package com.fpoly.helloworldsd18301.buoi4.service;

import com.fpoly.helloworldsd18301.buoi4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<Student>();

    public StudentService() {
        list.add(new Student("ID01", "Nguyen Duc Manh", 19, "Ha Noi", true));
        list.add(new Student("ID02", "Yen Nhi", 30, "Thai Binh", false));
        list.add(new Student("ID03", "Dinh Thang", 25, "Bac Giang", true));
        list.add(new Student("ID04", "Anh Ngoc", 29, "Bac Ninh", false));
        list.add(new Student("ID05", "Nguyen Duc Nong", 17, "Ha Nam", true));
    }

    public List<Student> getAll() {
        return list;
    }
    public Student findById(String id) {
        for(Student student: list) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
    public void create(Student student) {
        list.add(student);
    }
    public void update(Student student) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(student.getId())) {
                list.set(i, student);
            }
        }
    }
    public void delete(String id) {
        List<Student> delList = new ArrayList<Student>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                delList.add(list.get(i));
            }
        }
        list.removeAll(delList);
    }

}
