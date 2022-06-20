package com.guojian.service.Impl;

import com.guojian.Mapper.AwardMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guojian.entity.Award;
import com.guojian.service.IHelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorld extends ServiceImpl<AwardMapper, Award> implements IHelloWorld {
    @Override
    public String test() {
        return "bbbaaaaaasdas";
    }
}
