public class FizzBuz {

    // Phương thức chuyển đổi số thành chuỗi "Fizz", "Buzz" hoặc số ban đầu
    public String translate(int number) {
        // Kiểm tra nếu số chứa chữ số 3 hoặc 5
        if (containsDigit(number, 3)) {
            return "Fizz";
        } else if (containsDigit(number, 5)) {
            return "Buzz";
        }

        // Kiểm tra chia hết cho 3, 5, hoặc cả hai
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        // Nếu không chia hết, trả về số ban đầu
        return Integer.toString(number);
    }

    // Phương thức kiểm tra nếu số chứa chữ số nào đó
    private boolean containsDigit(int number, int digit) {
        String numStr = Integer.toString(number);
        return numStr.contains(Integer.toString(digit));
    }

    // Phương thức chuyển đổi số thành chữ viết (chỉ hỗ trợ số nhỏ hơn 100)
    public String numberToWords(int number) {
        if (number < 0 || number >= 100) {
            throw new IllegalArgumentException("Số phải nằm trong khoảng từ 0 đến 99");
        }

        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (number < 10) {
            return ones[number];
        } else if (number < 20) {
            return "mười " + ones[number % 10];
        } else {
            int tenPart = number / 10;
            int onePart = number % 10;
            if (onePart == 0) {
                return tens[tenPart];
            } else {
                return tens[tenPart] + " " + ones[onePart];
            }
        }
    }
}
