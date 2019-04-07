
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbClass;
import org.springframework.stereotype.Repository;

@Repository("classDao")
public interface ClassDao {
	@Select("select * from class ")
	public List<TbClass> selects() throws Exception;

	@Select("select * from class where id=#{id}")
	public TbClass selectById(int id) throws Exception;

	@Delete("delete from class where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into class(id,name,teacherid,courseid) values(#{id},#{name},#{teacherid},#{courseid})")
	public Boolean insert(TbClass class) throws Exception;

	@Update("update class set  id=#{id}, name=#{name}, teacherid=#{teacherid}, courseid=#{courseid} where id=#{id}")
	public Boolean update(TbClass class) throws Exception;

}