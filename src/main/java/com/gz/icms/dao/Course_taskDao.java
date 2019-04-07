
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbCourse_task;
import org.springframework.stereotype.Repository;

@Repository("course_taskDao")
public interface Course_taskDao {
	@Select("select * from course_task ")
	public List<TbCourse_task> selects() throws Exception;

	@Select("select * from course_task where id=#{id}")
	public TbCourse_task selectById(int id) throws Exception;

	@Delete("delete from course_task where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into course_task(id,chapterid,content,time) values(#{id},#{chapterid},#{content},#{time})")
	public Boolean insert(TbCourse_task course_task) throws Exception;

	@Update("update course_task set  id=#{id}, chapterid=#{chapterid}, content=#{content}, time=#{time} where id=#{id}")
	public Boolean update(TbCourse_task course_task) throws Exception;

}