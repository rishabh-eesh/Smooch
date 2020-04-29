package com.nextgenesolutions;

import org.springframework.stereotype.Component;

import com.twilio.jwt.accesstoken.AccessToken;
import com.twilio.jwt.accesstoken.VideoGrant;

@Component
public class TokenGenerator {

	public String generateToken(String identity) {
		
		 // Required for all types of tokens
	    String twilioAccountSid = "ACf8c402f12aa911dc295ec651348ac4f4";
	    String twilioApiKey = "SK006e509263c4bdb859f2f6dc9abeb0d8";
	    String twilioApiSecret = "QhW1w5F0zhrSHdhaHxdjHW8TGtc68P9L";

	    // Create Video grant
	    VideoGrant grant = new VideoGrant().setRoom("");//cool room

	    // Create access token
	    AccessToken token = new AccessToken.Builder(
	      twilioAccountSid,
	      twilioApiKey,
	      twilioApiSecret
	    ).identity(identity).grant(grant).build();

	    System.out.println(token.toJwt());
		
		return token.toJwt();
	}
}

