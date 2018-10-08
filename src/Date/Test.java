package Date;

import java.time.LocalDate;
import java.time.Month;

/**
 * @Title: Test
 * @Description:  Java 8使用了JSR 310规范，新增了java.time包。
 * 在Java 8版之前，如果我们想格式化日期，必须使用SimpleDateFormat类，用它格式化输入的日期类。
 * 而Java 8引入了以下的新日期时间类：
 *  LocalTime
 *  LocalDate
 *  LocalDateTime
 *  OffsetDate
 *  OffsetTime
 *  OffsetDateTime
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 12:10
 */
public class Test {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate twentyDecember2015 = LocalDate.of(2015, Month.DECEMBER, 20);
        System.out.println(twentyDecember2015);

        LocalDate firstDec2018 = LocalDate.of(2018, 12, 1);
        System.out.println(firstDec2018);
    }
}
