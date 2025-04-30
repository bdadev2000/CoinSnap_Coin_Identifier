package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15887a = "a";
    private static a b;

    private a() {
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } finally {
                }
            }
        }
        return b;
    }
}
