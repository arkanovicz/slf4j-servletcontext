package com.commongroundpublishing.slf4j.impl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextLoggerSCL implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContextLogger.setServletContext(sce.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent sce) {}

}
