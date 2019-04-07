
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbStudent_course;
import org.springframework.stereotype.Repository;

@Repository("student_courseDao")
public interface Student_courseDao {
	@Select("select * from student_course ")
	public List<TbStudent_course> selects() throws Exception;

	@Select("select * from student_course where id=#{id}")
	public TbStudent_course selectById(int id) throws Exception;

	@Delete("delete from student_course where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into student_course(id,studentid,classid) values(#{id},#{studentid},#{classid})")
	public Boolean insert(TbStudent_course student_course) throws Exception;

	@Update("update student_course set  id=#{id}, studentid=#{studentid}, classid=#{classid} where id=#{id}")
	public Boolean update(TbStudent_course student_course) throws Exception;

}