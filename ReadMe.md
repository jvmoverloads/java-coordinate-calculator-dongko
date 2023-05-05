# 차량에 따른 연료 주입 실습

## 기능 요구사항

우리 회사는 렌터카를 운영하고 있다. 현재 보유하고 있는 차량은 Sonata 2대, Avante 1대, K5 2대로 총 5대의 차량을 보유하고 있다.
우리 회사는 고객이 인터넷으로부터 예약할 때 여행할 목적지의 대략적인 이동거리를 입력 받는다. 이 이동거리를 활용해 차량 별로 필요한 연료를 주입한다.

차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 생성해야 한다.

## 프로그래밍 요구사항 - 1단계

상속과 추상 메소드를 활용한다.
위 요구사항을 if/else 절을 쓰지 않고 구현해야 한다.

## 프로그래밍 요구사항 - 2단계

인터페이스를 적용해 구현한다.

# 좌표계산기(선 길이)

## 기능 요구사항

사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
X, Y좌표 모두 최대 24까지만 입력할 수 있다.
입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
직선인 경우는 두 점 사이 거리를 계산해서 출력한다.

## 도메인
- Points
- Point
- Polygon (추상 클래스)
    - Straight
    - Triangle
    - Square
- Calculatable (인터페이스)
    - StraightCalculation
    - TriangleCalculation
    - SquareCalculation
- PolygonFactory
- CalculationFactory
- CoordinatePrinter

1. 사용자의 입력을 받아서 Points를 만든다
2. CalculationFactory한테 Points를 던져서 구체적인 Calculation을 받는다
3. PolygonFactory한테 Points를 던져서 구체적인 Polygon Type을 받는다
4. Polygon 2에서 받은 계산 전략을 주입한다.
5. Polygon.calculate() 라는 abstract method를 실행해서 값을 구한다.
6. CoordinatePrinter에 Polygon을 보내서 그린다.  