package com.imooc.service;

import com.imooc.pojo.Items;
import com.imooc.pojo.ItemsImg;
import com.imooc.pojo.ItemsParam;
import com.imooc.pojo.ItemsSpec;
import com.imooc.pojo.vo.CommentLevelCountsVO;
import com.imooc.pojo.vo.ItemCommentVO;
import com.imooc.pojo.vo.ShopcartVO;
import com.imooc.utils.PagedGridResult;

import java.util.List;

public interface ItemService {

    public Items queryItemById(String itemId);


    public List<ItemsImg> queryItemImgList(String itemId);

    //查询商品规格
    public List<ItemsSpec> queryItemSpecList(String itemId);


    //查询商品参数
    public ItemsParam queryItemParam(String itemId);


    public CommentLevelCountsVO queryCommentCounts(String itemId);

    public PagedGridResult queryPagedComments(String itemId, Integer level,
                                              Integer page, Integer pageSize);

    public PagedGridResult searchItems(String keywords, String sort, Integer page, Integer pageSize);

    public PagedGridResult searchItems(Integer catId, String sort, Integer page, Integer pageSize);

    //根据规格ids查询最新的购物车中的商品数据（用于刷新渲染购物车中的商品数据）
    public List<ShopcartVO> queryItemsBySpecIds(String specIds);

    //根据商品规格id获取规格对象的具体信息
    public ItemsSpec queryItemSpecById(String specId);

    //根据商品id获取商品图片主图url
    public String queryItemMainImgById(String itemId);

    //减少库存
    public void decreaseItemSpecStock(String specId, int buyCounts);

}
