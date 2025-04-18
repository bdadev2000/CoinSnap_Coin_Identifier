package org.jacoco.core.runtime;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class CommandLineSupport {
    private static final char BLANK = ' ';
    private static final int M_ESCAPED = 2;
    private static final int M_PARSE_ARGUMENT = 1;
    private static final int M_STRIP_WHITESPACE = 0;
    private static final char QUOTE = '\"';
    private static final char SLASH = '\\';

    private CommandLineSupport() {
    }

    private static void addArgument(List<String> list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    public static String quote(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            if (c2 == '\"' || c2 == '\\') {
                sb.append(SLASH);
            }
            sb.append(c2);
        }
        if (str.indexOf(32) != -1 || str.indexOf(34) != -1) {
            sb.insert(0, QUOTE).append(QUOTE);
        }
        return sb.toString();
    }

    public static List<String> split(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char c2 = ' ';
        char c3 = 0;
        for (char c4 : str.toCharArray()) {
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 == 2) {
                        if (c4 == '\"' || c4 == '\\') {
                            sb.setCharAt(sb.length() - 1, c4);
                        } else if (c4 == c2) {
                            addArgument(arrayList, sb);
                        } else {
                            sb.append(c4);
                        }
                        c3 = 1;
                    }
                } else if (c4 == c2) {
                    addArgument(arrayList, sb);
                    c3 = 0;
                } else if (c4 == '\\') {
                    sb.append(SLASH);
                    c3 = 2;
                } else {
                    sb.append(c4);
                }
            } else if (!Character.isWhitespace(c4)) {
                if (c4 == '\"') {
                    c2 = '\"';
                } else {
                    sb.append(c4);
                    c2 = ' ';
                }
                c3 = 1;
            }
        }
        addArgument(arrayList, sb);
        return arrayList;
    }

    public static String quote(List<String> list) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (String str : list) {
            if (z2) {
                sb.append(BLANK);
            }
            sb.append(quote(str));
            z2 = true;
        }
        return sb.toString();
    }
}
