
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbAcademy;
import org.springframework.stereotype.Repository;

@Repository("academyDao")
public interface AcademyDao {
	@Select("select * from academy ")
	public List<TbAcademy> selects() throws Exception;

	@Select("select * from academy where id=#{id}")
	public TbAcademy selectById(int id) throws Exception;

	@Delete("delete from academy where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into academy(id,name,school,auditor) values(#{id},#{name},#{school},#{auditor})")
	public Boolean insert(TbAcademy academy) throws Exception;

	@Update("update academy set  id=#{id}, name=#{name}, school=#{school}, auditor=#{auditor} where id=#{id}")
	public Boolean update(TbAcademy academy) throws Exception;

}