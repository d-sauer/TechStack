import com.techstack.helloworld.api.MetaDataService;

module techstack.helloworld.provider {
    requires techstack.helloworld.api;
    requires spring.context;

    provides MetaDataService with com.techstack.helloworld.provider.PropertiesMetadataService;
}