package com.wherewego.rpc.connect;

import com.wherewego.rpc.config.RpcConfig;
import com.wherewego.rpc.invoke.RequestInvoker;
import com.wherewego.rpc.transport.Request;
import io.netty.channel.Channel;

/**
 * @author: 陈云龙
 * @createdate: 2020/09/17
 **/
class TestClient {

    public static void main(String[] args) {
        RpcConfig config = new RpcConfig();

        config.setProtocol("wqRpc");
        config.setServerPort(8888);
        config.setServerName("MyRpc");



    }

}