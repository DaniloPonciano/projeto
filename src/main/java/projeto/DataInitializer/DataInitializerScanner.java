package projeto.DataInitializer;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import projeto.DataInitializerD;

@Configuration
public class DataInitializerScanner {
    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public Set<Class<?>> dataInitializerClasses() throws ClassNotFoundException{
        String basePackage = "projeto.DataInitializer";

        ClassPathScanningCandidateComponentProvider scanner = 
        new ClassPathScanningCandidateComponentProvider(false);

        scanner.addIncludeFilter(new AnnotationTypeFilter(DataInitializerType.class));

        Set<Class<?>> classes = new HashSet<>();
        for(String basePackageToScan : StringUtils.tokenizeToStringArray(basePackage, ",; \t\n")){
            for(BeanDefinition bd : scanner.findCandidateComponents(basePackageToScan)){
                classes.add(ClassUtils.forName(bd.getBeanClassName(), ClassUtils.getDefaultClassLoader()));
            }
        }
        return classes;
        };

        @Bean
        public CommandLineRunner initData(Set<Class<?>> dataInitializerClasses){
            return args -> {
                for(Class<?> initializerClass : dataInitializerClasses){
                    try{
                    Object instancia = applicationContext.getBean(initializerClass);
                    Method saveMethod = initializerClass.getMethod("init");
                    saveMethod.invoke(initializerClass);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
}
