package com.mbridge.msdk.dycreator.d;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;

/* loaded from: classes4.dex */
public final class a {
    private static volatile a a;

    /* renamed from: com.mbridge.msdk.dycreator.d.a$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0166a.values().length];
            a = iArr;
            try {
                iArr[EnumC0166a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0166a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0166a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0166a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0166a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public final <T extends com.mbridge.msdk.dycreator.g.a> T a(EnumC0166a enumC0166a) {
        int i10 = AnonymousClass1.a[enumC0166a.ordinal()];
        if (i10 == 1) {
            return new d();
        }
        if (i10 == 2) {
            return new c();
        }
        if (i10 == 3) {
            return new f();
        }
        if (i10 != 4) {
            return null;
        }
        return new h();
    }
}
