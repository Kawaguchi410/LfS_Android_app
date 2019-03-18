package karatakushi.io.lfs_android_app;

import java.io.Serializable;

public class CommentData implements Serializable {
    String title;
    int page;
    String content;

    CommentData(){

    }

    CommentData(String title, int page){
        this.title = title;
        this.page = page;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }
}
