package jd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Pattern a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f20013b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f20014c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f20015d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f20016e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f20017f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f20018g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        boolean z10;
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }

    public static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        boolean z10;
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }
}
