package algo.bookoop;

import java.util.List;

public abstract class Publication {



    public final String _ISBN;
    public final String _publisher;


    public Publication(String isbn, String publisher){

        this._ISBN = isbn;
        this._publisher = publisher;
    }

    public String get_ISBN() {
        return _ISBN;
    }

    public String get_publisher() {
        return _publisher;
    }

    abstract public List<IContent> getPubContent();

    abstract public  void  showInfo();


}
