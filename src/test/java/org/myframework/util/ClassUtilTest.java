package org.myframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ClassUtilTest {
    @DisplayName("提取目标类方法：extractPackageClassTest")
    @Test
    /**
     * 这里名字不重要
     */
    public void extractPackageClassTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("top.candysky.entity");
        System.out.println(classSet);
        Assertions.assertEquals(4, classSet.size());
    }
}
