package com.github.huotaihe.samples.java;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.Arrays;

/**
 * @author 寒溪
 * @date 2021/08/28
 */
public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
        Arrays.stream(beanInfo.getPropertyDescriptors()).forEach(
            propertyDescriptor -> {
                if ("name".equals(propertyDescriptor.getName())) {
                    propertyDescriptor.setPropertyEditorClass(StringToIntegerPropertyEditor.class);
                }
            }
        );
    }

    static class StringToIntegerPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            Integer value = Integer.valueOf(text);

            setValue(value);
        }
    }
}
