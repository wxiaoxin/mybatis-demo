package com.king.demo.provider;

import com.king.demo.domain.entity.Address;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by King on 2017/3/10.
 */

public class AddressMapperSqlProvider {

    public String insert(Address address) {
        SQL sql = new SQL();
        sql.INSERT_INTO("address");

        if (address.getProvince() != null) {
            sql.VALUES("province", "#{province, jdbcType=VARCHAR}");
        }
        if (address.getCity() != null) {
            sql.VALUES("city", "#{city, jdbcType=VARCHAR}");
        }
        if (address.getCounty() != null) {
            sql.VALUES("county", "#{county, jdbcType=VARCHAR}");
        }
        if (address.getStatus() != null) {
            sql.VALUES("status", "#{status, jdbcType=TINYINT}");
        }

        return sql.toString();
    }




}
