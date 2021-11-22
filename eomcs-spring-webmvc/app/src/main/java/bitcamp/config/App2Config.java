package bitcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "bitcamp.web.app2")
public class App2Config {

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver vr = new InternalResourceViewResolver(
        "/WEB-INF/jsp2/", // prefix
        ".jsp" // suffix
        );
    return vr;
    // => prefix + 페이지컨트롤러 리턴 값 + suffix
    // 예) "/WEB-INF/jsp2/" + "board/list" + ".jsp" = /WEB-INF/jsp2/board/list.jsp
  }
}
