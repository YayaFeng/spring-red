package com.fyb.admin.rest;

import com.fyb.admin.entity.TtDict;
import com.fyb.admin.mapper.TtDictMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @AUTHOR 18336 fengyabing
 * @VERSION V1.0
 * @create 2019/11/17
 */
@Slf4j
@RestController
public class TestController {
    @Autowired
    private TtDictMapper dictMapper;

    @RequestMapping("/ss")
    public List<TtDict> ts() {
        Example example = new Example(TtDict.class);

        List<TtDict> list = dictMapper.selectByExample(example);
        return list;
    }
}
