package com.applovin.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f22677a = new a("Age Restricted User", uj.f27338m);

    /* renamed from: b, reason: collision with root package name */
    private static final a f22678b = new a("Has User Consent", uj.f27337l);

    /* renamed from: c, reason: collision with root package name */
    private static final a f22679c = new a("\"Do Not Sell\"", uj.f27339n);

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22680a;

        /* renamed from: b, reason: collision with root package name */
        private final uj f22681b;

        public a(String str, uj ujVar) {
            this.f22680a = str;
            this.f22681b = ujVar;
        }

        public String a() {
            return this.f22680a;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) vj.a(this.f22681b, (Object) null, context);
            }
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get value for key: " + this.f22681b);
            return null;
        }

        public String a(Context context) {
            Boolean b2 = b(context);
            return b2 != null ? b2.toString() : "No value set";
        }
    }

    public static a a() {
        return f22679c;
    }

    public static a b() {
        return f22678b;
    }

    public static a c() {
        return f22677a;
    }

    private static boolean a(uj ujVar, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to update compliance value for key: " + ujVar);
            return false;
        }
        Boolean bool2 = (Boolean) vj.a(ujVar, (Object) null, context);
        vj.b(ujVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    public static boolean b(boolean z2, Context context) {
        return a(uj.f27337l, Boolean.valueOf(z2), context);
    }

    public static boolean a(boolean z2, Context context) {
        return a(uj.f27339n, Boolean.valueOf(z2), context);
    }

    public static String a(Context context) {
        return a(f22678b, context) + a(f22679c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f22680a + " - " + aVar.a(context);
    }
}
