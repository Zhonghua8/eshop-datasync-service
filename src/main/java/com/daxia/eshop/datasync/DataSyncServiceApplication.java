package com.daxia.eshop.datasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 12:56
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DataSyncServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataSyncServiceApplication.class, args);
    }

    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(5);
        config.setMaxWaitMillis(1000 * 10);
        config.setTestOnBorrow(true);
        return new JedisPool(config, "192.168.43.179", 1111);
    }
}
