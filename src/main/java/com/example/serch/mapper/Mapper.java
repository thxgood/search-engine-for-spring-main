package com.example.serch.mapper;
import com.alibaba.fastjson.JSONArray;
import com.example.serch.pojo.Bean;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;

/**
 * @author 亦梦里 亦书予
 * @version 1.0
 * @date 2021/7/7 10:00
 */
@Repository
public interface Mapper {
    JSONArray Saveadd(JSONArray array);
}

