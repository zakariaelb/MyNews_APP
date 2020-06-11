package digiplus.ma.mynewsapp;

//The DATA Class
public class MyData {

    private String mSectionName;
    private String mAuthor;
    private String mTitle;
    private String mPublicationDate;
    private String mUrl;

    public MyData(String section, String author, String title, String publicationDate, String url) {
        mSectionName = section;
        mAuthor = author;
        mTitle = title;
        mPublicationDate = publicationDate;
        mUrl = url;
    }

    public String getSectionName() {
        return mSectionName;
    }


    public String getAuthor() {
        return mAuthor;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getPublicationDate() {
        return mPublicationDate;
    }


    public String getUrl() {
        return mUrl;
    }
}
