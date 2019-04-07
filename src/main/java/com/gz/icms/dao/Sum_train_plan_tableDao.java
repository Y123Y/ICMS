
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbSum_train_plan_table;
import org.springframework.stereotype.Repository;

@Repository("sum_train_plan_tableDao")
public interface Sum_train_plan_tableDao {
	@Select("select * from sum_train_plan_table ")
	public List<TbSum_train_plan_table> selects() throws Exception;

	@Select("select * from sum_train_plan_table where id=#{id}")
	public TbSum_train_plan_table selectById(int id) throws Exception;

	@Delete("delete from sum_train_plan_table where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into sum_train_plan_table(id,header,auditor,trainobjectiveid,maketime) values(#{id},#{header},#{auditor},#{trainobjectiveid},#{maketime})")
	public Boolean insert(TbSum_train_plan_table sum_train_plan_table) throws Exception;

	@Update("update sum_train_plan_table set  id=#{id}, header=#{header}, auditor=#{auditor}, trainobjectiveid=#{trainobjectiveid}, maketime=#{maketime} where id=#{id}")
	public Boolean update(TbSum_train_plan_table sum_train_plan_table) throws Exception;

}