
/*create by gz*/
package com.ctgu.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbTrain_objective_audte_table;
import org.springframework.stereotype.Repository;

@Repository("train_objective_audte_tableDao")
public interface Train_objective_audte_tableDao {
	@Select("select * from train_objective_audte_table ")
	public List<TbTrain_objective_audte_table> selects() throws Exception;

	@Select("select * from train_objective_audte_table where id=#{id}")
	public TbTrain_objective_audte_table selectById(int id) throws Exception;

	@Delete("delete from train_objective_audte_table where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into train_objective_audte_table(id,auditor,trainobjectiveid,outcome,time) values(#{id},#{auditor},#{trainobjectiveid},#{outcome},#{time})")
	public Boolean insert(TbTrain_objective_audte_table train_objective_audte_table) throws Exception;

	@Update("update train_objective_audte_table set  id=#{id}, auditor=#{auditor}, trainobjectiveid=#{trainobjectiveid}, outcome=#{outcome}, time=#{time} where id=#{id}")
	public Boolean update(TbTrain_objective_audte_table train_objective_audte_table) throws Exception;

}