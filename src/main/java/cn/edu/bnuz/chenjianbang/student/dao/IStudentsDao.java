package cn.edu.bnuz.chenjianbang.student.dao;


import cn.edu.bnuz.chenjianbang.student.entity.StudentDo;
import cn.edu.bnuz.chenjianbang.student.entity.StudentPageDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生数据库访问接口
 */
@Repository // 标注数据访问组件
public interface IStudentsDao {
    /**
     * 增加学生
     */
    public int insert(StudentDo student);

    /**
     * 删除学生(根据id)
     */
    public int delete(Long id);

    /**
     * 修改学生信息(根据id修改其他属性值)
     */
    public int update(StudentDo student);

    /**
     * 查询学生信息(根据id查询单个学生信息)
     */
    public StudentDo selectOne(Long id);

    /**
     * 查询学生列表
     */
    public List<StudentDo> selectAll();

    /**
     * 分页查询(根据页面信息和查询信息)
     */
    public List<StudentDo> selectPage(StudentPageDo studentPage);

    /**
     * 分页查询数据数量(根据页面信息和查询数据的数量)
     */
    public Long selectPageCount(StudentPageDo studentPage);
}
