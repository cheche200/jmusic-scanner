package com.jmusic.scanner.model;

public class ChordsResponse {

    private Store store;

    private class Store {
        private Page page;
    }

    private class Page {
        private Data data;
    }

    private class Data {
        private TabView tab_view;
    }

    private class TabView {
        private WikiTab wiki_tab;
    }

    private class WikiTab {
    }
}
