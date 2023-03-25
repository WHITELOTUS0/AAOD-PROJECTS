public class Generic <T> {
    T value;

    Generic(T value){
        this.value = value;
    }

    public T getObject(){
        return this.value;
    }

    public static void main(String[] args) {
        Generic<Integer> obj = new Generic<Integer>(15);
        System.out.println(obj.getObject());
    }

}
