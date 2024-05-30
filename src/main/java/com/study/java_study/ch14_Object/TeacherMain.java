package com.study.java_study.ch14_Object;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("최단비", 29);
        Teacher teacher2 = new Teacher("최단비", 30);
        System.out.println(teacher);

        System.out.println(teacher.hashCode() == teacher2.hashCode());
        System.out.println(teacher.equals(teacher2));

    }
}
