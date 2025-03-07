# 📌 키오스크 과제 ( Sparta 6기 ) 📌

### Java의 클래스를 이해하고, 객체지향 프로그래밍 기법을 활용한 키오스크 프로그램 구현  ( 필수, 도전단계 구분 )
CLI(명령형 인터페이스)로 키오스크가 수행되게 진행했으며, 사용자가 콘솔에 메뉴판에 저장되어 있는 메뉴에 알맞은 번호를 입력해 결과 값을 반환하는 키오스크 프로그램 입니다.
#### 기간 : 2025.3.7 ~ 3.14 (14:00)
#### 개발 인원 : 1명 ( 개인 )


## 필수
### Lv 1. 기본적인 키오스크를 프로그래밍

<a href="#">트러블 슈팅 1~2단계 TIL</a>

- [ ]  **요구사항이 가지는 의도**
    - [ ]  입력 처리와 간단한 흐름 제어를 복습합니다. (프로그래밍 검증**)**
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


## 도전
