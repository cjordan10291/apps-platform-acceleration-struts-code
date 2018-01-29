package org.superbiz.struts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }


//    @Bean
//    public FilterRegistrationBean filterDispatcher() {
//        return buildFilterRegistration(0, new FilterDispatcher());
//    }
//
//    @Bean
//    public FilterRegistrationBean actionContextCleanup() {
//        return buildFilterRegistration(1, new ActionContextCleanUp());
//    }
//
//    @Bean
//    public FilterRegistrationBean sitemeshPageFilter() {
//        return buildFilterRegistration(2, new PageFilter());
//    }
//
//
//    private FilterRegistrationBean buildFilterRegistration(int order, Filter filter) {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(filter);
//        registration.setUrlPatterns(asList(
//                "/decorators/layout.jsp",
////                "/addedUser.jsp",
////                "/findUser.action",
////                "/findUserForm.action",
////                "/findUserForm.jsp",
//                "/displayUser.jsp",
//                "/displayUsers.jsp",
//                "/listAllUsers.action"
//        ));
//
//
//
//        registration.setOrder(order);
//        return registration;
//    }
}
