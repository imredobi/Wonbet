package com.wonbet.main;

import com.wonbet.DAO.UserDAO;
import com.wonbet.DAO.UserDAOImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = {"com.wonbet"})
public class WonbetMain {
    @Value("${datasource.class}")
    private String dataSourceClass;

    @Value("${datasource.username}")
    private String dataSourceUserName;

    @Value("${datasource.password}")
    private String dataSourcePassword;

    @Value("${datasource.url}")
    private String dataSourceUrl;

    public static void main(String[] args){
        SpringApplication.run(WonbetMain.class);
    }

    @Bean
    public UserDAO UserDAOProvider(){
        return new UserDAOImpl();
    }

    @Bean
    public JdbcTemplate ddbcTemplateProvider(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceClass);
        dataSource.setUsername(dataSourceUserName);
        dataSource.setPassword(dataSourcePassword);
        dataSource.setUrl(dataSourceUrl);
        return dataSource;
    }
}
