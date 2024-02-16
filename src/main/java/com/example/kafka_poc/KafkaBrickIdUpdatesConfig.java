//package com.example.kafka_poc;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class KafkaBrickIdUpdatesConfig {
//
//	@Value("${brickId.updates.bootstrap.servers}")
//	private String bootStrapServers;
//	
//	@Value("${brickId.updates.acks}")
//	private String acks;
//	
//	@Value("${brickId.updates.retries}")
//	private String retries;
//	
//	@Value("${key.serializer}")
//	private String keySerializer;
//	
//	@Value("${value.serializer}")
//	private String valueSerializer;
//	
//	@Value("${brickId.updates.publish.topic.name}")
//	private String publishTopicName;
//
//	public String getBootStrapServers() {
//		return bootStrapServers;
//	}
//
//	public void setBootStrapServers(String bootStrapServers) {
//		this.bootStrapServers = bootStrapServers;
//	}
//
//	public String getAcks() {
//		return acks;
//	}
//
//	public void setAcks(String acks) {
//		this.acks = acks;
//	}
//
//	public String getRetries() {
//		return retries;
//	}
//
//	public void setRetries(String retries) {
//		this.retries = retries;
//	}
//
//	public String getKeySerializer() {
//		return keySerializer;
//	}
//
//	public void setKeySerializer(String keySerializer) {
//		this.keySerializer = keySerializer;
//	}
//
//	public String getValueSerializer() {
//		return valueSerializer;
//	}
//
//	public void setValueSerializer(String valueSerializer) {
//		this.valueSerializer = valueSerializer;
//	}
//
//	public String getTopicName() {
//		return publishTopicName;
//	}
//
//	public void setTopicName(String publishTopicName) {
//		this.publishTopicName = publishTopicName;
//	}
//	
//	
//}
