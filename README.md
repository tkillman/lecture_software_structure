* S01 Strategy pattern <br/>
전략패턴은 interface를 상속받아 알고리즘을 교체 <br/>
ex) 결제방식
![image](./img/s01_strategy_img.PNG)

* S02 옵저버 패턴 <br/>
주체 객체가 있고 주체 객체가 옵저버 객체 전체를 가지고 있는다.
주체 객체에 업데이트가 일어나면 전체 옵저버에 update 메소드 실행
![image](./img/s02_observe_img.PNG)

* S03 Command 패턴 <br/>
커맨드 패턴은 요청을 객체로 만들어 실행자와 수행자를 분리한다.
![image](./img/s03_command_img.PNG)

* S04 Template 패턴 <br/>
이미 순서를 가진 객체를 관리 <br/>
final로 순서를 고정시킨 template도 hook이라는 메소드 개념으로 
유연성을 확보할 수도 있다.
![image](./img/s04_template_img.PNG)
![image](./img/s04_template_img2.PNG)

* S05 State 패턴 <br/>
if문이 너무 많아질 때, 상태별로 클래스를 따로 만들어버리는 방법 <br/>
Strategy pattern과 유사하다.
![image](./img/s05_state_img.PNG)

* S06 iterator 패턴<br/>
컬렉션의 내부 구조를 노출하지 않고, 요소를 순차적으로 접근하게 해주는 패턴
![image](./img/s06_iterator_img.PNG)

* S07 Cor(Chain of Responsibility Pattern) 패턴
CoR 패턴은 요청을 체인으로 전달하며 처리 책임을 분산한다.
![image](./img/s07_cor_img.PNG)