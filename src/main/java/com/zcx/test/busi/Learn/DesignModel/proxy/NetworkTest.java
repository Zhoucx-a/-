package com.zcx.test.busi.Learn.DesignModel.proxy;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2022/3/3 13:45
 */
public class NetworkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.browse();
    }
}

interface NetWork {
    void browse();
}

//被代理类
class Server implements NetWork {

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork {

    private NetWork work;

    ProxyServer(NetWork work) {
        this.work = work;
    }

    private void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}