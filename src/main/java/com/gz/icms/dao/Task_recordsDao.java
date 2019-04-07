
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbTask_records;
import org.springframework.stereotype.Repository;

@Repository("task_recordsDao")
public interface Task_recordsDao {
	@Select("select * from task_records ")
	public List<TbTask_records> selects() throws Exception;

	@Select("select * from task_records where id=#{id}")
	public TbTask_records selectById(int id) throws Exception;

	@Delete("delete from task_records where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into task_records(id,taskid,studentid,finishedtime) values(#{id},#{taskid},#{studentid},#{finishedtime})")
	public Boolean insert(TbTask_records task_records) throws Exception;

	@Update("update task_records set  id=#{id}, taskid=#{taskid}, studentid=#{studentid}, finishedtime=#{finishedtime} where id=#{id}")
	public Boolean update(TbTask_records task_records) throws Exception;

}