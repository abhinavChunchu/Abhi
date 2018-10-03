package com.vanguard.webservice.restApi.resource;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.webservice.restApi.domain.CapitalGainInput;
import com.vanguard.webservice.restApi.domain.ProposedTransaction;
import com.vanguard.webservice.restApi.service.ValidationService;

@RestController
public class CapitalGainResource {
	
	@Autowired
	private ValidationService service;
	
	@GetMapping("/capital")
	public List<CapitalGainInput> retrieveAll(){
		return service.findAll();
	}
	
	@PostMapping("/capital")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<List<CapitalGainInput>> createAccount(@RequestBody List<CapitalGainInput> capitalGainInput) {
		
		CapitalGainInput cgi = capitalGainInput.get(0);
		if(cgi.getProposedTransaction().isEmpty()==false) {
			ProposedTransaction pt = cgi.getProposedTransaction().get(0);
			if(pt.getAmountSold()!=null && pt.getSellQuantity()!=null)
			{
				return new ResponseEntity("DONT SEND ME THIS VALUE!!!!!", HttpStatus.BAD_REQUEST);	
			}
		}
		return new ResponseEntity<List<CapitalGainInput>>(capitalGainInput, HttpStatus.OK);
	}

}
