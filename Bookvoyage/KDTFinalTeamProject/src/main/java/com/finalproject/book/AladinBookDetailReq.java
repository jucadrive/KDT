package com.finalproject.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class AladinBookDetailReq {

    private String TTBKey = "ttbdhzlehzl011603001";
    private String itemIdType = "ISBN";
    private String ItemId = "9791198173898";
    private String[] OptResults =
            {"Toc", "fulldescription", "previewImgList", "authors", "Story", "phraseList", "cardReviewImgList", "packing"};
    private String output = "js";
    private String Version = "20131101";

    public MultiValueMap<String, String> toMultiValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("ttbkey", TTBKey);
        map.add("itemIdType", itemIdType);
        map.add("ItemId", ItemId);
        map.add("OptResult", String.join(",", OptResults));
        map.add("output", output);
        map.add("Version", Version);

        return map;
    }
}