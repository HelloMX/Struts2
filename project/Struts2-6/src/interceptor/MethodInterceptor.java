package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class MethodInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {

        System.out.println("进入method方法拦截器");
        String url=actionInvocation.invoke();
        System.out.println("走出method方法拦截器");
        return url;
    }
}
