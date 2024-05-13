package com.poly.helloworldsd18313.buoi4.service;

import com.poly.helloworldsd18313.buoi4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<Student>();

    public StudentService() {
        list.add(new Student("ID01", "Huy Hieu", 20, "Ha Noi", true));
        list.add(new Student("ID02", "Huu Dung", 19, "Bac Ninh", true));
        list.add(new Student("ID03", "Hai Yen", 21, "Bac Giang", false));
        list.add(new Student("ID04", "Bac Binh", 30, "Ha Nam", true));
        list.add(new Student("ID05", "Thanh Huong", 25, "Ca Mau", false));
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
