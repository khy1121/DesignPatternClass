package week4;


class X {
    public static void main(String[] args) {
       Y y = new Y();
       y.m1(1,1);
    }
}

class Y {
    public void m1(int a,int b) {
        Z o = new Z();
        if (a==b) {
            if (o.m2() == 1) {
                System.out.println("응답");
            }
        }
    }
}

class Z {
    W w;

    public Z() {
        this.w = new W(); // W 객체 생성
    }

    public int m2() {
        if (w != null) {
            w.destroy();
            w = null;
        }
        return 1;
    }
}

class W {
    public void destroy() {
        System.out.println("W 객체가 정리(destroy)되었습니다.");
    }
}



