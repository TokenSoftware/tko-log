package com.token01.streaming.kafka.handler;


import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * Kafka消息处理者接口
 * @author abel-sun
 */
public interface AbstractMsgHandler {

	/**
	 * 处理消息的行为定义
	 * @param record 消息实体
	 */
	void onMessage(ConsumerRecord<Integer, String> record);
}
