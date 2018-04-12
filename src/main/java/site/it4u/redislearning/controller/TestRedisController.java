package site.it4u.redislearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;

@RestController
public class TestRedisController {

    @Autowired
    private JedisCluster jedisCluster;

    @RequestMapping("/set")
    public void set() {
        jedisCluster.set("testName", "steven");
    }

    @RequestMapping("/show")
    public String show(){
        String testName = jedisCluster.get("testName");
        return testName;
    }
}
