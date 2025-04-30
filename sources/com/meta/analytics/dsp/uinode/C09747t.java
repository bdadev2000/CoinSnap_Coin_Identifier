package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09747t {
    public static Pattern A04;
    public static byte[] A05;
    public static String[] A06 = {"pAae9rjDjut", "tkOSIHX8Zxgz2rZYxn8viKSgU7ZUgPoL", "1N", "2VeddHnoq1PdFvEHeLIEgk846BKmCK6O", "LTbK", "Z0pa1Fkg3kxxdvs7wsAZFUzX7FqiKd0T", "C5WWkuKXZZ", "LwQP7"};
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-93, Ascii.SO, -14, -68, 10, -60, -68, -5, -60, -68, -5, -12, -28, -82, -4, -26, -43, -44, -95, -44, -41, -90, -43, -42, -42, -92, -94, -95, -72, -77, -90, -95, -43, -35, -92, -94, -90, -95, -43, -35, -92, -94, -94, -72, -42, -20};
    }

    static {
        A04();
    }

    public C09747t(Set<String> options, Integer num, Integer num2, String str) {
        this.A03 = options;
        options.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }

    public C09747t(String[] strArr, Integer num, Integer num2) {
        strArr = strArr == null ? new String[0] : strArr;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A03 = linkedHashSet;
        linkedHashSet.addAll(Arrays.asList(strArr));
        linkedHashSet.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = A01();
    }

    public static C09747t A00(String str) {
        if (str == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer num = null;
        Integer num2 = null;
        Matcher matcher = A03().matcher(str);
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            if (group != null && group2 != null) {
                num = Integer.valueOf(Integer.parseInt(group));
                num2 = Integer.valueOf(Integer.parseInt(group2));
            }
        }
        return new C09747t(linkedHashSet, num, num2, str);
    }

    private String A01() {
        String A02;
        StringBuilder sb = new StringBuilder();
        for (String str : this.A03) {
            Locale locale = Locale.US;
            if (this.A00 != null && this.A01 != null) {
                A02 = A02(2, 10, 50);
            } else {
                if (A06[0].length() != 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[3] = "stwUo5SqMlMCevvnzS9Ivu5YLcfkOLDd";
                strArr[5] = "Jjxe8gs2e3QRovgCJLhIxlujBEulNGa6";
                A02 = A02(12, 4, 36);
            }
            sb.append(String.format(locale, A02, str.toUpperCase(), this.A00, this.A01));
        }
        return sb.toString();
    }

    public static Pattern A03() {
        if (A04 == null) {
            String[] strArr = A06;
            if (strArr[7].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[4] = "NLwo";
            strArr2[6] = "S7Le7uzzm1";
            A04 = Pattern.compile(A02(16, 29, 20));
        }
        return A04;
    }

    public final Integer A05() {
        return this.A00;
    }

    public final Integer A06() {
        return this.A01;
    }

    public final String A07() {
        return this.A02;
    }

    public final String A08() {
        Iterator<String> it = this.A03.iterator();
        StringBuilder append = new StringBuilder().append(A02(1, 1, 78));
        while (it.hasNext()) {
            String next = it.next();
            if (A06[0].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "k7iHL";
            strArr[2] = "M5";
            append.append(next);
            if (it.hasNext()) {
                String[] strArr2 = A06;
                if (strArr2[3].charAt(13) != strArr2[5].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A06;
                strArr3[7] = "AO7Nq";
                strArr3[2] = "hv";
                append.append(A02(0, 1, 18));
            }
        }
        append.append(A02(45, 1, 42));
        return append.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C09747t)) {
            return false;
        }
        C09747t c09747t = (C09747t) obj;
        Integer num = this.A00;
        String[] strArr = A06;
        if (strArr[3].charAt(13) != strArr[5].charAt(13)) {
            throw new RuntimeException();
        }
        A06[0] = "YHhc40Na8nm";
        Integer num2 = c09747t.A00;
        if (num != num2 && (num == null || !num.equals(num2))) {
            return false;
        }
        Integer num3 = this.A01;
        Integer num4 = c09747t.A01;
        return (num3 == num4 || (num3 != null && num3.equals(num4))) && this.A03.equals(c09747t.A03);
    }

    public final int hashCode() {
        int hashCode = this.A03.hashCode() * 131;
        Integer num = this.A00;
        int intValue = hashCode + ((num == null ? -1 : num.intValue()) * 137);
        Integer num2 = this.A01;
        return intValue + ((num2 != null ? num2.intValue() : -1) * 139);
    }
}
