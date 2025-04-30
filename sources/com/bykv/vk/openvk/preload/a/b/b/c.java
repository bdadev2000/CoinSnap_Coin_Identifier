package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static Class f12988a;
    private final Object b = b();

    /* renamed from: c, reason: collision with root package name */
    private final Field f12989c = c();

    private boolean b(AccessibleObject accessibleObject) {
        if (this.b == null || this.f12989c == null) {
            return false;
        }
        try {
            Long l = (Long) f12988a.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.f12989c);
            l.longValue();
            f12988a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, l, Boolean.TRUE);
            return true;
        } catch (Exception unused) {
            return false;
        }
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
            } catch (SecurityException e4) {
                throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e4);
            }
        }
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f12988a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
