package com.example.mavenshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // tiles 뷰 세팅1
    @Bean
    public TilesConfigurer tilesConfigurer() {
        // TilesConfigurer: Spring과 Tiles를 연결하는 설정 객체
        TilesConfigurer configurer = new TilesConfigurer();

        // tiles.xml 위치를 등록
        configurer.setDefinitions(new String[]{"/WEB-INF/tiles/tiles.xml"});

        return configurer;
    }

    // tiles 뷰 세팅2
    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver tilesViewResolver = new TilesViewResolver();

        // 반환된 뷰 이름을 Tiles 화면으로 처리
        tilesViewResolver.setViewClass(TilesView.class);

        // 여러 ViewResolver가 있을 때 우선순위
        tilesViewResolver.setOrder(1);  //뷰 우선순위

        return tilesViewResolver;
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        // JSP 파일이 있는 기본 경로
        resolver.setPrefix("/WEB-INF/views/");

        // 컨트롤러에서 반환한 뷰 이름 뒤에 붙일 확장자
        resolver.setSuffix(".jsp");

        // tilesView 실패시 jsp 사용하기위해 우선순위 2위
        resolver.setOrder(2);

        return resolver;
    }
}
