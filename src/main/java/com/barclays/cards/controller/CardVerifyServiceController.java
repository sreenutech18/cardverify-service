/**
 * @Author : Sreenu
 *  COPY Rights all are reserved, 
    dont disclose the information outsiders
    other wise temrs and conditions will apply.
   
 */
package com.barclays.cards.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.cards.model.CardRequest;
import com.barclays.cards.model.CardResponse;

/**
 * @author sreenu
 *
 */

@RestController
@RequestMapping("/v1")
public class CardVerifyServiceController {
	
	@PostMapping("/card/verify")
	@ResponseBody
	public CardResponse cardVerify(@RequestBody CardRequest cardRequest,
								   @RequestHeader("client-id") String clientId,
								   @RequestHeader("request-id") String requestId,
								   @RequestHeader("msg-ts") String messageTs) {
		
		//1. Get the request from client 
		//2. validate the request, if it is in invalid then throw the exception else
		//3. prepare the request for service and call service
		//4. get the response from service
		
		CardResponse cardResponse = new CardResponse();
		cardResponse.setRespCode("0");
		cardResponse.setRespMsg("success");
		cardResponse.setStatus("active");
		
		return cardResponse;
		
		
	}

}
