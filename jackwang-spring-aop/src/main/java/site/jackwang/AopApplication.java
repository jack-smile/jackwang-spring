package site.jackwang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/9/24
 */
@SpringBootApplication
public class AopApplication implements EmbeddedServletContainerCustomizer {
    private static int port = 8080;


    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(port);
    }

    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            port = Integer.valueOf(args[0]);
        }
        SpringApplication.run(AopApplication.class, args);
    }
}
