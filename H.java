class H {
  int s15;
  int s2;
  int s12;
  int s9;
  int s8;
  long s14;
  long s19;
  long s27;
  int[] s1 = {3, -1, -3, 0};
  int[] s21 = {-3, -2, -3, -3};
  int[] s7 = {0, 3, -3, 2, 1};
  static int s40;
  static int s6;
  static int s13;
  static int s11;
  static int s16;
  public H() {
    s15 = 6;
    s2 = 6;
    s12 = 2;
    s9 = 8;
    s8 = 2;
    s14 = 4L;
    s19 = 2L;
    s27 = 3L;
  }
  public void s31() {
    System.out.println("метод s31 в классе H");
    System.out.println(--s2);
  }
  public void s35() {
    System.out.println("метод s35 в классе H");
    System.out.println(s12 + 5);
  }
  public void s25() {
    System.out.println("метод s25 в классе H");
    System.out.println(s15 + 2);
  }
  public void s17() {
    System.out.println("метод s17 в классе H");
    System.out.println(s2 << 1);
  }
  public void s36() {
    System.out.println("метод s36 в классе H");
    System.out.println(++s9);
  }
  public void s5() {
    System.out.println("метод s5 в классе H");
    System.out.println(s13++);
  }
  public static void s39() {
    System.out.println("метод s39 в классе H");
    System.out.println(s11);
  }
  public static void s26() {
    System.out.println("метод s26 в классе H");
    System.out.println((s11 - 1));
  }
  public static void s32() {
    System.out.println("метод s32 в классе H");
    System.out.println(s16);
  }
  public static void s20() {
    System.out.println("метод s20 в классе H");
    System.out.println((s16 - 1));
  }
  public void s22(H r) {
    r.s31();
  }
  public void s22(C r) {
    r.s35();
  }
}
