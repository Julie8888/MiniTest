import java.util.*;

/**
 * @Auther: julie
 * @Date: 2020/9/6 12:52
 * @Description: mini-coding test
 */
public class MiniTest {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        //创建二维字符数组，第一组下标即表示数字，数字与字母可以得到对应关系
        char[][] list = {{}, {}, {'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};

        Scanner sc = new Scanner(System.in);
        while (true) {
            //控制台输入0~99数字
            System.out.println("Please enter an integer from 0 to 99:");
            System.out.println("Input:");
            int x = sc.nextInt();

            if (x < 0 || x > 99) {
                continue;
            }
            if (x == 0 || x == 1 || x == 10 || x == 11) {
                System.out.println("Output:");
                continue;
            }

            //小于10，只有一位数字
            if (x < 10) {
                int length = 3;
                if (x == 7 || x == 9) {
                    length = 4;
                }
                System.out.print("Output:");
                for (int i = 0; i < length; i++) {
                    System.out.print(list[x][i]+" ");
                }


            } else {
                //大于10，有两位数字
                //提取十位数
                int n = x / 10;
                //提取个位数
                int m = x % 10;
                //十位数长度
                int nlength = 3;
                //个位数长度
                int mlength = 3;
                if (n == 7 || n == 9 ) {
                    nlength = 4;
                }
                if(m == 7 || m == 9){
                    mlength=4;
                }
                if (n == 0 || n == 1) {
                    System.out.print("Output:");
                    for (int j = 0; j < mlength; j++) {
                        System.out.print(list[m][j] + " ");
                    }
                }else if (m == 0 || m == 1) {
                    System.out.print("Output:");
                    for (int i = 0; i < nlength; i++) {
                        System.out.print(list[n][i] + " ");
                    }
                }else{
                    System.out.print("Output:");
                    for (int i = 0; i < nlength; i++) {
                        for (int j = 0; j < mlength; j++) {
                            System.out.print(list[n][i] + "" + list[m][j] + " ");
                        }

                    }
                }
            }
            System.out.println();
        }
    }




}