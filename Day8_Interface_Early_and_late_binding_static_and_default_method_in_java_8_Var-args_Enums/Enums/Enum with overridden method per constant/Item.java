public enum Item {
    SUGER,
    RICE {
        public void info() {
            System.out.println("This is Rice");
        }
    },
    SALT;

    public void info() {
        System.out.println("This is grocery item");
    }
}
