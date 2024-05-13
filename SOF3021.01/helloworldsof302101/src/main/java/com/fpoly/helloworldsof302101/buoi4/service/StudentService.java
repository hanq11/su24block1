package com.fpoly.helloworldsof302101.buoi4.service;

import com.fpoly.helloworldsof302101.buoi4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<Student>();

    public StudentService() {
        list.add(new Student("ID01", "Nguyen Trung", 19, "Ha Noi", false));
        list.add(new Student("ID02", "Tran Tung ", 20, "Bac Ninh", false));
        list.add(new Student("ID03", "Le Hang", 24, "Bac Giang", true));
        list.add(new Student("ID04", "Trung Quan", 34, "Thanh Hoa", false));
        list.add(new Student("ID05", "Nguyen Nhung", 22, "Ca Mau", true));
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
    public void update(Student studentModified) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(studentModified.getId())) {
                list.set(i, studentModified);
            }
        }
    }
    public void delete(String id) {
        List<Student> listDel = new ArrayList<Student>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                listDel.add(list.get(i));
            }
        }
        list.removeAll(listDel);
    }
}
