package com.shihe.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "netty")
public class NettyConfigProperties {

    public int port;

    public String wsname;

    public NettyConfigProperties() {
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getWsname() {
        return wsname;
    }

    public void setWsname(String wsname) {
        this.wsname = wsname;
    }
}
