package com.example.pwcspringMVC;

import java.util.Base64;

import com.Security.JWTUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTTest {
	
	private static String secret_key="abc@123";
	public static void main(String[] args) {
		String token = JWTUtil.generateToken("Token1", secret_key);
		
		System.out.println("----------TOKEN----------");
		System.out.println(token);
		System.out.println("----------CLAIM----------");
		
		Claims claims=Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
		System.out.println("TOKEN_ID " + claims.getId()  );
		System.out.println("TOKEN_SUBJECT " + claims.getSubject()  );
		System.out.println("TOKEN_ISSUER " + claims.getIssuer()  );
		System.out.println("TOKEN_AUD " + claims.getAudience()  );

		
	}

}
