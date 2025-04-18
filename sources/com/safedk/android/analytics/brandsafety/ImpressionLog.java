package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class ImpressionLog implements Serializable {
    public static final String A = "fgr";
    public static final String B = "vst";
    public static final String C = "adr";
    public static final String D = "url";
    public static final String E = "cuo";
    public static final String F = "typ";
    public static final String G = "vad";
    public static final String H = "mth";
    public static final String I = "ntw";
    public static final String J = "api";
    public static final String K = "org";
    public static final String L = "dec";
    public static final String M = "cnt";
    public static final String N = "can";
    public static final String O = "fin";
    public static final String P = "||";
    public static final String Q = "|";
    public static final String R = "=";
    public static final String S = "[...]";
    private static final String T = "ImpressionLog";
    private static final int U = 60;

    /* renamed from: a, reason: collision with root package name */
    public static final String f29251a = "pre";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29252b = "pr2";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29253c = "prd";
    public static final String d = "mwl";
    public static final String e = "mdl";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29254f = "mwd";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29255g = "mdd";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29256h = "mck";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29257i = "mdh";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29258j = "mfd";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29259k = "mrv";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29260l = "add";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29261m = "cim";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29262n = "clk";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29263o = "vib";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29264p = "vie";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29265q = "ppl";

    /* renamed from: r, reason: collision with root package name */
    public static final String f29266r = "lad";

    /* renamed from: s, reason: collision with root package name */
    public static final String f29267s = "lar";
    private static final long serialVersionUID = -1926507337766691667L;

    /* renamed from: t, reason: collision with root package name */
    public static final String f29268t = "img";

    /* renamed from: u, reason: collision with root package name */
    public static final String f29269u = "jsm";

    /* renamed from: v, reason: collision with root package name */
    public static final String f29270v = "wnr";
    public static final String w = "int";
    public static final String x = "rid";

    /* renamed from: y, reason: collision with root package name */
    public static final String f29271y = "exp";

    /* renamed from: z, reason: collision with root package name */
    public static final String f29272z = "bgr";
    private long V = Long.MAX_VALUE;
    private long W = Long.MAX_VALUE;
    private final Map<Long, List<String>> X = new TreeMap();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f29273a;

        /* renamed from: b, reason: collision with root package name */
        public String f29274b;

        public a(String str, String str2) {
            this.f29273a = str;
            this.f29274b = str2;
        }
    }

    public ImpressionLog() {
    }

    public ImpressionLog(ImpressionLog impressionLog) {
        a(impressionLog);
    }

    public synchronized void a(ImpressionLog impressionLog) {
        if (impressionLog != null) {
            this.V = Math.min(this.V, impressionLog.V);
            this.W = Math.min(this.W, impressionLog.W);
            synchronized (impressionLog) {
                for (Map.Entry<Long, List<String>> entry : impressionLog.X.entrySet()) {
                    List<String> list = this.X.get(entry.getKey());
                    if (list == null) {
                        list = new ArrayList<>();
                        this.X.put(entry.getKey(), list);
                    }
                    list.addAll(entry.getValue());
                }
            }
        }
    }

    private StringBuilder c(String str, a[] aVarArr) {
        StringBuilder sb = new StringBuilder(str);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String str2 = aVar.f29274b;
                if (aVar.f29273a.equals("url")) {
                    str2 = a(aVar.f29274b, 60);
                }
                sb.append(Q).append(aVar.f29273a).append(R).append(str2);
            }
        }
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r0.contains(r1.toString()) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(java.lang.Long r6, java.lang.Long r7, java.lang.String r8, com.safedk.android.analytics.brandsafety.ImpressionLog.a... r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.V     // Catch: java.lang.Throwable -> Lab
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> Lab
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> Lab
            r5.V = r0     // Catch: java.lang.Throwable -> Lab
            long r0 = r5.W     // Catch: java.lang.Throwable -> Lab
            long r2 = r7.longValue()     // Catch: java.lang.Throwable -> Lab
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> Lab
            r5.W = r0     // Catch: java.lang.Throwable -> Lab
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            if (r0 != 0) goto L6e
            java.lang.StringBuilder r1 = r5.c(r8, r9)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.util.Map<java.lang.Long, java.util.List<java.lang.String>> r0 = r5.X     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            if (r0 != 0) goto L70
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.util.Map<java.lang.Long, java.util.List<java.lang.String>> r2 = r5.X     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            r2.put(r7, r0)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
        L37:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            r0.add(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.String r2 = "ImpressionLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.String r4 = "add event: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.String r3 = " at: "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.String r3 = ", count: "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            int r0 = r0.size()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            com.safedk.android.utils.Logger.d(r2, r0)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
        L6e:
            monitor-exit(r5)
            return
        L70:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            boolean r2 = r0.contains(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.Throwable -> Lab
            if (r2 == 0) goto L37
            goto L6e
        L7b:
            r0 = move-exception
            java.lang.String r0 = "ImpressionLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r1.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "add event failed: type="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = ", logEvents="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.util.Map<java.lang.Long, java.util.List<java.lang.String>> r2 = r5.X     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = ", timeElapsed="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lab
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> Lab
            goto L6e
        Lab:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.ImpressionLog.a(java.lang.Long, java.lang.Long, java.lang.String, com.safedk.android.analytics.brandsafety.ImpressionLog$a[]):void");
    }

    public void a(String str, a... aVarArr) {
        a(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized void b(Long l2, Long l3, String str, a... aVarArr) {
        this.V = Math.min(this.V, l2.longValue());
        this.W = Math.min(this.W, l3.longValue());
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            StringBuilder c2 = c(str, aVarArr);
            for (List<String> list : this.X.values()) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (next.contains(c2.toString())) {
                            i2 = b(next);
                            list.remove(next);
                            break;
                        }
                    }
                }
                i2 = i2;
            }
            c2.append(Q).append(M).append(R).append(i2 + 1);
            List<String> list2 = this.X.get(l3);
            if (list2 == null) {
                list2 = new ArrayList<>();
                this.X.put(l3, list2);
            }
            list2.add(c2.toString());
            Logger.d(T, "add cumulative event: " + ((Object) c2) + " at: " + l2 + ", count: " + list2.size());
        }
    }

    public void b(String str, a... aVarArr) {
        b(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    private int b(String str) {
        try {
            String[] split = str.split("cnt=");
            if (split.length > 1) {
                return Integer.parseInt(split[1]);
            }
        } catch (Exception e2) {
            Logger.d(T, "get cumulative event counter, failed to parse event count from: " + str);
        }
        return 0;
    }

    private String a(String str, int i2) {
        if (str != null && str.length() > i2) {
            return str.substring(0, ((i2 * 2) / 3) - 3) + S + str.substring((str.length() - (i2 / 3)) + 2);
        }
        return str;
    }

    public synchronized boolean a(String str) {
        boolean z2;
        Iterator<List<String>> it = this.X.values().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(str)) {
                    z2 = true;
                    break loop0;
                }
            }
        }
        return z2;
    }

    public int a() {
        return this.X.size();
    }

    public synchronized String toString() {
        StringBuilder sb;
        boolean z2;
        boolean z3 = true;
        sb = new StringBuilder();
        for (Map.Entry<Long, List<String>> entry : this.X.entrySet()) {
            for (String str : entry.getValue()) {
                if (z3) {
                    sb.append(this.V);
                    z2 = false;
                } else {
                    sb.append(P).append(entry.getKey().longValue() - this.W);
                    z2 = z3;
                }
                sb.append(Q).append(str);
                z3 = z2;
            }
        }
        return sb.toString();
    }
}
