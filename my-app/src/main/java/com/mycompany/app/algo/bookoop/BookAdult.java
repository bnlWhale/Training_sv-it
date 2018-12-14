package algo.bookoop;

import java.util.ArrayList;
import java.util.List;

public class BookAdult extends Publication {


    private java.util.List<IContent> pubContent;


    private float sellPrice = 0.0f;

    public BookAdult(String isbn, String publisher) {
        super(isbn, publisher);
        pubContent = new ArrayList<IContent>();
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public List<IContent> getPubContent() {
        return pubContent;
    }

    public void showInfo() {
        System.out.println("this book's content is:");
        java.util.Iterator<IContent> iterator = pubContent.iterator();
        while (iterator.hasNext()) {
            IContent content = iterator.next();
            content.processContent();
        }

    }


}
