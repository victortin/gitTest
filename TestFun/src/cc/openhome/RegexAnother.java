package cc.openhome;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
public class RegexAnother {

	 

    public static void main(String[] args) {

 

        // 測試 testString 中是否包含了 aa

        String testString = "ABCaaabcaac";

        System.out.println("String.contains():\t"+testString.contains("aa"));

 

        // 和上面目的相同，但運用了 regular expression

        // 而這其實是利用了 Pattern 的靜態方法matches()

        System.out.println("String.matches():\t"+testString.matches(".*aa.*"));

        System.out.println("Pattern.matches():\t"+Pattern.matches(".*aa.*",testString));

        System.out.println();

 

        // 如果要用相同的 regular expression 測試很多資料

        // 可以使用Pattern的靜態方法compile()來編譯

        // 之後就可以重覆使用這個pattern的matcher()方法來進行字串比對

        String testString2 = "aababcAc";

        Pattern pattern = Pattern.compile(".*aa.*");

        Matcher matcher = pattern.matcher(testString);

        System.out.println("matcher.matches():\t"+matcher.matches());

        matcher = pattern.matcher(testString2);

        System.out.println("matcher.matches():\t"+matcher.matches());

        System.out.println();

 

        // 另外Matcher中還有很多方法可以使用

        // 除了用 matcher.matches()可以比對字串是不是符合regular expression

        // 也可以利用 matcher.lookingAt()比對字串是不是某個regular expression開頭

        pattern = Pattern.compile("aa");

        matcher = pattern.matcher(testString);

        System.out.println("lookingAt matcher.matches():\t"+matcher.lookingAt());

        matcher = pattern.matcher(testString2);

        System.out.println("lookingAt matcher.matches():\t"+matcher.lookingAt());

        System.out.println();

 

        // 想取出字串中符合的區段則可以運用 matcher

        // 例如想從下面四個號碼找出手機的格式

        // 就可以用 matcher.find()及matcher.group()來取出符合的項目

        String testString3 = "0911-111111, 02-22222222, 0922-222222, 03-33333333";

        pattern = Pattern.compile("\\d{4}-\\d{6}");

        matcher = pattern.matcher(testString3);
        System.out.println(matcher.matches());
        //System.out.println( pattern.matcher(testString3));
        while (matcher.find()) {

            System.out.println("matcher.group():\t"+matcher.group());
            //System.out.println("matcher.find():\t"+matcher.find());

        }

    }

}
