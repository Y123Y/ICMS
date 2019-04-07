
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbCourse;
import org.springframework.stereotype.Repository;

@Repository("courseDao")
public interface CourseDao {
	@Select("select * from course ")
	public List<TbCourse> selects() throws Exception;

	@Select("select * from course where id=#{id}")
	public TbCourse selectById(int id) throws Exception;

	@Delete("delete from course where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into course(id,name,period,credit,type,header) values(#{id},#{name},#{period},#{credit},#{type},#{header})")
	public Boolean insert(TbCourse course) throws Exception;

	@Update("update course set  id=#{id}, name=#{name}, period=#{period}, credit=#{credit}, type=#{type}, header=#{header} where id=#{id}")
	public Boolean update(TbCourse course) throws Exception;

}