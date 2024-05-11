package com.dao;

import com.entity.YingyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyuanxinxiVO;
import com.entity.view.YingyuanxinxiView;


/**
 * 影院信息
 * 
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
public interface YingyuanxinxiDao extends BaseMapper<YingyuanxinxiEntity> {
	
	List<YingyuanxinxiVO> selectListVO(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
	
	YingyuanxinxiVO selectVO(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
	
	List<YingyuanxinxiView> selectListView(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);

	List<YingyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
	
	YingyuanxinxiView selectView(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
	
}
