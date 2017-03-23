package com.king.demo.provider;

import com.king.demo.domain.entity.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by King on 2017/3/9.
 *
 * 用户Mapper Sql构造器
 */

public class UserMapperSqlProvider {

    public String insert(User user) {
        SQL sql = new SQL();

        sql.INSERT_INTO("user");

        sql.VALUES("name", "#{name, jdbcType=VARCHAR}");
        sql.VALUES("age", "#{age, jdbcType=TINYINT}");
        sql.VALUES("home_address_id", "#{homeAddressId, jdbcType=BIGINT}");
        sql.VALUES("company_address_id", "#{companyAddressId, jdbcType=BIGINT}");

        sql.VALUES("create_time", "now()");
        sql.VALUES("update_time", "now()");
        sql.VALUES("status", "1");

        return sql.toString();
    }


}
