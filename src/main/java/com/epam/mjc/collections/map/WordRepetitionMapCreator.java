package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String[] wordsWithoutSpace = sentence.split("\\W+");

        for (String word : wordsWithoutSpace) {
            word = word.toLowerCase();
            if (wordRepetitionMap.containsKey(word)) {
                wordRepetitionMap.put(word, wordRepetitionMap.get(word) + 1);
            } else {
                wordRepetitionMap.put(word, 1);
            }
        }
        return wordRepetitionMap;
    }
}
