package week1;

public class ChangeBaseNumberSystem {

    private String value;

    public ChangeBaseNumberSystem() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int changeCharToDigit(char ch) {
        if (Character.isDigit(ch)) {
            return ch - '0';
        }
        return Character.toUpperCase(ch) - 'A' + 10;
    }

    public void convertToDec(int inputBase) {
        long temp = 0;
        for (int i = 0; i < value.length(); i++) {
            temp += changeCharToDigit(value.charAt(i)) * (long)Math.pow(inputBase, value.length() - 1 - i);
        }
        setValue(String.valueOf(temp));
    }

    public void convertFromDec(int outputBase) {
        long temp = Long.parseLong(value);
        if (temp == 0) {
            setValue("0");
            return;
        }

        StringBuilder str = new StringBuilder();
        while (temp != 0) {
            long mod = temp % outputBase;
            char ch = (mod < 10) ? (char) (mod + '0') : (char) (mod + 'A' - 10);
            str.append(ch);
            temp = temp / outputBase;
        }
        setValue(str.reverse().toString());
    }

    public void convertBinToHex() {
        convertToDec(2);
        convertFromDec(16);
    }

    public void convertHexToBin() {
        convertToDec(16);
        convertFromDec(2);
    }
}
