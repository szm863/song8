package com.itheima.service;


import com.itheima.pojo.Setmeal;

import java.util.List;

//上传图片接口
public interface MobileService {


    List<Setmeal> findAllSetmeal();

    Setmeal findById(String id);
}
