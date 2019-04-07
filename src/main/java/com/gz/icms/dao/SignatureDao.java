
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbSignature;
import org.springframework.stereotype.Repository;

@Repository("signatureDao")
public interface SignatureDao {
	@Select("select * from signature ")
	public List<TbSignature> selects() throws Exception;

	@Select("select * from signature where id=#{id}")
	public TbSignature selectById(int id) throws Exception;

	@Delete("delete from signature where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into signature(id,studentid,chapterid,period,time,state) values(#{id},#{studentid},#{chapterid},#{period},#{time},#{state})")
	public Boolean insert(TbSignature signature) throws Exception;

	@Update("update signature set  id=#{id}, studentid=#{studentid}, chapterid=#{chapterid}, period=#{period}, time=#{time}, state=#{state} where id=#{id}")
	public Boolean update(TbSignature signature) throws Exception;

}