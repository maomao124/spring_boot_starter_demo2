package mao.logspringbootstarter.config;

import mao.logspringbootstarter.interceptor.LogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Project name(项目名称)：spring_boot_starter_demo2
 * Package(包名): mao.logspringbootstarter.config
 * Class(类名): LogAutoConfiguration
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 22:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Configuration
public class LogAutoConfiguration implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LogInterceptor());
    }
}
