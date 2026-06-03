import java.lang.reflect.Method;

public class Exercise_39_ReflectionExample {

    public void message() {

        System.out.println(
                "Reflection Executed");
    }

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName(
                        "Exercise_39_ReflectionExample");

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {

            System.out.println(
                    m.getName());
        }

        Method method =
                cls.getDeclaredMethod(
                        "message");

        method.invoke(obj);
    }
}