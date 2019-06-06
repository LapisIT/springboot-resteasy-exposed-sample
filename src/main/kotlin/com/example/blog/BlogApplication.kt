package com.example.blog

import org.jetbrains.exposed.spring.SpringTransactionManager
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource

@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication  {

  @Bean
  open fun transactionManager(dataSource: DataSource) = SpringTransactionManager(dataSource)

}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
