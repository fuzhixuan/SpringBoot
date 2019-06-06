package com.forezp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

import com.forezp.entity.Account;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
@Mapper
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
