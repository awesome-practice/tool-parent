package com.practice.tool.io.print;

import java.util.Formatter;

/**
 * format javadoc: {@link Formatter}
 *
 * @author Luo Bao Ding
 * @since 2018/10/26
 */
public class TableViewPrintDemo {

    public void test() {
        final Object[][] table = new String[4][];
        table[0] = new String[]{"foo", "bar", "baz"};
        table[1] = new String[]{"barxxxxxxxxxxx2", "foo2", "baz2"};
        table[2] = new String[]{"baz3", "bar3", "foo3"};
        table[3] = new String[]{"foo4", "bar4", "baz4"};

        for (final Object[] row : table) {
            String line = String.format("%-32s%-15s%-15s", row);
            System.out.println(line);
//            System.out.format("%15s%15s%15s\n", row);

        }
        System.out.println("============");
        String line;
        line = String.format("%-32s%-15s%-15s", "xx", 1, 2L);
        System.out.println(line);

        System.out.println("============");
        line = String.format("%-32s%-15d%-15f%-15.2f", "xx", 3L, 123.1234, 123.1234);
        System.out.println(line);
    }

    public static void main(String[] args) {
        new TableViewPrintDemo().test();
    }

}
