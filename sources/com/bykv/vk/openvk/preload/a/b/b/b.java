package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.e;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f12985a;

    static {
        b cVar;
        if (e.a() < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f12985a = cVar;
    }

    public static b a() {
        return f12985a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
