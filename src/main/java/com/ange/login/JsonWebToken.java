package com.ange.login;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ange.model.User;
import com.ange.tool.Json;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JsonWebToken {
//	private static final String key=UuidUtil.createUUID();
	private static final String key="angeKey";
	/**
	 * 生成token
	 * @param user 用户实体类
	 * @return token
	 * @throws Exception
	 */
	public static String createToken(User user) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("alg", "HS256");
		map.put("typ", "JWT");
//		SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//	    Long time=(long) 1514200319*1000;  
//	    String d = format.format(time);
//	    Date date=format.parse(d); 
	    Date iat=new Date();
	    if(user.getUserName()==null||user.getUserName()=="") {
	    	user.setUserName("-");
	    }
		String token = JWT.create()
				.withHeader(map)//header
				.withClaim("userName", user.getUserName())//用户名
				.withClaim("id",user.getId()+"")//用户id
				.withClaim("state", user.getState())//用户状态
				.withClaim("role", user.getRole())//用户状态
//				.withExpiresAt(date)//过期时间  exp
				.withIssuer("admin")//签发者 iss
				.withIssuedAt(iat)//签发时间 iat
				.sign(Algorithm.HMAC256(key));//加密
		return token;
	}
	
	
	/**
	 * 验证token
	 * @param token
	 * @param key
	 * @throws Exception
	 */
	public static User verifyToken(String token){
		User user =new User();
		JWTVerifier verifier=null;
		try {
			verifier = JWT.require(Algorithm.HMAC256(key))
			        .build();
			if(verifier==null) {
				return null;
			}
			DecodedJWT jwt = verifier.verify(token);
		    Map<String, Claim> claims = jwt.getClaims();
		    user.setId(Integer.valueOf(claims.get("id").asString()));
		    user.setRole(Integer.valueOf(claims.get("role").asString()));
		    user.setState(claims.get("state").asString());
		    user.setUserName(claims.get("userName").asString());
		    System.out.println(Json.tojson(user));
		    return user;
		} catch (JWTVerificationException | IllegalArgumentException | UnsupportedEncodingException  e) {
			e.printStackTrace();
		    System.out.println(Json.tojson(user));
			return null;
		} 
		    
	}
	
	
	public static void main(String[] args) {
		User user =new User();
	    user.setId(1);
//	    user.setRole("role11");
	    user.setState("222");
	    user.setUserName("username");
		try {
			System.out.println(JsonWebToken.createToken(user));
			JsonWebToken.verifyToken("yJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoicm9sZTExIiwiaXNzIjoiYWRtaW4iLCJpZCI6IjEiLCJzdGF0ZSI6IjIyMiIsInVzZXJOYW1lIjoidXNlcm5hbWUiLCJpYXQiOjE1MTYwODg1NDB9.ez_Hh4u2pUgh7_RSRExTr1-rLSrtDHByOzNowSGy08E");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
