package com.kasi.firstdemo.combine;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
/**
 * <pre> 合并对象的非空属性 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 06:57
 * @Version:
 */
public class CombineObj {
    /**
     * 合并对象非空属性
     * @param target        对象1：也是最后返回的合并后的对象
     * @param destination   对象2:
     * @param <M>
     * @throws Exception
     */
    public static <M> void merge(M target, M destination) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());
        for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
            if (descriptor.getWriteMethod() != null) {
                Object originalValue = descriptor.getReadMethod()
                        .invoke(target);
                if (originalValue == null) {
                    Object defaultValue = descriptor.getReadMethod().invoke(
                            destination);
                    descriptor.getWriteMethod().invoke(target, defaultValue);
                }
            }
        }
    }
}
