package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.MobileDao;
import com.itheima.dao.StemealDao;
import com.itheima.pojo.Setmeal;
import com.itheima.service.MobileService;
import com.itheima.service.StemealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import redis.clients.jedis.JedisPool;

import java.util.List;

/**
 * 检查组项服务
 */
@Service(interfaceClass = MobileService.class)
@Transactional
public class MobileServiceImpl implements MobileService {
    //注入DAO对象

    @Autowired
    private MobileDao  mobileDao;


    //生成静态文件
    public  void add(){
        //将模板文件和查出的数据

    }

    public List<Setmeal> findAllSetmeal() {
        List<Setmeal> allSetmeal = mobileDao.findAllSetmeal();
        return allSetmeal;
    }


    public Setmeal findById(String id) {
//        List<CheckGroup> list = new ArrayList<>();

//        //1 先根据套餐id查出来groupIds
//
//        int[] groupIds = mobileDao.setmealIdFindGroupIds(id);
//        //2 根据groupids查中间表获取item的id
//        for (int groupId : groupIds) {
//            //3 在根据item的id就可以查到所有值
//            //很多个检查组id是否就封装在每个CheckGroup
//            //就查name
//            CheckGroup group = mobileDao.findByGroupId(groupId);
//            list.add(group);
//            int[] itemIds = mobileDao.groupIdFindItemIds(groupId);
//            for (int itemId : itemIds) {
//                CheckItem checkItem = mobileDao.itemIdFindAll(itemId);
//                List<CheckItem> checkItemList = new ArrayList<>();
//                checkItemList.add(checkItem);
//                group.setCheckItems(checkItemList);
//            }
//
//        }


        return mobileDao.findById(id);
    }
}
