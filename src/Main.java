public class Main {
    // string dönüşümü
    // reference value tiplerin ilk harfi büyük
    // reference value kendine ait metodları var
    // primitive tiplerin sadece değerleri var, default değerleri var.
    // reference value başlangıç değeri null, primitive tip default değerleri var.
    // void varsa return etmez.


    public static void main(String[] args) {


        System.out.println(isPalindrom(-1221));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        //System.out.println(numberToWords(-12));


    }

    public static boolean isPalindrom(int number) {
        // absolute number
        number = Math.abs(number);
        // number to string
        String stringValue = String.valueOf(number);
        // string to charArray
        char[] basamaklar = stringValue.toCharArray();
        //reverse loop to get reverse String
        String reversedValue = "";
        for (int i = basamaklar.length - 1; i >= 0; i--) {
            reversedValue += basamaklar[i];

        }
        // string.equals(reverse)
        return stringValue.equals(reversedValue);
    }

    public static boolean isPerfectNumber(int number) {
        //guarding
        if (number < 0) {
            return false;
        }
        // total başlangıç değeri 0 olarak tanımlanır.
        int total = 0;
        // 1 den sayıya kadar döngü yapılır.
        for (int i = 1; i <= number / 2; i++) {
            // her sayı bizim sayımıza bölünür, bölünce kalan 0 mı?
            if (number % i == 0) {
                // 0 kalanı verenler totalde toplanır.
                total += i;
            }


        }


        // total number a eşit midir?
        return total == number;
    }

    public static String numberToWords(int sayi) {
        // number to String
        String strSayi = String.valueOf(sayi);
        // string i charArrayine dönüştür.
        char[] charsStrSayi = strSayi.toCharArray();
        // rakamlar arrayi tanımla
        String[] rakamlar = {"zero ", "one ", "two", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        //sonuc string oluştur.
        String sonuc = "";
        // loop yap
        for (char charStrSayi : charsStrSayi) {
            System.out.println(charStrSayi);
            //rakama karşılık gelen texti sonuca ekle.
            sonuc += rakamlar[Integer.parseInt(String.valueOf(charStrSayi))];

        }
        return sonuc.trim();

        // return sonuc


    }
}