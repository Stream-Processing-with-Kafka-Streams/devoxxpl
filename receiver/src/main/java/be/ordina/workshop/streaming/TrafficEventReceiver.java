package be.ordina.workshop.streaming;

import be.ordina.workshop.streaming.domain.TrafficEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
//lab 2 and lab 3: add something over here
public class TrafficEventReceiver {

	private static final Logger logger = LoggerFactory.getLogger(TrafficEventReceiver.class);

	//lab 2: consume events
	public void consumeEvent(TrafficEvent event) {
		//logger.info("Received event: {}", event);
	}


}
