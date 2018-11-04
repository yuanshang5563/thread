package org.ys.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRedis {
	
	@Test
	public void testSetAndGet() {
		Jedis jedis = null;
		try {
			jedis = new Jedis("127.0.0.1",6379);
			jedis.set("testkey", "testvalue");
			String testvalue = jedis.get("testkey");
			System.out.println("testvalue:"+testvalue);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}
	}
}
