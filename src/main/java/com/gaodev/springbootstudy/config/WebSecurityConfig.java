package com.gaodev.springbootstudy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/css/**", "/js/**", "/fonts/**", "/").permitAll() // 都可以访问
            .antMatchers("/members/**").hasRole("ADMIN") // 需要相应的角色才能访问
            .and()
            .formLogin(); // 基于表单登录
            //.loginPage("/login")// 自定义登录页面
            //.failureUrl("/login-error"); // 登录失败页面
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .exceptionHandling()
//                .and()
//                .csrf()
//                .disable()
//                .headers()
//                .frameOptions()
//                .disable()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .antMatchers("/swagger-ui/index.html").hasAuthority(AuthoritiesEnum.ADMIN.getRole());
//    }

    /**
     * 认证管理
     * @param auth
     * @throws Exception
     */
    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() // 认证信息 存 内存中
                .withUser("error").password("123456").roles("ERROR")
                .and()
                .withUser("gaodev").password(passwordEncoder().encode("123456")).roles("DEV")
                .and()
                .withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN");

    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // 设置默认的加密方式
        return new BCryptPasswordEncoder();
    }

}