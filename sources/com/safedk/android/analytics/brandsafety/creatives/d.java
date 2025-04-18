package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29512a = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29513b = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29514c = "ParserBase";

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4, boolean r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L3a
            java.lang.String r0 = com.safedk.android.utils.k.k(r4)     // Catch: java.lang.Throwable -> L21
        L7:
            java.util.regex.Pattern r1 = com.safedk.android.utils.f.w()
            r2 = 1
            java.util.List r0 = a(r1, r0, r2, r3)
            int r1 = r0.size()
            if (r1 <= 0) goto L3c
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
        L1c:
            java.lang.String r0 = r0.trim()
            return r0
        L21:
            r0 = move-exception
            java.lang.String r0 = "ParserBase"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CDATA info decode failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.safedk.android.utils.Logger.d(r0, r1)
        L3a:
            r0 = r4
            goto L7
        L3c:
            r0 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.d.a(java.lang.String, boolean):java.lang.String");
    }

    public static List<String> a(Pattern pattern, String str, int i2, boolean z2) {
        String group;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (i2 >= 0) {
                group = matcher.group(i2);
            } else {
                group = matcher.group();
            }
            if (group != null) {
                if (z2) {
                    arrayList.add(k.k(group.trim()));
                } else {
                    arrayList.add(group.trim());
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str, int i2, int i3, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(i2);
            String group2 = matcher.group(i3);
            if (group != null) {
                if (z2) {
                    arrayList.add(k.k(group.trim()));
                } else {
                    arrayList.add(group.trim());
                }
            }
            if (group2 != null) {
                if (z2) {
                    arrayList.add(k.k(group2.trim()));
                } else {
                    arrayList.add(group2.trim());
                }
            }
        }
        return arrayList;
    }
}
