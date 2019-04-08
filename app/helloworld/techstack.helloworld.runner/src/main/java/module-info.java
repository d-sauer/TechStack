import com.techstack.helloworld.api.MetaDataService;

module techstack.helloworld.runner {
    requires techstack.helloworld.api;

    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.core;
    requires slf4j.api;

    uses MetaDataService;
}