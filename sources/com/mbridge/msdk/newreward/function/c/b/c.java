package com.mbridge.msdk.newreward.function.c.b;

import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.h;
import com.mbridge.msdk.newreward.function.c.b.a.j;
import com.mbridge.msdk.newreward.function.c.b.a.k;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f17114a;
    private Map<e, Object> b;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.c$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17115a;

        static {
            int[] iArr = new int[e.values().length];
            f17115a = iArr;
            try {
                iArr[e.RESTORE_DB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17115a[e.SMART_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17115a[e.NORMAL_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17115a[e.PRE_HANDLE_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17115a[e.UNIT_INIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17115a[e.CHECK_IS_REQUEST_CONTROL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17115a[e.UPDATE_CAM_TOKEN_RULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17115a[e.START_LOAD_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17115a[e.CANDIDATE_LOAD_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private c() {
    }

    public static c a() {
        if (f17114a == null) {
            synchronized (c.class) {
                try {
                    if (f17114a == null) {
                        f17114a = new c();
                    }
                } finally {
                }
            }
        }
        return f17114a;
    }

    public final <T extends d> T b(e eVar) {
        T t9 = null;
        switch (AnonymousClass1.f17115a[eVar.ordinal()]) {
            case 6:
                return new g();
            case 7:
                return new l();
            case 8:
                return new com.mbridge.msdk.newreward.function.c.b.a.c();
            case 9:
                if (this.b == null) {
                    this.b = new HashMap();
                }
                Map<e, Object> map = this.b;
                e eVar2 = e.CANDIDATE_LOAD_ACTION;
                if (map.containsKey(eVar2)) {
                    t9 = (T) this.b.get(eVar2);
                }
                if (t9 == null) {
                    com.mbridge.msdk.newreward.function.c.b.a.a aVar = new com.mbridge.msdk.newreward.function.c.b.a.a();
                    this.b.put(eVar2, aVar);
                    return aVar;
                }
                return t9;
            default:
                return null;
        }
    }

    public final <T extends a> T a(e eVar) {
        int i9 = AnonymousClass1.f17115a[eVar.ordinal()];
        if (i9 == 1) {
            return new h();
        }
        if (i9 == 2) {
            return new j();
        }
        if (i9 == 3) {
            return new com.mbridge.msdk.newreward.function.c.b.a.d();
        }
        if (i9 == 4) {
            return new com.mbridge.msdk.newreward.function.c.b.a.e();
        }
        if (i9 != 5) {
            return null;
        }
        return new k();
    }
}
