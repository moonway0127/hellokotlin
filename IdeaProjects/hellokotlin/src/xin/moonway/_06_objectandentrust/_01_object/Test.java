package xin.moonway._06_objectandentrust._01_object;

public class Test {
    public static void process(Myclass obj){
        obj.verify();
    }

    public static  void main(String[] args) {
        process(new Myclass("Bill") {
            @Override
            public void verify() {
                System.out.println("object verify");

            }

        });
    }
}
