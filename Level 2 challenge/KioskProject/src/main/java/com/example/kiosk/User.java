package com.example.kiosk;

public enum User {
    // Enum을 이용해 사용자의 할인율을 관리함.
    SOLDIER("군인 : 10%"){
        @Override
        public double discount() {
            System.out.println("군인 할인율을 적용합니다.");
            return 0.1;
        }
    },
    EMPLOYEE("직원 : 7%"){
        @Override
        public double discount() {
            System.out.println("직원 할인율을 적용합니다.");
            return 0.07;
        }
    },
    STUDENT("학생 : 3%"){
        @Override
        public double discount() {
            System.out.println("학생 할인율을 적용합니다.");
            return 0.03;
        }
    },
    General("일반 : 0%") {
        @Override
        public double discount() {
            System.out.println("일반인은 할인율이 없습니다.");
            return 1;
        }
    };

    public abstract double discount();
    final String user;

    User(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
