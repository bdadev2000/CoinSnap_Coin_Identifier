package com.iab.omid.library.bytedance2;

import com.iab.omid.library.bytedance2.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f14504a = Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final Pattern b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f14505c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f14506d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f14507e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f14508f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f14509g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] a6 = a(str);
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 16);
        if (!b(str, sb, b, str2, a6) && !a(str, sb, f14504a, str2, a6) && !b(str, sb, f14506d, str2, a6) && !a(str, sb, f14505c, str2, a6) && !b(str, sb, f14508f, str2, a6) && !a(str, sb, f14507e, str2, a6) && !a(str, sb, f14509g, str2, a6)) {
            return str2.concat(str);
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, AbstractC2914a.e("<script type=\"text/javascript\">", str, "</script>"));
    }

    private static boolean a(int i9, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i9 >= iArr2[0] && i9 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i9 = 0;
        while (matcher.find(i9)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i9 = end;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int indexOf = str.indexOf("<!--", i9);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i9 = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i9 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i9 = 0;
        while (matcher.find(i9)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i9 = end;
        }
        return false;
    }
}
