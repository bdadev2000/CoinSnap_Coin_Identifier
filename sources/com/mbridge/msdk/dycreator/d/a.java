package com.mbridge.msdk.dycreator.d;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f15267a;

    /* renamed from: com.mbridge.msdk.dycreator.d.a$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15268a;

        static {
            int[] iArr = new int[EnumC0154a.values().length];
            f15268a = iArr;
            try {
                iArr[EnumC0154a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15268a[EnumC0154a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15268a[EnumC0154a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15268a[EnumC0154a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0154a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f15267a == null) {
            synchronized (a.class) {
                try {
                    if (f15267a == null) {
                        f15267a = new a();
                    }
                } finally {
                }
            }
        }
        return f15267a;
    }

    public final <T extends com.mbridge.msdk.dycreator.g.a> T a(EnumC0154a enumC0154a) {
        int i9 = AnonymousClass1.f15268a[enumC0154a.ordinal()];
        if (i9 == 1) {
            return new d();
        }
        if (i9 == 2) {
            return new c();
        }
        if (i9 == 3) {
            return new f();
        }
        if (i9 != 4) {
            return null;
        }
        return new h();
    }
}
