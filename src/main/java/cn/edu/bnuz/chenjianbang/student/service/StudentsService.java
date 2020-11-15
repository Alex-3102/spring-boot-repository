package cn.edu.bnuz.chenjianbang.student.service;

import cn.edu.bnuz.chenjianbang.student.dao.IStudentsDao;
import cn.edu.bnuz.chenjianbang.student.entity.StudentDo;
import cn.edu.bnuz.chenjianbang.student.entity.StudentPageDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生服务类
 */
@Service // 注册为服务类
public class StudentsService {

    @Autowired
    private IStudentsDao studentsDao;

    /**
     * 获取学生列表
     */
    public List<StudentDo> getStudentsList() {
        System.out.println(studentsDao.selectAll());
        return studentsDao.selectAll();
    }
    /**
     * 按id获取学生信息，返回对应学生信息
     */
    public StudentDo getStudentsById(Long id) {
        return studentsDao.selectOne(id);
    }
    /**
     * 新增学生，返回数据库影响行数
     */
    public int addStudents(StudentDo student) {
        return studentsDao.insert(student);
    }
    /**
     * 根据学生id更新学生信息，返回数据库影响行数
     */
    public int editStudents(StudentDo student) {
        return studentsDao.update(student);
    }
    /**
     * 根据学生id删除对应学生，返回数据库影响行数
     */
    public int removeStudents(Long id) {
        return studentsDao.delete(id);
    }
    /**
     * 根据查询信息，查询一页数据
     */
    public StudentPageDo getStudentsPage(StudentPageDo studentPage){
        Long lineNum = (studentPage.getPageNum() - 1) * studentPage.getPageSize();
        studentPage.setLineNum(lineNum);
        studentPage.setStudents(studentsDao.selectPage(studentPage));
        Long lineSum = studentsDao.selectPageCount(studentPage);
        Long pageSum = (lineSum + studentPage.getPageSize() - 1)/ studentPage.getPageSize();
        studentPage.setLineSum(lineSum);
        studentPage.setPageSum(pageSum);
        return studentPage;
    }
}

