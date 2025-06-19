package week5;

public class MyBigInteger {
    private String value;

    public MyBigInteger(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public MyBigInteger add(MyBigInteger number) {
        return new MyBigInteger(addTwoNumbers(this.getValue(), number.getValue()));
    }
    
    public String addTwoNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int max = Math.max(num1.length(), num2.length());
        num1 = String.format("%" + max + "s", num1).replace(' ', '0');
        num2 = String.format("%" + max + "s", num2).replace(' ', '0');
        int reminder = 0;
        for (int i = max - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            int sum = digit1 + digit2 + reminder;
            reminder = sum / 10;
            result.append(sum%10);
        }
        if (reminder > 0) {
            result.append(reminder);
        }
        return result.reverse().toString();
    }

    public MyBigInteger multiply(MyBigInteger number) {
        return new MyBigInteger(multiplyTwoNumbers(this.getValue(), number.getValue()));
    }

    public String multiplyTwoNumbers(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String result = "0";
        int l1 = num1.length();
        int l2 = num2.length();

        for (int i = l1 -1 ; i >= 0; i--) {
            StringBuilder temp = new StringBuilder();

            int reminder = 0;
            for (int j = l2 -1 ; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2 + reminder;
                reminder = product/10;
                temp.append(product%10);
            }
            if (reminder > 0) {
                temp.append(reminder);
            }
            temp.reverse();
            for (int k = 0; k < l1 - 1 - i; k++) {
                temp.append('0');
            }
            result = addTwoNumbers(result, temp.toString());
        }
        return result;
    }
}
