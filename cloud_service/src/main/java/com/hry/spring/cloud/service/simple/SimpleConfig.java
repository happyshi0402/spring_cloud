package com.hry.spring.cloud.service.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 从配置服务获取的配置存储到此文件中
 * 
 * @author Administrator
 *
 */
@Configuration
// @PropertySource(value="classpath:/cloud-config-${spring.profiles.active}.properties")
// @PropertySource(value="cloud-config-${spring.profiles.active}.properties")
@ConfigurationProperties(prefix = "simple.config" ,ignoreUnknownFields = false)
public class SimpleConfig {
	
	@Value("${simple.config.name}")
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}	
	
	@Override
	public String toString(){
	//	return JSON.toJSONString(this);
		return "name="+name+" | age=" + age;
	}
}