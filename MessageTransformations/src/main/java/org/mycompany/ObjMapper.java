package org.mycompany;

import java.io.IOException;

import org.apache.camel.Exchange;

import com.Pojos.Orders;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

public class ObjMapper{

	public void processPersonSearchResponseJSON(Exchange exchange) throws JsonParseException, JsonMappingException, IOException 
    { 
            ObjectMapper mapper = new ObjectMapper(); 
              
            Orders personSearchResponses = mapper.readValue(exchange.getIn().getBody(String.class), Orders.class); 
              
            exchange.getIn().setBody(personSearchResponses); 

    } 
}
