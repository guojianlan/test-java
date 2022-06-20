package com.guojian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guojian.entity.Award;

public interface IHelloWorld extends IService<Award> {
    public String test();
}
