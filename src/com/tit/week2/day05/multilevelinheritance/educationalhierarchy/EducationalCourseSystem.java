package com.tit.week2.day05.multilevelinheritance.educationalhierarchy;

class EducationalCourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 30, "Udemy", true, 99.99, 20);
        course.displayInfo();
    }
}
