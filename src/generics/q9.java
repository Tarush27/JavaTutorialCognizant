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
Answer: No. You cannot create a static field of the type parameter T.


*/