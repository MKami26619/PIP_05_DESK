class Main {

    public static void main(String[] args) {
        int rows = 6, coef = 1;
        System.out.println("!!! JEBAC TO !!!");

        for(int i = 0; i < rows; i++) {
            for(int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 3) / j;

                System.out.printf("!JEBAC!", coef);
            }

            System.out.println();
        }
    }
}