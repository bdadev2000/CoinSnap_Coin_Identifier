package com.pgl.ssdk.ces;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a {
    public static native Object meta(int i9, Context context, Object obj);

    public static Object njss(int i9, Object obj) {
        try {
            c f9 = c.f();
            if (f9 == null) {
                return null;
            }
            return f9.a(i9, obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
