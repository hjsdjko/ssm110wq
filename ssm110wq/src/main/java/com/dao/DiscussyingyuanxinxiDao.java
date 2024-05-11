package com.dao;

import com.entity.DiscussyingyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingyuanxinxiVO;
import com.entity.view.DiscussyingyuanxinxiView;


/**
 * 影院信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
public interface DiscussyingyuanxinxiDao extends BaseMapper<DiscussyingyuanxinxiEntity> {
	
	List<DiscussyingyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
	
	DiscussyingyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
	
	List<DiscussyingyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);

	List<DiscussyingyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
	
	DiscussyingyuanxinxiView selectView(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
	
}
