package N5;

import J1.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2098a = new Object();

    public static String a(String str, String str2) {
        Pattern pattern = b.f2099a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        R2.b.d(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i9 = 0;
        while (i9 < length) {
            int indexOf = str2.indexOf("<!--", i9);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i9 = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i9 = length;
        }
        int[][] iArr = (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        if (b.b(str2, sb, b.b, str3, iArr) || b.a(str2, sb, b.f2099a, str3, iArr) || b.b(str2, sb, b.f2101d, str3, iArr) || b.a(str2, sb, b.f2100c, str3, iArr) || b.b(str2, sb, b.f2103f, str3, iArr) || b.a(str2, sb, b.f2102e, str3, iArr) || b.a(str2, sb, b.f2104g, str3, iArr)) {
            return sb.toString();
        }
        return str3.concat(str2);
    }
}
