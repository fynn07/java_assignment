import java.util.ArrayList;

public class myMap <T>{

    ArrayList<T> keys = new ArrayList<>();
    ArrayList<T> values = new ArrayList<>();

    public myMap(T key, T value){
        keys.add(key);
        values.add(value);
    }

    public void put(T key, T value){
        Object index = getIndex(key);
        if(index != null){
            values.set((int) index, value);
        }
        else {
            keys.add(key);
            values.add(value);
        }
    }

    public T get(T key){
        Object index = getIndex(key);
        return (index != null) ? values.get((int)index) : null;
    }

    public T remove(T key){
        Object index = getIndex(key);
        if(index != null){
            Object value = get(key);
            keys.remove((int) index);
            values.remove((int) index);
            return (T) value;
        }
        return null;
    }

    public Object getIndex(T key){
        int flag = 0;
        for(T key_iteration : keys){
            if(key_iteration.equals(key)){
                return flag;
            }
            flag++;
        }
        return null;
    }

    public void printValues(){
        for(int i = 0; i < keys.size(); i++){
            System.out.print("(" + keys.get(i) + " ");
            System.out.print(values.get(i) + ") ");
        }
    }
}
