package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class af {
    public volatile JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13546b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f13547c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13548d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f13549e;

    /* renamed from: f, reason: collision with root package name */
    private String f13550f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f13551g;

    /* renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f13552h;

    /* renamed from: i, reason: collision with root package name */
    private volatile com.mbridge.msdk.c.g f13553i;

    /* loaded from: classes4.dex */
    public static final class a {
        private static final af a = new af();

        public static /* synthetic */ af a() {
            return a;
        }
    }

    public static af a() {
        return a.a;
    }

    private int b(String str, String str2, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            String optString = this.a.optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return i10;
            }
            String a10 = x.a(optString);
            return TextUtils.isEmpty(a10) ? i10 : new JSONObject(a10).optInt(str2, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    private ConcurrentHashMap<String, Boolean> c() {
        synchronized (this.f13548d) {
            if (this.f13551g == null) {
                this.f13551g = new ConcurrentHashMap<>();
            }
        }
        return this.f13551g;
    }

    private af() {
        this.f13546b = new Object();
        this.f13547c = new Object();
        this.f13548d = new Object();
        this.f13549e = new Object();
    }

    private static Integer a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int a(String str, int i10) {
        Integer valueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i10;
            }
            ConcurrentHashMap<String, Integer> b3 = b();
            Integer a10 = a(str, b3);
            if (a10 != null) {
                return a10.intValue();
            }
            try {
                valueOf = Integer.valueOf(b(str, i10));
            } catch (Exception unused) {
                valueOf = Integer.valueOf(i10);
            }
            b3.put(str, valueOf);
            return valueOf.intValue();
        } catch (Exception unused2) {
            return i10;
        }
    }

    private int b(String str, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            return this.a.optInt(str, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    private ConcurrentHashMap<String, Integer> b() {
        synchronized (this.f13546b) {
            if (this.f13552h == null) {
                this.f13552h = new ConcurrentHashMap<>();
            }
        }
        return this.f13552h;
    }

    public final int a(String str, String str2, int i10) {
        Integer valueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> b3 = b();
                Integer a10 = a(str3, b3);
                if (a10 != null) {
                    return a10.intValue();
                }
                try {
                    valueOf = Integer.valueOf(b(str, str2, i10));
                } catch (Exception unused) {
                    valueOf = Integer.valueOf(i10);
                }
                b3.put(str3, valueOf);
                return valueOf.intValue();
            }
            return a(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    private static Boolean b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, boolean z10, boolean z11) {
        if (a(z11)) {
            return z10;
        }
        try {
            return this.a.optInt(str, z10 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z10;
        }
    }

    public final boolean a(String str, boolean z10) {
        try {
            return a(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    public final boolean a(String str, boolean z10, boolean z11) {
        Boolean valueOf;
        Boolean b3;
        try {
            if (TextUtils.isEmpty(str)) {
                return z10;
            }
            ConcurrentHashMap<String, Boolean> c10 = c();
            if (z11 && (b3 = b(str, c10)) != null) {
                return b3.booleanValue();
            }
            try {
                valueOf = Boolean.valueOf(b(str, z10, z11));
            } catch (Exception unused) {
                valueOf = Boolean.valueOf(z10);
            }
            c10.put(str, valueOf);
            return valueOf.booleanValue();
        } catch (Exception unused2) {
            return z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r5 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13549e
            monitor-enter(r0)
            com.mbridge.msdk.c.g r1 = r4.f13553i     // Catch: java.lang.Throwable -> L53
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            com.mbridge.msdk.c.g r1 = r4.f13553i     // Catch: java.lang.Throwable -> L53
            int r1 = r1.H()     // Catch: java.lang.Throwable -> L53
            if (r1 != r3) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 != 0) goto L18
            if (r5 != 0) goto L3c
        L18:
            java.lang.String r5 = r4.f13550f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            if (r5 == 0) goto L2c
            com.mbridge.msdk.foundation.a.a.a r5 = com.mbridge.msdk.foundation.a.a.a.a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = "sdk_app_id"
            java.lang.String r5 = r5.a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.f13550f = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
        L2c:
            com.mbridge.msdk.c.h r5 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = r4.f13550f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r5.a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.f13553i = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            goto L3c
        L39:
            r5 = 0
            r4.f13553i = r5     // Catch: java.lang.Throwable -> L53
        L3c:
            com.mbridge.msdk.c.g r5 = r4.f13553i     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L48
            com.mbridge.msdk.c.g r5 = r4.f13553i     // Catch: java.lang.Throwable -> L53
            org.json.JSONObject r5 = r5.aj()     // Catch: java.lang.Throwable -> L53
            r4.a = r5     // Catch: java.lang.Throwable -> L53
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r4.f13553i
            if (r5 == 0) goto L51
            org.json.JSONObject r5 = r4.a
            if (r5 != 0) goto L52
        L51:
            r2 = r3
        L52:
            return r2
        L53:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.af.a(boolean):boolean");
    }
}
