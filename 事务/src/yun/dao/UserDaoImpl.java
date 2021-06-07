package yun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Yunjl
 * @create 2021-05-21 20:33
 */
@Repository
public class UserDaoImpl implements UserDao {
    //注入 JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //ymq多100
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"ymq");
    }

    //少钱，yun转账100给ymq
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"yun");

    }
}
