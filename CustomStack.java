public class CustomStack {
    public int [] data;
    public final static int default_size=10;
    public int idx=-1;
    public CustomStack(){
        this(default_size);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public int Push(int val){
        if(idx>=this.data.length-1){
            return -1;
        }
        return this.data[++idx]=val;

    }
    public int Pop(int val){
        if(idx<0){
            return -1;
        }
        return this.data[idx--];
    }
    public int Peek(){
        return this.data[idx];
    }
}
