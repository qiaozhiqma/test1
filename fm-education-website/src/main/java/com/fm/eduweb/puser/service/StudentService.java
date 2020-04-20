package com.fm.eduweb.puser.service;

import com.fm.edusys.model.auto.TsysUser;
import com.fm.edusys.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：liukun
 * @date ：Created in 2020-04-18 17:10
 * @description：学生服务层接口
 * @modified By：
 * @version: 1.0$
 */
@Service
@Transactional
public interface StudentService {

    public TsysUser studentRegister();






}
