package algo.bookoop;

import java.awt.*;

public interface IContent {

    public void addContent(IContent content, String txt, Image image);

    public IContent getContent();

    public void processContent();

}
