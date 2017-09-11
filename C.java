class C extends H {
  public C() {
    s2 = 6;
    s12 = 1;
    s14 = 5L;
    s19 = 3L;
  }
  public void s35() {
    System.out.println("метод s35 в классе C");
    System.out.println(s8);
  }
  public void s17() {
    System.out.println("метод s17 в классе C");
    System.out.println(s15 >> 1);
  }
  public void s5() {
    System.out.println("метод s5 в классе C");
    System.out.println(--s2);
  }
  public static void s39() {
    System.out.println("метод s39 в классе C");
    System.out.println((s40 + 4));
  }
  public static void s26() {
    System.out.println("метод s26 в классе C");
    System.out.println(s40--);
  }
  public static void s32() {
    System.out.println("метод s32 в классе C");
    System.out.println(s6);
  }
  public static void s20() {
    System.out.println("метод s20 в классе C");
    System.out.println((s6 + 5));
  }
  public void s22(H r) {
    r.s25();
  }
  public void s22(C r) {
    r.s17();
  }
}
