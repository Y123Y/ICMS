
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbCourse_type;
import org.springframework.stereotype.Repository;

@Repository("course_typeDao")
public interface Course_typeDao {
	@Select("select * from course_type ")
	public List<TbCourse_type> selects() throws Exception;

	@Select("select * from course_type where id=#{id}")
	public TbCourse_type selectById(int id) throws Exception;

	@Delete("delete from course_type where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into course_type(id,typename) values(#{id},#{typename})")
	public Boolean insert(TbCourse_type course_type) throws Exception;

	@Update("update course_type set  id=#{id}, typename=#{typename} where id=#{id}")
	public Boolean update(TbCourse_type course_type) throws Exception;

}