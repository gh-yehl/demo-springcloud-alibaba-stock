Nacos Client Application - stock app需要注册到 Nacos  

Nacos springboot 客户端配置：  
1 - 依赖  

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>

    </dependencies>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.1.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    
2 - 启动类添加注解 - @EnableDiscoveryClient  
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }
}

3 - 配置文件配置 Nacos server信息  
#注意，server-addr不需要 添加协议
spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848

spring.application.name=stock
management.endpoints.web.exposure.include=*
#spring.cloud.nacos.discovery ???true?????false ???nacos??????
spring.cloud.nacos.discovery=false
