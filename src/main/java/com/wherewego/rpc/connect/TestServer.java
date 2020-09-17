package com.wherewego.rpc.connect;

import com.wherewego.rpc.config.MyConfig;
import com.wherewego.rpc.config.RpcConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: 陈云龙
 * @createdate: 2020/09/17
 **/
class TestServer {

    public static void main(String[] args) {
        RpcConfig config = new RpcConfig();

        config.setProtocol("wqRpc");
        config.setServerPort(8888);
        config.setServerName("MyRpc");

        Server server = new Server();

        try {
            server.run(config.getServerPort());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}