class StackOverflow {
    public static void test(int i) {
        if (i == 0)
            return;
        else
            test(i++);
    }
}
