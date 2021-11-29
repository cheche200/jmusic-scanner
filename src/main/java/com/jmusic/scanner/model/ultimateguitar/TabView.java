
package com.jmusic.scanner.model.ultimateguitar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TabView {
    @JsonProperty("wiki_tab")
    public WikiTab wikiTab;
}
