# 📌 키오스크 과제 📌

### Java의 클래스를 이해하고, 객체지향 프로그래밍 기법을 활용한 키오스크 프로그램 구현  ( 필수, 도전단계 구분 )
CLI(명령형 인터페이스)로 키오스크가 수행되게 진행했으며, 사용자가 콘솔에 메뉴판에 저장되어 있는 메뉴에 알맞은 번호를 입력해 결과 값을 반환하는 키오스크 프로그램 입니다.
#### 기간 : 2025.3.7 ~ 3.14 (14:00)
#### 개발 인원 : 1명 ( 개인 )


## 필수 ⭐
### Lv 1. 기본적인 키오스크를 프로그래밍

<a href="https://dimenshun.tistory.com/31">트러블 슈팅 1~2단계 TIL</a>

- [ ]  **요구사항이 가지는 의도**
    - [ ]  실행시 햄버거 메뉴가 표시되고, 이후 Scanner로 숫자를 입력받아서 메뉴를 선택할 수 있다.
    - [ ]  `Scanner` 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화
- [ ]  **햄버거 메뉴 출력 및 선택하기**
    - [ ]  `Scanner`를 사용하여 여러 햄버거 메뉴를 출력
    - [ ]  제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성
    - [ ]  반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료

### Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리

- [ ]  **요구사항이 가지는 의도**
    - [ ]  객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
    - [ ]  햄버거 메뉴를 `MenuItem` 클래스와 `List`를 통해 관리합니다.
- [ ]  **`MenuItem` 클래스 생성하기**
    - [ ]  설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    - [ ]  클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
- [ ]  `main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
    - [ ]  `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
        - [ ]  키워드: `new`
    - [ ]  `List`를 선언하여 여러 `MenuItem`을 추가합니다.
        - [ ]  `List<MenuItem> menuItems = new ArrayList<>();`
    - [ ]  반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근합니다.

### Lv 3. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기

<a href="https://dimenshun.tistory.com/35">트러블 슈팅 3~4단계 TIL</a>

- [ ]  **요구사항이 가지는 의도**
    - [ ]  객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
    - [ ]  `main` 함수에서 관리하던 전체 순서 제어를 `Kiosk` 클래스를 통해 관리합니다.
- [ ]  **`Kiosk` 클래스 생성하기**
    - [ ]  **설명**: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
    - [ ]  `MenuItem`을 관리하는 리스트가 필드로 존재합니다.
    - [ ]  `main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.
    - [ ]  `List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
        - [ ]  `Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.
- [ ]  요구사항에 부합하는지 검토
    - [ ]  키오스크 프로그램을 시작하는 메서드가 구현되어야 합니다.
        - [ ]  콘솔에 햄버거 메뉴를 출력합니다.
        - [ ]  사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료합니다.
        - [ ]  유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
        - [ ]  `0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.

### Lv 4. 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기

- [ ]  **`Menu` 클래스 생성하기**
    - [ ]  설명 : MenuItem 클래스를 관리하는 클래스입니다. 
    예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함합니다.
    - [ ]  `List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.
    - [ ]  여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 갖습니다.
    - [ ]  메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 합니다.

### Lv 5. 캡슐화 적용하기

<a href="https://dimenshun.tistory.com/38">트러블 슈팅 5단계 TIL</a>

- [ ]  `MenuItem`, `Menu` 그리고 `Kiosk` 클래스의 필드에 직접 접근하지 못하도록 설정합니다.
- [ ]  Getter와 Setter 메서드를 사용해 데이터를 관리합니다.

## 도전 🔥

### Lv 1. 장바구니 및 구매하기 기능을 추가하기

<a href="https://dimenshun.tistory.com/41">트러블 슈팅 도전 1단계 TIL</a>

- [ ]  **장바구니 생성 및 관리 기능**
    - [ ]  사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능을 제공합니다.
    - [ ]  장바구니는 메뉴명, 수량, 가격 정보를 저장하며, 항목을 동적으로 추가 및 조회할 수 있어야 합니다.
    - [ ]  사용자가 잘못된 선택을 했을 경우 예외를 처리합니다(예: 유효하지 않은 메뉴 번호 입력)
    - [ ]  + ( 장바구니에 담겨진 물품이 없으면 OrderMenu가 출력안되게 함 )
- [ ]  **장바구니 출력 및 금액 계산**
    - [ ]  사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액을 출력합니다.
    - [ ]  출력 예시
        - [ ]  각 메뉴의 이름, 가격, 수량
        - [ ]  총 금액 합계
- [ ]  **장바구니 담기 기능**
    - [ ]  메뉴를 클릭하면 장바구니에 추가할 지 물어보고, 입력값에 따라 “추가”, “취소” 처리합니다.
        - [ ]  메뉴는 한 번에 1개만 담을 수 있습니다. ( x )  -> 메뉴가 중복되지 않은 요구사항 조건 x ( 같은메뉴를 2개 3개 먹을수도 있음 )
    - [ ]  장바구니에 담은 목록을 출력합니다.
- [ ]  **주문 기능**
    - [ ]  장바구니에 담긴 모든 항목을 출력합니다.
    - [ ]  합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니를 초기화합니다.

### Lv 2. Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리

<a href="https://dimenshun.tistory.com/44">트러블 슈팅 도전 2단계 TIL</a>

- [ ]  **Enum을 활용한 사용자 유형별 할인율 관리하기**
    - [ ]  사용자 유형의 Enum 정의 및 각 사용자 유형에 따른 할인율 적용
        - [ ]  예시 : 군인, 학생, 일반인
    - [ ]  주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산
- [ ]  **람다 & 스트림을 활용한 장바구니 조회 기능**
    - [ ]  기존에 생성한 Menu의 MenuItem을 조회 할 때 스트림을 사용하여 출력하도록 수정
    - [ ]  기존 장바구니에서 특정 메뉴 빼기 기능을 통한 스트림 활용
        - [ ]  예시 : 장바구니에 SmokeShack 가 들어 있다면, stream.filter를 활용하여 특정 메뉴 이름을 가진 메뉴 장바구니에서 제거
         
## 📝 개선 사항


- ### 프로젝트 관리
    - #### 프로젝트별 폴더를 관리함. → 개인과제 이기때문에 상관없지만, 앞으로 팀 프로젝트때 프로젝트는 하나로 하여 Lv은 패키지별로 할것
    - #### 커밋 컨벤션을 지키면서 커밋을 할 것 ( 팀 프로젝트시 팀 규칙에 맞게 커밋 컨벤션 작성후 커밋해야함. )

