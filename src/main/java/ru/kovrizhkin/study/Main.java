package ru.kovrizhkin.study;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://spb.hh.ru/search/vacancy?text=Java&area=2&hhtmFrom=main").get();
        Elements jobTitle = doc.getElementsByClass("serp-item__title");
        Elements jobCompany = doc.getElementsByClass("bloko-link_kind-tertiary");
        Elements jobSalary = doc.getElementsByClass("bloko-header-section-2");
        System.out.println(jobTitle);
    }
}