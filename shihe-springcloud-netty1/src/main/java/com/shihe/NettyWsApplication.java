package com.shihe;

import com.shihe.config.NettyConfigProperties;
import com.shihe.server.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class NettyWsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettyWsApplication.class, args);
    }

    @Autowired
    private NettyConfigProperties nettyConfig;

    @Override
    public void run(String... args) throws Exception {
        int port = nettyConfig.getPort();
        String wsname = nettyConfig.getWsname();
        try {
            new NettyServer(port, wsname).start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NettyServerError:"+e.getMessage());
        }
    }
}
