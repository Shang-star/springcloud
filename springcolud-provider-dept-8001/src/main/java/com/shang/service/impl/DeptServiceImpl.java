package com.shang.service.impl;

import com.shang.dao.DeptMapper;
import com.shang.pojo.Dept;
import com.shang.service.DeptService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shang
 * @PackageName:com.shang.service.impl
 * @ClassName:DeptServiceImpl
 * @Description:
 * @date 2021/3/16 19:02
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
