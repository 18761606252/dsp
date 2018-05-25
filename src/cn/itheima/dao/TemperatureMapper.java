package cn.itheima.dao;

import java.math.BigInteger;
import java.util.List;

import cn.itheima.pojo.QueryVo;
import cn.itheima.pojo.Temperature;

public interface TemperatureMapper {
		//分类查询
		public List<Temperature> findTemperatureByVo(QueryVo vo); 
		//分页用，输入是vo,输出是int
		public Integer findTemperatureByVoCount(QueryVo vo);
		
		
		public Temperature findTemperatureById(BigInteger id);
		
		public void insertInfoBatch(List<Temperature> temlist);
		
		public List<Temperature> selectApartInfo(String dataStation);

}
