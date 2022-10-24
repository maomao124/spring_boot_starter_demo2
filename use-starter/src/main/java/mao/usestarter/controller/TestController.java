package mao.usestarter.controller;

import mao.logspringbootstarter.log.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_boot_starter_demo2
 * Package(包名): mao.usestarter.controller
 * Class(类名): TestController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 23:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
public class TestController
{
    /**
     * test1
     *
     * @return {@link String}
     */
    @GetMapping("/test1")
    @Log
    public String test1()
    {
        return "1 success";
    }

    /**
     * test2
     *
     * @return {@link String}
     */
    @GetMapping("/test2")
    @Log
    public String test2()
    {
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return "2 success";
    }

    /**
     * test3
     *
     * @return {@link String}
     */
    @GetMapping("/test3")
    @Log
    public String test3()
    {
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return "3 success";
    }

    /**
     * test4
     *
     * @return {@link String}
     */
    @GetMapping("/test4")
    @Log
    public String test4()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return "4 success";
    }

    /**
     * test5
     *
     * @return {@link String}
     */
    @GetMapping("/test5")
    @Log(desc = "这是test5方法的描述信息")
    public String test5()
    {
        return "5 success";
    }

    /**
     * test6
     *
     * @return {@link String}
     */
    @GetMapping("/test6")
    @Log(desc = "这是test5方法的描述信息")
    public String test6()
    {
        return "6 success";
    }
}
