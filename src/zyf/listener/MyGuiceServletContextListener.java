package zyf.listener;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import zyf.moduels.MyModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.inject.struts2.Struts2GuicePluginModule;

/**
 * 
 * @author yanfangzhang
 *
 */
public class MyGuiceServletContextListener extends GuiceServletContextListener {  
    @Override  
    protected Injector getInjector() {  
        return Guice.createInjector(  
                new Struts2GuicePluginModule(), //这个是struts2与guice组件结合的注入 
                new ServletModule() {  
                    @Override  
                    protected void configureServlets() {  
                        // Struts 2 setup  
                        bind(StrutsPrepareAndExecuteFilter.class).in(Singleton.class);  
                        filter("/*").through(StrutsPrepareAndExecuteFilter.class);  
                        //注册自己的Module，对Guice了解的都懂得  
                        install(new MyModule());  
                    }  
                });  
  
    }  
}  
