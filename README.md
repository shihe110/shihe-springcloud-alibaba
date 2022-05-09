# shihe-springcloud-alibaba
micro service for springcloud and alibaba

## shihe-springcloud-nacos
springcloud微服务学习使用nacos
注册中心、配置中心是nacos两个不同的依赖，需要那个引入那个，如在只使用注册中心时引入配置中心配置，会报错
```yaml
server:
  port: 8082
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8110
```
报错信息
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2022-05-09 15:14:17.178  INFO 9884 --- [           main] c.a.n.c.c.impl.LocalConfigInfoProcessor  : LOCAL_SNAPSHOT_PATH:C:\Users\shihe\nacos\config
2022-05-09 15:14:17.204  INFO 9884 --- [           main] c.a.nacos.client.config.impl.Limiter     : limitTime:5.0
2022-05-09 15:14:18.225 ERROR 9884 --- [           main] c.a.n.c.config.http.ServerHttpAgent      : [NACOS SocketTimeoutException httpGet] currentServerAddr:http://localhost:8848， err : connect timed out
2022-05-09 15:14:19.233 ERROR 9884 --- [           main] c.a.n.c.config.http.ServerHttpAgent      : [NACOS SocketTimeoutException httpGet] currentServerAddr:http://localhost:8848， err : connect timed out
2022-05-09 15:14:20.247 ERROR 9884 --- [           main] c.a.n.c.config.http.ServerHttpAgent      : [NACOS SocketTimeoutException httpGet] currentServerAddr:http://localhost:8848， err : connect timed out
2022-05-09 15:14:20.247 ERROR 9884 --- [           main] c.a.n.c.config.http.ServerHttpAgent      : no available server
2022-05-09 15:14:20.249 ERROR 9884 --- [           main] c.a.n.client.config.impl.ClientWorker    : [fixed-localhost_8848] [sub-server] get server config exception, dataId=nacos-demo, group=DEFAULT_GROUP, tenant=

java.net.ConnectException: no available server
	at com.alibaba.nacos.client.config.http.ServerHttpAgent.httpGet(ServerHttpAgent.java:134) ~[nacos-client-1.4.1.jar:na]
	at com.alibaba.nacos.client.config.http.MetricsHttpAgent.httpGet(MetricsHttpAgent.java:51) ~[nacos-client-1.4.1.jar:na]
	at com.alibaba.nacos.client.config.impl.ClientWorker.getServerConfig(ClientWorker.java:274) ~[nacos-client-1.4.1.jar:na]
	at com.alibaba.nacos.client.config.NacosConfigService.getConfigInner(NacosConfigService.java:155) [nacos-client-1.4.1.jar:na]
	at com.alibaba.nacos.client.config.NacosConfigService.getConfig(NacosConfigService.java:98) [nacos-client-1.4.1.jar:na]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceBuilder.loadNacosData(NacosPropertySourceBuilder.java:85) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceBuilder.build(NacosPropertySourceBuilder.java:73) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceLocator.loadNacosPropertySource(NacosPropertySourceLocator.java:199) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceLocator.loadNacosDataIfPresent(NacosPropertySourceLocator.java:186) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceLocator.loadApplicationConfiguration(NacosPropertySourceLocator.java:141) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at com.alibaba.cloud.nacos.client.NacosPropertySourceLocator.locate(NacosPropertySourceLocator.java:103) [spring-cloud-starter-alibaba-nacos-config-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at org.springframework.cloud.bootstrap.config.PropertySourceLocator.locateCollection(PropertySourceLocator.java:52) [spring-cloud-context-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at org.springframework.cloud.bootstrap.config.PropertySourceLocator.locateCollection(PropertySourceLocator.java:47) [spring-cloud-context-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration.initialize(PropertySourceBootstrapConfiguration.java:98) [spring-cloud-context-2.2.5.RELEASE.jar:2.2.5.RELEASE]
	at org.springframework.boot.SpringApplication.applyInitializers(SpringApplication.java:626) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.prepareContext(SpringApplication.java:370) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:314) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1237) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at com.shihe.NacosApplication.main(NacosApplication.java:12) [classes/:na]

```
