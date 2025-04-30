package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f12322a = new a("Age Restricted User", qj.m);
    private static final a b = new a("Has User Consent", qj.l);

    /* renamed from: c, reason: collision with root package name */
    private static final a f12323c = new a("\"Do Not Sell\"", qj.f10376n);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f12324a;
        private final qj b;

        public a(String str, qj qjVar) {
            this.f12324a = str;
            this.b = qjVar;
        }

        public Boolean b(Context context) {
            if (context == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to get value for key: " + this.b);
                return null;
            }
            return (Boolean) sj.a(this.b, (Object) null, context);
        }

        public String a() {
            return this.f12324a;
        }

        public String a(Context context) {
            Boolean b = b(context);
            return b != null ? b.toString() : "No value set";
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
        return b;
    }

    public static a c() {
        return f12322a;
    }

    public static boolean b(boolean z8, Context context) {
        return a(qj.l, Boolean.valueOf(z8), context);
    }

    public static boolean c(boolean z8, Context context) {
        return a(qj.m, Boolean.valueOf(z8), context);
    }

    public static a a() {
        return f12323c;
    }

    public static boolean a(boolean z8, Context context) {
        return a(qj.f10376n, Boolean.valueOf(z8), context);
    }

    public static String a(Context context) {
        return a(f12322a, context) + a(b, context) + a(f12323c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f12324a + " - " + aVar.a(context);
    }
}
