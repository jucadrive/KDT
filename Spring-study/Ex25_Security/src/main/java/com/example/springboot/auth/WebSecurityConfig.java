package com.example.springboot.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
   
   @Override
   protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests()
         .antMatchers("/").permitAll()
         .antMatchers("/css/**", "/js/**", "/img/**").permitAll()
         .antMatchers("/guest/**").permitAll()
         .antMatchers("/member/**").hasAnyRole("USER", "ADMIN")
         .antMatchers("/admin/**").hasRole("ADMIN")
         .anyRequest().authenticated();
      //다른 모든 요청은 인증된 사용자에게만 허용합니다. 
      http.formLogin()
               .permitAll();
      http.logout()
               .permitAll();
      
   }
   @Autowired
   //인메모리 인증을 설정하는 메서드입니다. 
   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      auth.inMemoryAuthentication()
         .withUser("user").password(passwordEncoder().encode("1234")).roles("USER")
         .and()
         .withUser("admin").password(passwordEncoder().encode("1234")).roles("ADMIN");
      //role_admin에서 role_는 자동으로 붙는다. 
   }
   public PasswordEncoder passwordEncoder() {
      //비밀번호를 암호화하기 위한 PasswordEncoder를 빈으로 등록하는 
      return PasswordEncoderFactories.createDelegatingPasswordEncoder();
   }
}
// passwordencoder 인터페이스를 구현한 클래스로 3가지 클래스를 제공한다
// 1. BCryptPasswordEncoder, 2. StandardPasswordEncoder, 3. NoOpPasswordEncoder