
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbResource;
import org.springframework.stereotype.Repository;

@Repository("resourceDao")
public interface ResourceDao {
	@Select("select * from resource ")
	public List<TbResource> selects() throws Exception;

	@Select("select * from resource where id=#{id}")
	public TbResource selectById(int id) throws Exception;

	@Delete("delete from resource where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into resource(id,chapterid,description,path) values(#{id},#{chapterid},#{description},#{path})")
	public Boolean insert(TbResource resource) throws Exception;

	@Update("update resource set  id=#{id}, chapterid=#{chapterid}, description=#{description}, path=#{path} where id=#{id}")
	public Boolean update(TbResource resource) throws Exception;

}