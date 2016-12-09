/**
 * Created by e165723 on 2016/12/07.
 */
public class main {
    public static void main(String[] args) {
        try {
            String str;
            int len;
            str = "3. 14";
            double value = Double.parseDouble(str);
            len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
            return;
        }
    }
}