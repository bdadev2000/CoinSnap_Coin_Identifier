package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public volatile JSONObject f15987a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15988c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f15989d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15990e;

    /* renamed from: f, reason: collision with root package name */
    private String f15991f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f15992g;

    /* renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f15993h;

    /* renamed from: i, reason: collision with root package name */
    private volatile com.mbridge.msdk.c.g f15994i;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final af f15995a = new af();

        public static /* synthetic */ af a() {
            return f15995a;
        }
    }

    public static af a() {
        return a.f15995a;
    }

    private int b(String str, String str2, int i9) {
        if (a(true)) {
            return i9;
        }
        try {
            String optString = this.f15987a.optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return i9;
            }
            String a6 = x.a(optString);
            return TextUtils.isEmpty(a6) ? i9 : new JSONObject(a6).optInt(str2, i9);
        } catch (Exception unused) {
            return i9;
        }
    }

    private ConcurrentHashMap<String, Boolean> c() {
        synchronized (this.f15989d) {
            try {
                if (this.f15992g == null) {
                    this.f15992g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15992g;
    }

    private af() {
        this.b = new Object();
        this.f15988c = new Object();
        this.f15989d = new Object();
        this.f15990e = new Object();
    }

    private static Integer a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int a(String str, int i9) {
        Integer valueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i9;
            }
            ConcurrentHashMap<String, Integer> b = b();
            Integer a6 = a(str, b);
            if (a6 != null) {
                return a6.intValue();
            }
            try {
                valueOf = Integer.valueOf(b(str, i9));
            } catch (Exception unused) {
                valueOf = Integer.valueOf(i9);
            }
            b.put(str, valueOf);
            return valueOf.intValue();
        } catch (Exception unused2) {
            return i9;
        }
    }

    private int b(String str, int i9) {
        if (a(true)) {
            return i9;
        }
        try {
            return this.f15987a.optInt(str, i9);
        } catch (Exception unused) {
            return i9;
        }
    }

    private ConcurrentHashMap<String, Integer> b() {
        synchronized (this.b) {
            try {
                if (this.f15993h == null) {
                    this.f15993h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15993h;
    }

    public final int a(String str, String str2, int i9) {
        Integer valueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> b = b();
                Integer a6 = a(str3, b);
                if (a6 != null) {
                    return a6.intValue();
                }
                try {
                    valueOf = Integer.valueOf(b(str, str2, i9));
                } catch (Exception unused) {
                    valueOf = Integer.valueOf(i9);
                }
                b.put(str3, valueOf);
                return valueOf.intValue();
            }
            return a(str2, i9);
        } catch (Exception unused2) {
            return i9;
        }
    }

    private static Boolean b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, boolean z8, boolean z9) {
        if (a(z9)) {
            return z8;
        }
        try {
            return this.f15987a.optInt(str, z8 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8) {
        try {
            return a(str, z8, true);
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8, boolean z9) {
        Boolean valueOf;
        Boolean b;
        try {
            if (TextUtils.isEmpty(str)) {
                return z8;
            }
            ConcurrentHashMap<String, Boolean> c9 = c();
            if (z9 && (b = b(str, c9)) != null) {
                return b.booleanValue();
            }
            try {
                valueOf = Boolean.valueOf(b(str, z8, z9));
            } catch (Exception unused) {
                valueOf = Boolean.valueOf(z8);
            }
            c9.put(str, valueOf);
            return valueOf.booleanValue();
        } catch (Exception unused2) {
            return z8;
        }
    }

    private boolean a(boolean z8) {
        synchronized (this.f15990e) {
            if (this.f15994i == null || this.f15994i.H() == 1 || !z8) {
                try {
                    if (TextUtils.isEmpty(this.f15991f)) {
                        this.f15991f = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
                    }
                    this.f15994i = com.mbridge.msdk.c.h.a().a(this.f15991f);
                } catch (Exception unused) {
                    this.f15994i = null;
                }
            }
            if (this.f15994i != null) {
                this.f15987a = this.f15994i.aj();
            }
        }
        return this.f15994i == null || this.f15987a == null;
    }
}
