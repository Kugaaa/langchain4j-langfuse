package com.kuga;

/**
 * Hello world!
 */
public class App {


    @Observe(name = "method_1", type = ObservationType.GENERATION)
    public String method_1(String str) {
        return method_2(str);
    }


    @Observe(name = "method_2", type = ObservationType.SPAN)
    public String method_2(String str) {
        return "method_2" + str;
    }


    public static void main(String[] args) {
        App app = new App();
        app.method_1("hello world");
    }
}
