package org.davorsauer.techstack.common.logging;

import java.util.WeakHashMap;

import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public interface Logger extends org.slf4j.Logger {

    public static final WeakHashMap<Class<?>, org.slf4j.Logger> loggers = new WeakHashMap<>();
    
    default public org.slf4j.Logger Log() {
        Class<?> c = getClass();
        org.slf4j.Logger log = loggers.get(c);
        if (log == null) {
            log = LoggerFactory.getLogger(c);
            loggers.put(c, log);
        }
        
        return log;
    }


    /**
     * {@inheritDoc}
     */
    default public String getName() {
        return Log().getName();
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isTraceEnabled() {
        return Log().isTraceEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(String msg){
        Log().trace(msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(String format, Object arg){
        Log().trace(format, arg);
    }

    
    /**
     * {@inheritDoc}
     */
    default public void trace(String format, Object arg1, Object arg2){
        Log().trace(format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(String format, Object... arguments){
        Log().trace(format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(String msg, Throwable t){
        Log().trace(msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isTraceEnabled(Marker marker){
        return Log().isTraceEnabled(marker);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(Marker marker, String msg){
        Log().trace(marker, msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(Marker marker, String format, Object arg){
        Log().trace(marker, format, arg);
    }

    
    /**
     * {@inheritDoc}
     */
    default public void trace(Marker marker, String format, Object arg1, Object arg2){
        Log().trace(marker, format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(Marker marker, String format, Object... argArray){
        Log().trace(marker, format, argArray);
    }

    /**
     * {@inheritDoc}
     */
    default public void trace(Marker marker, String msg, Throwable t){
        Log().trace(marker, msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isDebugEnabled(){
        return Log().isDebugEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(String msg){
        Log().debug(msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(String format, Object arg){
        Log().debug(format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(String format, Object arg1, Object arg2){
        Log().debug(format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(String format, Object... arguments){
        Log().debug(format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(String msg, Throwable t){
        Log().debug(msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isDebugEnabled(Marker marker){
        return Log().isDebugEnabled(marker);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(Marker marker, String msg){
        Log().debug(marker, msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(Marker marker, String format, Object arg){
        Log().debug(marker, format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(Marker marker, String format, Object arg1, Object arg2){
        Log().debug(marker, format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(Marker marker, String format, Object... arguments){
        Log().debug(marker, format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void debug(Marker marker, String msg, Throwable t){
        Log().debug(marker, msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isInfoEnabled(){
        return Log().isInfoEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void info(String msg){
        Log().info(msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(String format, Object arg){
        Log().info(format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(String format, Object arg1, Object arg2){
        Log().info(format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(String format, Object... arguments){
        Log().info(format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(String msg, Throwable t){
        Log().info(msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isInfoEnabled(Marker marker){
        return Log().isInfoEnabled(marker );
    }

    /**
     * {@inheritDoc}
     */
    default public void info(Marker marker, String msg){
        Log().info(marker, msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(Marker marker, String format, Object arg){
        Log().info(marker, format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(Marker marker, String format, Object arg1, Object arg2){
        Log().info(marker, format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(Marker marker, String format, Object... arguments){
        Log().info(marker, format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void info(Marker marker, String msg, Throwable t){
        Log().info(marker, msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isWarnEnabled(){
        return Log().isWarnEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(String msg){
        Log().warn(msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(String format, Object arg){
        Log().warn(format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(String format, Object... arguments){
        Log().warn(format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(String format, Object arg1, Object arg2){
        Log().warn(format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(String msg, Throwable t){
        Log().warn(msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isWarnEnabled(Marker marker){
        return Log().isWarnEnabled(marker);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(Marker marker, String msg){
        Log().warn(marker, msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(Marker marker, String format, Object arg){
        Log().warn(marker, format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(Marker marker, String format, Object arg1, Object arg2){
        Log().warn(marker, format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(Marker marker, String format, Object... arguments){
        Log().warn(marker, format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void warn(Marker marker, String msg, Throwable t){
        Log().warn(marker, msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isErrorEnabled(){
        return Log().isErrorEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void error(String msg){
        Log().error(msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(String format, Object arg){
        Log().error(format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(String format, Object arg1, Object arg2){
        Log().error(format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(String format, Object... arguments){
        Log().error(format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(String msg, Throwable t){
        Log().error(msg, t);
    }

    /**
     * {@inheritDoc}
     */
    default public boolean isErrorEnabled(Marker marker){
        return Log().isErrorEnabled();
    }

    /**
     * {@inheritDoc}
     */
    default public void error(Marker marker, String msg){
        Log().error(marker, msg);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(Marker marker, String format, Object arg){
        Log().error(marker, format, arg);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(Marker marker, String format, Object arg1, Object arg2){
        Log().error(marker, format, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(Marker marker, String format, Object... arguments){
        Log().error(marker, format, arguments);
    }

    /**
     * {@inheritDoc}
     */
    default public void error(Marker marker, String msg, Throwable t){
        Log().error(marker, msg, t);
    }

}
