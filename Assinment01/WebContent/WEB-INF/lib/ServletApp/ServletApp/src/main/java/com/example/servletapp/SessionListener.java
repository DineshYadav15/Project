package com.example.servletapp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class SessionListener implements ServletContextListener, HttpSessionListener {

    private static List<HttpSession> activeSessions = new ArrayList<>();

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // This method is called when the web application starts up.
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // This method is called when the web application shuts down.
        activeSessions.clear();
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        // This method is called when a new HttpSession is created.
        HttpSession session = httpSessionEvent.getSession();
        activeSessions.add(session);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        // This method is called when an HttpSession is destroyed (invalidated).
        HttpSession session = httpSessionEvent.getSession();
        activeSessions.remove(session);
    }

    public static List<HttpSession> getActiveSessions() {
        return activeSessions;
    }
}

