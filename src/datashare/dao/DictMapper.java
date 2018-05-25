package datashare.dao;

import java.util.List;

import datashare.pojo.BaseDict;

public interface DictMapper {

	
	public List<BaseDict> findDictByCode(String code);
}
