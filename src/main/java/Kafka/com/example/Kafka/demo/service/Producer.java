package Kafka.com.example.Kafka.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
@Service
public class Producer {
	@Autowired
	KafkaTemplate<String, String> KafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		KafkaTemplate.send("codeDecode_Topic",message);
	}

}
