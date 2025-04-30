package com.mbridge.msdk.dycreator.binding;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f15222a;

    private c() {
    }

    public static c a() {
        if (f15222a == null) {
            synchronized (c.class) {
                try {
                    if (f15222a == null) {
                        f15222a = new c();
                    }
                } finally {
                }
            }
        }
        return f15222a;
    }
}
