public class NumAList{

    int[] list;
    int size;

    public NumAList(){
        this.list = new int[0];
        this.size = 0;
    }

    public NumAList(int size){
        this.list = new int[size];
        this.size = size;
    }

    // BUG: Should not reference the same input array! Instead copy contents to duplicate array.
    public NumAList(int[] list){
        int[] newList = new int[list.length];
        for(int i=0; i<list.length; i++){
            newList[i] = list[i];
        }
        this.list = newList;
        this.size = list.length;
    }

    void add(int num){
        int[] newArr = new int[this.size + 1];
        for(int i=0; i < this.size; i++){
            newArr[i] = this.list[i];
        }
        newArr[this.size] = num;
        this.list = newArr;
        this.size++;
    }

    boolean remove(int num){
        for(int i=0; i < this.size; i++){
            if(this.list[i] == num){
                int[] newArr = new int[this.size-1];
                for(int j=0; j < i; j++){
                    newArr[j] = this.list[j];
                }
                for(int j=i; j < this.size-1; j++){
                    newArr[j] = this.list[j+1];
                }
                this.list = newArr;
                this.size--;
                return true;
            }
        }
        return false;
    }

    int get(int index){
        return this.list[index];
    }

    int size(){
        return this.size;
    }

    boolean isEmpty(){
        return this.size == 0;
    }
}