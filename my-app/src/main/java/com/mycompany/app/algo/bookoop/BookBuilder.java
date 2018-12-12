package algo.bookoop;

public class BookBuilder {

    public static void builderBook(Publication pub){
        java.util.List<IContent> list = pub.getPubContent();
        // build TOC
        IContent content = new TableOfContent();
        list.add(content);
        //build Paragraph
        IContent pargraph_0 = new Paragraph("paragraph 0");
        IContent pargraph_1 = new Paragraph("paragraph 1");

        IContent pargraph_2 = new Paragraph("paragraph 2");
        IContent pargraph_3 = new Paragraph("paragraph 3");
        //build Section
        IContent section_0 = new Section(0);
        section_0.addContent(pargraph_0, null, null);
        section_0.addContent(pargraph_1, null, null);

        IContent section_1 = new Section(1);
        section_1.addContent(pargraph_2, null, null);
        section_1.addContent(pargraph_3, null, null);
        //build Chapter
        IContent chapter_0 = new Chapter(0);
        chapter_0.addContent(section_0, null, null);
        chapter_0.addContent(section_1, null, null);
        list.add(chapter_0);

        pub.showInfo();
    }
}
