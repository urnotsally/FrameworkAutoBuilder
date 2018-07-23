<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>
    <settings>
        <!-- changes from the defaults -->
        <setting name="lazyLoadingEnabled" value="false"/>
    </settings>

    <typeAliases>
        <package name="com.jxt"/>
    </typeAliases>

    <mappers>
    <!--
        <mapper resource="mapper/payOrder/PayOrder.xml"/>     
    -->
    <#list xmlList as xml>
        <mapper resource="${xml}"/> 
    </#list> 
     
    </mappers>
</configuration>