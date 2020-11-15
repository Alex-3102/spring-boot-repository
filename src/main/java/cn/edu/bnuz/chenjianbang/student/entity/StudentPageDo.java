package cn.edu.bnuz.chenjianbang.student.entity;

import java.util.Date;
import java.util.List;

public class StudentPageDo {

    /**
     * 页码
     */
    private Long pageNum;
    /**
     * 一个页面的数据行数
     */
    private Long pageSize;
    /**
     * 页面从第几行数据开始
     */
    private Long lineNum;
    /**
     * 所有的符合条件的页面数量
     */
    private Long pageSum;
    /**
     * 所有的符合条件的数据数量
     */
    private Long lineSum;
    /**
     * 查询条件：学生id
     */
    private Long id;
    /**
     * 查询条件：学生姓名
     */
    private String name;
    /**
     * 查询条件：学生出生日期上限
     */
    private Date birthday_upper_limit;
    /**
     * 查询条件：学生出生日期上限
     */
    private Date birthday_lower_limit;
    /**
     * 查询条件：学生生源地
     */
    private String origin;
    /**
     * 查询条件：学生绩点上限
     */
    private Double gpa_upper_limit;
    /**
     * 查询条件：学生绩点下限
     */
    private Double gpa_lower_limit;
    /**
     * 查询结果：学生集合
     */
    private List<StudentDo> students;

    public StudentPageDo() {
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public Long getPageSum() {
        return pageSum;
    }

    public void setPageSum(Long pageSum) {
        this.pageSum = pageSum;
    }

    public Long getLineSum() {
        return lineSum;
    }

    public void setLineSum(Long lineSum) {
        this.lineSum = lineSum;
    }

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

    public Date getBirthday_upper_limit() {
        return birthday_upper_limit;
    }

    public void setBirthday_upper_limit(Date birthday_upper_limit) {
        this.birthday_upper_limit = birthday_upper_limit;
    }

    public Date getBirthday_lower_limit() {
        return birthday_lower_limit;
    }

    public void setBirthday_lower_limit(Date birthday_lower_limit) {
        this.birthday_lower_limit = birthday_lower_limit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getGpa_upper_limit() {
        return gpa_upper_limit;
    }

    public void setGpa_upper_limit(Double gpa_upper_limit) {
        this.gpa_upper_limit = gpa_upper_limit;
    }

    public Double getGpa_lower_limit() {
        return gpa_lower_limit;
    }

    public void setGpa_lower_limit(Double gpa_lower_limit) {
        this.gpa_lower_limit = gpa_lower_limit;
    }

    public List<StudentDo> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDo> students) {
        this.students = students;
    }
}
