package com.techstack.helloworld.runner.controller;

import com.techstack.helloworld.api.MetaDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MetadataController {

    private final MetaDataService metaDataService;

    public MetadataController(MetaDataService metaDataService) {
        this.metaDataService = metaDataService;
    }

    @GetMapping("/metadata")
    public Map<String, Object> getAllMetadata() {
        return this.metaDataService.metadata();
    }

    @GetMapping("/metadata/{key}")
    public ResponseEntity<Object> getMetadata(@PathVariable("key") String key) {
        if (!StringUtils.hasText(key)) {
            return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        }

        Object value = this.metaDataService.metadata().get(key);
        if (value != null) {
            return new ResponseEntity<Object>(value, HttpStatus.OK);
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
    }
}
