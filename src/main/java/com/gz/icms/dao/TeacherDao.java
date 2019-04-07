
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbTeacher;
import org.springframework.stereotype.Repository;

@Repository("teacherDao")
public interface TeacherDao {
	@Select("select * from teacher ")
	public List<TbTeacher> selects() throws Exception;

	@Select("select * from teacher where id=#{id}")
	public TbTeacher selectById(String id) throws Exception;

	@Delete("delete from teacher where id=#{id}")
	public Boolean delete(String id) throws Exception;

	@Insert("insert into teacher(id,name,password,email,academic,tell) values(#{id},#{name},#{password},#{email},#{academic},#{tell})")
	public Boolean insert(TbTeacher teacher) throws Exception;

	@Update("update teacher set  id=#{id}, name=#{name}, password=#{password}, email=#{email}, academic=#{academic}, tell=#{tell} where id=#{id}")
	public Boolean update(TbTeacher teacher) throws Exception;

}