package io.tyss.moviecatalogservice.controller;

import io.tyss.moviecatalogservice.entity.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers","Test",4)
        );
    }
}
