
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbPerfession_certify_table;
import org.springframework.stereotype.Repository;

@Repository("perfession_certify_tableDao")
public interface Perfession_certify_tableDao {
	@Select("select * from perfession_certify_table ")
	public List<TbPerfession_certify_table> selects() throws Exception;

	@Select("select * from perfession_certify_table where id=#{id}")
	public TbPerfession_certify_table selectById(int id) throws Exception;

	@Delete("delete from perfession_certify_table where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into perfession_certify_table(id,content,version,specialtyname) values(#{id},#{content},#{version},#{specialtyname})")
	public Boolean insert(TbPerfession_certify_table perfession_certify_table) throws Exception;

	@Update("update perfession_certify_table set  id=#{id}, content=#{content}, version=#{version}, specialtyname=#{specialtyname} where id=#{id}")
	public Boolean update(TbPerfession_certify_table perfession_certify_table) throws Exception;

}