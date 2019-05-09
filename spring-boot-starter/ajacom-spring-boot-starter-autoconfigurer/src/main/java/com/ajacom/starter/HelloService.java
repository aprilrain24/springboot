package com.ajacom.starter;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 15:38
 */
public class HelloService {
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix()+"-" +name + helloProperties.getSuffix();
    }
}
