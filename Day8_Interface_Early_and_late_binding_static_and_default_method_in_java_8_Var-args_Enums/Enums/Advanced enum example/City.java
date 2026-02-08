public enum City {
    DELHI {
        public void message() {
            System.out.println("welcome user..");
            System.out.println("you are in capital");
        }
    },
    MUMBAI,
    CHENNAI("50 towers"),
    KOLKATA;

    public String numberofTowers;

    City() {
        this.numberofTowers = "100 towers";
    }

    City(String numberofTowers) {
        this.numberofTowers = numberofTowers;
    }

    public void message() {
        System.out.println("welcome user..");
    }
}
