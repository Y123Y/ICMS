
/*create by gz*/
package com.gz.icms.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import com.gz.icms.pojo.TbTrain_objective_table;
import org.springframework.stereotype.Repository;

@Repository("train_objective_tableDao")
public interface Train_objective_tableDao {
	@Select("select * from train_objective_table ")
	public List<TbTrain_objective_table> selects() throws Exception;

	@Select("select * from train_objective_table where id=#{id}")
	public TbTrain_objective_table selectById(int id) throws Exception;

	@Delete("delete from train_objective_table where id=#{id}")
	public Boolean delete(int id) throws Exception;

	@Insert("insert into train_objective_table(id,header,specialtyid,content,version,auditor) values(#{id},#{header},#{specialtyid},#{content},#{version},#{auditor})")
	public Boolean insert(TbTrain_objective_table train_objective_table) throws Exception;

	@Update("update train_objective_table set  id=#{id}, header=#{header}, specialtyid=#{specialtyid}, content=#{content}, version=#{version}, auditor=#{auditor} where id=#{id}")
	public Boolean update(TbTrain_objective_table train_objective_table) throws Exception;

}