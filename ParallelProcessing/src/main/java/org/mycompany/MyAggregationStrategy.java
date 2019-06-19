package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MyAggregationStrategy implements AggregationStrategy {

	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		
		// TODO Auto-generated method stub
		
		if (oldExchange == null) {
			return newExchange;
        } else {
        	oldExchange.getIn().setBody(oldExchange.getIn().getBody().toString()+""+newExchange.getIn().getBody().toString());
        }
        return oldExchange;
	}

}
