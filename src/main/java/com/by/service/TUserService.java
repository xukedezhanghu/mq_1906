package com.by.service;

import com.by.entity.TUser;
import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author makejava
 * @since 2019-12-12 20:44:41
 */
public interface TUserService {

    /**
     * 通过id查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    TUser queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}