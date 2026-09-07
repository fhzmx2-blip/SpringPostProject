package com.sist.web.mapper.oracle;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.web.vo.*;
@Mapper
public interface OracleRecipeMapper {

	public List<RecipeVO> oracleRecipeAllData();
}
