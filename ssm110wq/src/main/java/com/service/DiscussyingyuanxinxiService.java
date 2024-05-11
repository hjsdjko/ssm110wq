package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingyuanxinxiView;


/**
 * 影院信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-18 11:16:43
 */
public interface DiscussyingyuanxinxiService extends IService<DiscussyingyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingyuanxinxiVO> selectListVO(Wrapper<DiscussyingyuanxinxiEntity> wrapper);
   	
   	DiscussyingyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
   	
   	List<DiscussyingyuanxinxiView> selectListView(Wrapper<DiscussyingyuanxinxiEntity> wrapper);
   	
   	DiscussyingyuanxinxiView selectView(@Param("ew") Wrapper<DiscussyingyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingyuanxinxiEntity> wrapper);
   	
}

