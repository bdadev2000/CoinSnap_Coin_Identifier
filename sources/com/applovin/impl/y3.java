package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class y3 {
    private static final a a = new a("Age Restricted User", qj.f7232m);

    /* renamed from: b, reason: collision with root package name */
    private static final a f9118b = new a("Has User Consent", qj.f7231l);

    /* renamed from: c, reason: collision with root package name */
    private static final a f9119c = new a("\"Do Not Sell\"", qj.f7233n);

    /* loaded from: classes.dex */
    public static class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final qj f9120b;

        public a(String str, qj qjVar) {
            this.a = str;
            this.f9120b = qjVar;
        }

        public Boolean b(Context context) {
            if (context == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to get value for key: " + this.f9120b);
                return null;
            }
            return (Boolean) sj.a(this.f9120b, (Object) null, context);
        }

        public String a() {
            return this.a;
        }

        public String a(Context context) {
            Boolean b3 = b(context);
            return b3 != null ? b3.toString() : "No value set";
        }
    }

    private static boolean a(qj qjVar, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to update compliance value for key: " + qjVar);
            return false;
        }
        Boolean bool2 = (Boolean) sj.a(qjVar, (Object) null, context);
        sj.b(qjVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    public static a b() {
        return f9118b;
    }

    public static a c() {
        return a;
    }

    public static boolean b(boolean z10, Context context) {
        return a(qj.f7231l, Boolean.valueOf(z10), context);
    }

    public static boolean c(boolean z10, Context context) {
        return a(qj.f7232m, Boolean.valueOf(z10), context);
    }

    public static a a() {
        return f9119c;
    }

    public static boolean a(boolean z10, Context context) {
        return a(qj.f7233n, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(a, context) + a(f9118b, context) + a(f9119c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.a + " - " + aVar.a(context);
    }
}
