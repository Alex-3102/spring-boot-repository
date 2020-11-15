package cn.edu.bnuz.chenjianbang.student.controller;


import cn.edu.bnuz.chenjianbang.student.entity.StudentPageDo;
import cn.edu.bnuz.chenjianbang.student.service.StudentsService;
import cn.edu.bnuz.chenjianbang.student.entity.StudentDo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 通过该注解，第一是将StudentsController注册为控制器，可以响应Http请求；第二是可以将控制器中的方法返回值序列化为json格式。
public class StudentsController {
    @Autowired // 自动装配StudentsService
    private StudentsService studentsService;

    @ApiOperation(value = "根据id获取学生信息") // 接口文档显示内容
    @GetMapping("/students/{id}")
    public StudentDo getOne(@PathVariable("id") long id) {
        return studentsService.getStudentsById(id);
    }
    /**
     * 查询学生列表，使用get方法
     */
    @ApiOperation(value = "获取学生列表") // 接口文档显示内容
    @GetMapping("/students")
    public List<StudentDo> getList() {
        return studentsService.getStudentsList();
    }
    /**
     * 查询学生列表，使用get方法
     */
    @ApiOperation(value = "获取分页信息（包含学生列表信息）") // 接口文档显示内容
    @PostMapping("/students/page")
    public StudentPageDo getStudentPage(@RequestBody StudentPageDo studentPage) {
        return studentsService.getStudentsPage(studentPage);
    }
    /**
     * 新增学生
     * 1、@PostMapping表示使用post方法
     * 2、@RequestBody表示将请求中的json信息转换为StudentsDo类型的对象信息，该转换也是由SpringMVC自动完成的
     */
    @ApiOperation(value = "新增学生") // 接口文档显示内容
    @PostMapping("/students")
    public int add(@RequestBody StudentDo student) {
        return studentsService.addStudents(student);
    }
    /**
     * 修改学生
     */
    @ApiOperation(value = "根据id修改学生信息") // 接口文档显示内容
    @PutMapping("/students/{id}")
    public int update(@PathVariable("id") long id, @RequestBody StudentDo student) {
        // 修改指定id的学生信息
        student.setId(id);
        return studentsService.editStudents(student);
    }
    /**
     * 删除学生
     */
    @ApiOperation(value = "根据id删除学生") // 接口文档显示内容
    @DeleteMapping("/students/{id}")
    public int delete(@PathVariable("id") long id) {
        return studentsService.removeStudents(id);
    }
}
