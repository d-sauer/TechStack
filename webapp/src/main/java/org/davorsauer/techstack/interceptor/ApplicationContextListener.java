package org.davorsauer.techstack.interceptor;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.davorsauer.techstack.common.logging.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

/**
 * Register listener in web.xml
 * <pre>
 * {@code
 * <listener>
 *   <listener-class>
 *            org.davorsauer.techstack.interceptor.ApplicationContextListener
 *       </listener-class>
 *  </listener>
 * }
 *  </pre>
 * @author d-sauer
 *
 */
public class ApplicationContextListener implements ServletContextListener, Logger {

    
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        trace("SERVLET contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        trace("SERVLET contextDestroyed");
        
        /**
         * http://logback.qos.ch/manual/jmxConfig.html
         * Unregister the JMXConfigurator instance from the JVM's Mbeans server if enabled in logback.xml with '<jmxConfigurator />' flag
         */
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        lc.stop();
    }


}
