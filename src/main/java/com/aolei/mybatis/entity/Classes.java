package com.aolei.mybatis.entity;

/**
 * Created by Administrator on 2017/1/5.
 */
public class Classes {
    private int id;
    private String name;

    private Teacher teacher;

    public Classes(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public Classes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
