package cn.edu.bnuz.chenjianbang.student.entity;


import java.util.Date;

/**
 * 学生类
 */
public class StudentDo {
    /**
     * 学生id
     */
    private Long id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生出生日期
     */
    private Date birthday;
    /**
     * 学生生源地
     */
    private String origin;
    /**
     * 学生绩点
     */
    private Double gpa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
