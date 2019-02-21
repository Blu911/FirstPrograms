package simplePrograms;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ProggramingOfferFinder {
    public static void main(String[] args) {

        Connection connect = Jsoup.connect("https://www.pracuj.pl/praca/programista;kw/gdansk;wp");
        try {
            Document document = connect.get();
            Elements links = document.select("a.offer-details__title-link");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
