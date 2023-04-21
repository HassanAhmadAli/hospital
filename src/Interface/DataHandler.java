package Interface;

import java.util.ArrayList;
// from ali.saeed
public interface DataHandler<T> {
    public void update(T x , T y);
    public void remove(T x);
    public void add(T x);
    public ArrayList<T> load();
}