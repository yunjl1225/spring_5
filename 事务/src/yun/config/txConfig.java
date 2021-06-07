package yun.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**使用完全注解实现事务操作
 * @author Yunjl
 * @create 2021-05-21 22:03
 */
@Configuration      //声明配置类
@ComponentScan(basePackages = "yun")        //开启注解的组件的扫描
@EnableTransactionManagement                //开启事务
public class txConfig {
    //创建数据库的连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        //创建德鲁伊的连接池
        DruidDataSource dataSource = new DruidDataSource();
        //设置参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");     //驱动名称
        dataSource.setUrl("jdbc:mysql:///user_db");                 //数据库的地址
        dataSource.setUsername("root");                             //数据库的用户名
        dataSource.setPassword("122500");                           //数据库的密码
        return dataSource;
    }

    //创建 JdbcTemplate 对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        //创建JdbcTemplate 对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //添加形参的目的：到IOC容器中找到dataSource
        //注入数据库的信息dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器的对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        //创建事务管理器的对象
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //添加形参的目的：到IOC容器中找到dataSource
        //注入数据库的信息dataSource
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
