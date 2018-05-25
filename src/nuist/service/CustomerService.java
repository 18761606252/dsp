package nuist.service;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import nuist.pojo.BaseDict;
import nuist.pojo.QueryVo;
import nuist.pojo.Temperature;


public interface CustomerService {

	//下拉列表
	public List<BaseDict> findDictByCode(String code);
	
	//分类查询
	public List<Temperature> findTemperatureByVo (QueryVo vo);
	//分页用
	public Integer findTemperatureByVoCount (QueryVo vo);
	
	public Temperature findTemperatureById(BigInteger id);
	
	//导入
	public void importExcelInfo(InputStream in, MultipartFile file, String salaryDate) throws Exception;

	public XSSFWorkbook exportExcelInfo(String dataStation) throws Exception;

}
