package mao.logspringbootstarter.interceptor;

import mao.logspringbootstarter.log.Log;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Project name(项目名称)：spring_boot_starter_demo2
 * Package(包名): mao.logspringbootstarter.interceptor
 * Class(类名): LogInterceptor
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 22:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LogInterceptor implements HandlerInterceptor
{
    private static final ThreadLocal<Long> THREAD_LOCAL = new ThreadLocal<>();


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Log log = method.getAnnotation(Log.class);
        if (log != null)
        {
            long startTime = System.currentTimeMillis();
            THREAD_LOCAL.set(startTime);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception
    {
        long endTime = System.currentTimeMillis();
    }
}
