
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbChapter;
import org.springframework.stereotype.Repository;

@Repository("chapterDao")
public interface ChapterDao {
	@Select("select * from chapter ")
	public List<TbChapter> selects() throws Exception;

	@Select("select * from chapter where id=#{id}")
	public TbChapter selectById(int id) throws Exception;

	@Delete("delete from chapter where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into chapter(id,classid,title,content,time) values(#{id},#{classid},#{title},#{content},#{time})")
	public Boolean insert(TbChapter chapter) throws Exception;

	@Update("update chapter set  id=#{id}, classid=#{classid}, title=#{title}, content=#{content}, time=#{time} where id=#{id}")
	public Boolean update(TbChapter chapter) throws Exception;

}