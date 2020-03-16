package com.example.demo.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import javax.sql.DataSource;

//import com.example.demo.map.device.*;

@SuppressWarnings("unused")
@Configuration
@MapperScan(basePackages = "com.example.demo.map.device", sqlSessionTemplateRef = "db1SqlSessionTemplate")
public class DB1Config
{
	private static final Logger logger = LoggerFactory.getLogger(DB1Config.class);

	@Bean(name = "db1DataSource")
	@Primary // 配置默认数据源
	@ConfigurationProperties(prefix = "spring.datasource.data1")
	public DataSource setDataSource()
  {
			logger.info("配置数据源1-----setDataSource......");
			return new DruidDataSource();	
	}
	@Bean(name = "db1TransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("db1DataSource") DataSource dataSource)
	{
		logger.info("配置数据源1-----setTransactionManager......" + dataSource.toString());
		return new DataSourceTransactionManager(new DruidDataSource());
	}
	@Bean(name = "db1SqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("db1DataSource") DataSource dataSource)
	{
		try
		{			
			logger.info("配置数据源1-----setSqlSessionFactory......"+dataSource.toString());			
			SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
			bean.setDataSource(dataSource);
//			String Path = "classpath:mybatis/mapper/*";
//			bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(Path));
			return bean.getObject();
		}
		catch (Exception e)
		{
			logger.info("配置数据源1_3 报错: spring.datasource.data1" + e.toString());			
		}
		return null;
	}
	@Bean(name = "db1SqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("db1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception
	{		
		logger.info("配置数据源1-----setSqlSessionTemplate......" + sqlSessionFactory.toString());		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
