
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbSpecialty;
import org.springframework.stereotype.Repository;

@Repository("specialtyDao")
public interface SpecialtyDao {
	@Select("select * from specialty ")
	public List<TbSpecialty> selects() throws Exception;

	@Select("select * from specialty where id=#{id}")
	public TbSpecialty selectById(int id) throws Exception;

	@Delete("delete from specialty where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into specialty(id,header,name,explain) values(#{id},#{header},#{name},#{explain})")
	public Boolean insert(TbSpecialty specialty) throws Exception;

	@Update("update specialty set  id=#{id}, header=#{header}, name=#{name}, explain=#{explain} where id=#{id}")
	public Boolean update(TbSpecialty specialty) throws Exception;

}