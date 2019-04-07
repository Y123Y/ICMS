
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbStudent;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public interface StudentDao {
	@Select("select * from student ")
	public List<TbStudent> selects() throws Exception;

	@Select("select * from student where id=#{id}")
	public TbStudent selectById(String id) throws Exception;

	@Delete("delete from student where id=#{id}")
	public Boolean delete(String id) throws Exception;

	@Insert("insert into student(id,name,password,age,sex,tell,major,academic) values(#{id},#{name},#{password},#{age},#{sex},#{tell},#{major},#{academic})")
	public Boolean insert(TbStudent student) throws Exception;

	@Update("update student set  id=#{id}, name=#{name}, password=#{password}, age=#{age}, sex=#{sex}, tell=#{tell}, major=#{major}, academic=#{academic} where id=#{id}")
	public Boolean update(TbStudent student) throws Exception;

}