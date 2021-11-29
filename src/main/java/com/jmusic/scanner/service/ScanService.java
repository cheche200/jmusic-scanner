package com.jmusic.scanner.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmusic.scanner.model.ultimateguitar.UltimateGuitarResponse;
import lombok.val;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScanService {

    public void scan(){
        try {
            val webPage = Jsoup
                    .connect("https://tabs.ultimate-guitar.com/tab/misc-traditional/happy-birthday-chords-1084205")
                    .get();
            Element masthead = webPage.select("div.js-store").first();
            String dataContent =  masthead.attr("data-content");
            ObjectMapper mapper = new ObjectMapper();
            UltimateGuitarResponse actualObj = mapper.readValue(dataContent, UltimateGuitarResponse.class);

            System.out.println(dataContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
