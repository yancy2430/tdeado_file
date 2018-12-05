package com.tdeado.file.config.Interceptor;

import com.tdeado.file.interceptor.LoginTimeInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.MultipartConfigElement;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    private InterceptorRegistration obj;


    /**
     * 在配置文件中配置的文件保存路径
     */
    @Value("${img.location}")
    private String location;
    @Value("${img.directory}")
    private String directory;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //这里可以添加多个拦截器  
        obj = registry.addInterceptor(new LoginTimeInterceptor());
        obj.addPathPatterns("/**");
        obj.excludePathPatterns("/user/login");
        obj.excludePathPatterns("/boss/**");
        obj.excludePathPatterns("/demo/**");
        obj.excludePathPatterns("/api/**");
        super.addInterceptors(registry);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大KB,MB
        factory.setMaxFileSize("5MB");
        //设置总上传数据总大小
        factory.setMaxRequestSize("20MB");
        return factory.createMultipartConfig();
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/boss/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");
        registry.addResourceHandler("/demo/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/demo/");
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        registry.addResourceHandler("/MP_verify_fzmfiZQmYt6UDmm1.txt").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static//MP_verify_fzmfiZQmYt6UDmm1.txt");
        //映射图片保存地址ca.cert.pem
        registry.addResourceHandler("/upload/**").addResourceLocations("file:"+directory+location);
//        registry.addResourceHandler("/OTA/**").addResourceLocations("file:D:/OTA/");
        super.addResourceHandlers(registry);
    }
}  
