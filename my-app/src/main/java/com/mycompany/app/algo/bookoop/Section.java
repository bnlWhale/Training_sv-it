package algo.bookoop;

import java.awt.Image;
import java.util.ArrayList;

public class Section implements IContent {

    private java.util.List<IContent> sectionList;
    private int _id;

    public Section(int id) {
        this._id = id;
        this.sectionList = new ArrayList<IContent>();
    }


    @Override
    public void addContent(IContent content, String txt, Image image) {

        if (content instanceof Paragraph) {
            this.sectionList.add(content);
        }

    }

    @Override
    public IContent getContent() {
        return null;
    }

    @Override
    public void processContent() {
        System.out.println(" section " + this._id);
        java.util.Iterator<IContent> iterator = sectionList.iterator();
        while (iterator.hasNext()) {
            IContent content = iterator.next();
            content.processContent();
        }
    }
}
