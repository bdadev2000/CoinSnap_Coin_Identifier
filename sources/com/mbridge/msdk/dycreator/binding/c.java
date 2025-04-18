package com.mbridge.msdk.dycreator.binding;

/* loaded from: classes4.dex */
public final class c {
    private static volatile c a;

    private c() {
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }
}
