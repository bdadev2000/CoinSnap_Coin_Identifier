package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.e;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class b {
    private static final b a;

    static {
        a = e.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
