package algo.bookoop;

import java.awt.*;
import java.util.ArrayList;

public class Chapter implements IContent {

    private java.util.List<IContent> chapterList;
    private int _id;


    public Chapter(int id){
        this._id = id;
        chapterList = new ArrayList<IContent>();
    }


    @Override
    public void addContent(IContent content, String txt, Image image) {
         if(content instanceof Section){
             chapterList.add(content);
         }
    }

    @Override
    public IContent getContent() {
        return null;
    }

    @Override
    public void processContent() {
        System.out.println("Chapter "+this._id);
        java.util.Iterator<IContent> iterator = chapterList.iterator();
        while (iterator.hasNext()){
            IContent content = iterator.next();
            content.processContent();
        }
    }
}
