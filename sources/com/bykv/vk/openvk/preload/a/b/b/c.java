package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class c extends b {
    private static Class a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9842b = b();

    /* renamed from: c, reason: collision with root package name */
    private final Field f9843c = c();

    private boolean b(AccessibleObject accessibleObject) {
        if (this.f9842b != null && this.f9843c != null) {
            try {
                a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f9842b, accessibleObject, Long.valueOf(((Long) a.getMethod("objectFieldOffset", Field.class).invoke(this.f9842b, this.f9843c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(AccessibleObject accessibleObject) {
        if (!b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
