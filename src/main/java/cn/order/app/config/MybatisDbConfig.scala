package cn.order.app.config

import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Configuration

@Configuration
@MapperScan(value = "cn.order.app.dao", sqlSessionFactoryRef = "sqlSessionFactory")
class MybatisDbConfig {

}
