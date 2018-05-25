package nuist.dao;

import java.util.List;

import nuist.pojo.BaseDict;

public interface DictMapper {

	
	public List<BaseDict> findDictByCode(String code);
}
