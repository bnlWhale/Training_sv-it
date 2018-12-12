package algo.bookoop;

import java.awt.*;

public class TableOfContent implements IContent{


    private String html_txt = "html_table_of_content";

    @Override
    public void addContent(IContent content, String txt, Image image) {

    }

    @Override
    public IContent getContent() {
        return null;
    }

    @Override
    public void processContent() {
        System.out.println(html_txt);
    }
}
