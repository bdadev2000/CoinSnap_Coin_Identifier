package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes4.dex */
public class a {
    public static final String a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f13449b;

    private a() {
    }

    public static a a() {
        if (f13449b == null) {
            synchronized (a.class) {
                if (f13449b == null) {
                    f13449b = new a();
                }
            }
        }
        return f13449b;
    }
}
