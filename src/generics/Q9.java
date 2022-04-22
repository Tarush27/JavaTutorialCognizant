/*

Will the following class compile? If not, why?
public class Singleton<T> {

    public static T getInstance() {
        if (instance == null)
            instance = new Singleton<T>();

        return instance;
    }

    private static T instance = null;
}
Answer: No. java: non-static type variable T cannot be referenced from a static context


*/
package generics;

class Q9<T> {
       
    /*public static T getInstance() {
        if (instance == null)
            instance = new Q9<T>();

        return instance;
    }

    private static T instance = null;


    public static void main(String[] args) {
        Q9<Integer> ob = new Q9<>();
        System.out.println(ob.getInstance());
    }*/
}