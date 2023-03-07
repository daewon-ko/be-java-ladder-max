# 2단계 -리팩토링 맛보기

---

# **프로그래밍 요구사항**

- [x]  메서드의 크기가 최대 10라인을 넘지 않도록 구현한다.
  - 메서드가 한 가지 일만 하도록 최대한 작게 만들어라.
- [x]  **들여쓰기(indent) depth를 2단계에서 1단계로 줄여라.**
  - depth의 경우 if 문을 사용하는 경우 1단계의 depth가 증가한다. if 문 안에 while 문을 사용한다면 depth가 2단계가 된다.
  - → extract Method 기능을 통해 해결
- [x]  **else를 사용하지 마라.**
  - if 문 내의 조건 만족 시 return;을 달아줌으로써 else를 제거
- [ ]  **구현 순서를 고려하면서 프로그래밍한다.**
  - 구현 순서를 고려하면서 프로그래밍한다는 말의 의미가 무엇일까?
- [x]  **naming convention을 지키면서 프로그래밍한다.**

---

### 1단계에서 부족했던 점들

1. 클래스 분리
  1. 클래스마다 고유의 역할에 대한 고민이 필요해보임
  2. ex) Ladder Class라면 ‘사다리’에 관한 내용만,
     특히나 Input,Output의 경우 클래스의 역할에 맞지 않았다.
2. 메서드 분리
  1. 메서드 분리와 같은 리팩토링을 해야할 것들을 미래의 일로 치부하고 돌아가는 코드로만 작성하다보니 depth가 3이상이 되는 코드가 발생하였다.
  2. 메서드 분리를 고민해야겠다.

---

### 궁금한점

- Step2부터는 else 사용을 지양하라고 한다.
  - 문제는 Else를 사용하지 않으면 내가 원하는 대로 출력물이 찍히지 않는다 이유는 무엇이지?
  - → if(){~ return;} 으로 해결!