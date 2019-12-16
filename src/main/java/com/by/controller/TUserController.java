package com.by.controller;

import com.by.entity.TUser;
import com.by.service.TUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2019-12-12 20:44:41
 */

@Controller
@RequestMapping("user")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("list")
    public String selectOne(Integer id) {
        return "list";
    }
    @ResponseBody
    @RequestMapping("queryAll")
    public List<TUser> queryAll( ) {
        List<TUser> tUsers = tUserService.queryAllByLimit(0, 1000);
        return  tUsers;
    }
    @ResponseBody
    @RequestMapping("deleteById")
    public void deleteById(Integer userId) {
        tUserService.deleteById(userId);
    }
    @ResponseBody
    @RequestMapping("add")
    public void add(TUser userId) {
        tUserService.insert(userId);
    }
    @ResponseBody
    @RequestMapping("update")
    public void update(TUser userId) {
        tUserService.update(userId);
    }

}