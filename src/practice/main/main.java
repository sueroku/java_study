package practice.main;


public class main {
    public static void main(String[] args) {
        Car1 min1 = new Car1();
//        Car1 min2 = new Car1("룰루랄라라"); // 매개변수를 받는 생성자가 Car1에는 없기때문에 호출할 수 없음
//        min1.name = "룰루랄라"; // Car1의 name은 private 하기 때문에 다른 클래스에서 접근할 수 없음
        min1.setName("룰루"); // Car1의 name은 private 하기 때문에 해당 객체의 메서드로만 접근 가능함.

        Car2 sue1 = new Car2();
        sue1.name = "룰루루라라라"; // 접근제한자를 설정하지 않았으므로, default 접근제한자가 걸린 객체의 name 변수. 같은 패키지 내라서 직접적으로 접근 가능

        Car3 yo1 = new Car3("루루루"); // 매개변수를 받는 생성자를 불러 객체 생성, 이 생성자의 내용을 보면 매개변수를 받아 해당 객체의 name에 넣어준다.
//        Car3 yo2 = new Car3(); // 기본 생성자를 정의하지 않았으므로 객체 생성이 안된다.

    }
}




class Car1{
    // private  변수가 있고, 생성자는 없음.
    // 객체의 메서드로만 private 변수에 접근 가능
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    // 그러나 이렇게 객체 변수를 세팅하는 함수를 총칭하여 setter라고 하는데,
    // 잘안쓰인다고함. 애초에 객체를 선언할때 생성자로 객체 변수를 세팅하면서 객체를 만듬

}





class Car2{
    String name;

    // 변수에 접근제한자 선언 없으면 default(같은 패키지 내에서 접근 가능)로 자동 선언
    // Car2 클래스와 main 클래스가 같은 패키지 안에 있으므로 main클래스 내부에서 접근 가능
}





class Car3{
    // private  변수가 있고, 생성자가 있음
    private String name;

//    Car3(){} // 다른 클래스에서 Car3의 객체를 만들 때, ()안에 별다른 변수가 없으면 이 생성자 호출

    Car3(String name){ // 다른 클래스에서 Car3의 객체를 만들 때, ()안에 String변수가 있으면 이 생성자 호출
        this.name = name;
    } // 이렇게 매개변수를  받는 생성자를 만들면 위의 기본생성자를 만들어줘야한다.
//    아무런 생성자를 안만들어도 위의 기본생성자가 기본적으로 내장되어있음

    public void setName(String name) {
        this.name = name;
    }
}
