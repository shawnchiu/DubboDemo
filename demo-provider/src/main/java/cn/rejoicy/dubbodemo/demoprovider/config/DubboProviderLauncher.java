package cn.rejoicy.dubbodemo.demoprovider.config;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @author qxl
 * @date 2019/5/7 11:12
 */
@Configuration
@EnableDubboConfiguration
public class DubboProviderLauncher {
//
//    @Bean
//    public RegistryConfig registry() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("127.0.0.1:2181");
//        registryConfig.setProtocol("zookeeper");
//        return registryConfig;
//    }
//
//    @Bean
//    public ApplicationConfig application() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("testApp");
//        return applicationConfig;
//    }
//
//    @Bean
//    public MonitorConfig monitorConfig() {
//        MonitorConfig mc = new MonitorConfig();
//        mc.setProtocol("registry");
//        return mc;
//    }
//
//    @Bean
//    public ReferenceConfig referenceConfig() {
//        ReferenceConfig rc = new ReferenceConfig();
//        rc.setMonitor(monitorConfig());
//        return rc;
//    }
//
//    @Bean
//    public ProtocolConfig protocol() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//    }
//
//    @Bean
//    public ProviderConfig provider() {
//        ProviderConfig providerConfig = new ProviderConfig();
//        providerConfig.setMonitor(monitorConfig());
//        return providerConfig;
//    }

}
