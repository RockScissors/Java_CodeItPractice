package org.example.Head02_OOPProgramming3.example.example03;


//LSP (Liskov Substitution Principle - 리스코프 치환 원칙)
//상위 타입의 객체를 사용하는 코드에서, 그 객체를 하위 타입의 객체로 바꾸더라도
//프로그램의 정확성이나 기존 동작 방식이 깨져서는 안 된다.
//=> 자식 클래스는 부모 클래스의 역할을 온전히 해내야 하며, '행동'에 있어 부모와
//일관되어야 한다.

//리스코프 원칙은 "신뢰"에 대한 원칙이다. "자식 클래스라면 부모가 하던 행동을 똑같이
//것이다."라는 신뢰를 보장하여, 객체 지향 프로그래밍의 다형성을 안정적으로 만들어주는
//원칙이다.
//'클라이언트 코드는 Payment라는 인터페이스(상위 타입)만 보고 코드를 짠다. 나중에
//CryptoPayment라는 새로운 클래스(하위 타입)이 추가되더라도, 이 CryptoPayment가
//Payment의 약속과 행동 방식을 100% 지킬 것이라는 신뢰가 있기 때문에 클라이언트 코드를
//수정할 필요가 없는 것이다.'
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getArea(){
        return width * height;
    }
}
