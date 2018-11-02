package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class SecondInterceptor implements Interceptor {

    private String someThing;

    @Override
    public void destroy() {

    }

    //初始化方法 当程序启动的时候 拦截器就已经被初始化完毕了
    @Override
    public void init() {
        System.out.println("初始化second拦截器");
        System.out.println("someThing: "+someThing);
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        //actionInvocation.invoke()让到达拦截器的请求继续前进，访问需要访问的资源
        System.out.println("进入Second拦截器");
        String returnName=actionInvocation.invoke();
        System.out.println("走出Second拦截器");
        return returnName;
    }


    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }
}
