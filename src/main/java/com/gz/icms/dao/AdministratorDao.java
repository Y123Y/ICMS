
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbAdministrator;
import org.springframework.stereotype.Repository;

@Repository("administratorDao")
public interface AdministratorDao {
	@Select("select * from administrator ")
	public List<TbAdministrator> selects() throws Exception;

	@Select("select * from administrator where id=#{id}")
	public TbAdministrator selectById(int id) throws Exception;

	@Delete("delete from administrator where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into administrator(id,name,password,email,tell) values(#{id},#{name},#{password},#{email},#{tell})")
	public Boolean insert(TbAdministrator administrator) throws Exception;

	@Update("update administrator set  id=#{id}, name=#{name}, password=#{password}, email=#{email}, tell=#{tell} where id=#{id}")
	public Boolean update(TbAdministrator administrator) throws Exception;

}