package algo.bookoop;

import java.awt.*;

public class Paragraph implements IContent {

    private StringBuilder paraTxt;

    public Paragraph(String _paraTxt) {

        this.paraTxt = new StringBuilder();
        this.paraTxt.append(_paraTxt);

    }


    @Override
    public void addContent(IContent content, String txt, Image image) {
        if (txt != null) {
            this.paraTxt.append(txt);
        }
    }

    @Override
    public IContent getContent() {
        return null;
    }

    @Override
    public void processContent() {

        System.out.println("   " + this.paraTxt.toString());
    }

    @Override
    public String toString() {
        String paragraphe = "Paragraph";
        return paragraphe;
    }
}
