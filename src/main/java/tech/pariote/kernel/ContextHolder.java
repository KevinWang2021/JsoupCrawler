package tech.pariote.kernel;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextHolder implements ApplicationContextAware {
    private static ApplicationContext ctx;//单例

    public static ApplicationContext getCtx() {
        return ctx;
    }


    /**
     * 通过应用上下文获取服务
     *
     * @param serviceName
     * @return
     */
    public static Object getService(String serviceName) {
        return ctx.getBean(serviceName);
    }

    /**
     * 通过应用上下文获取服务
     *
     * @param clazz
     * @return
     */
    public static Object getService(Class<?> clazz) {
        return ctx.getBean(clazz);
    }

    /**
     * web.xml中 spring mvc dispachservlet初始传感spring应用上文会被调用
     *
     * @param arg0
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        setCtx(arg0);
        System.out.println("*******************the context holdler has been created");
    }

    public void setCtx(ApplicationContext arg0) {
        ContextHolder.ctx = arg0;
    }

    /**
     * 通过应用上下文获取bean
     *
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<?> beanName) {
        if (getCtx() != null) {
            try {
                return (T) getCtx().getBean(beanName);
            } catch (BeansException e) {
            }
        }
        return null;
    }
}
