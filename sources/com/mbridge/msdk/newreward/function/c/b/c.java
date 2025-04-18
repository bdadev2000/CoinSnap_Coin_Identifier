package com.mbridge.msdk.newreward.function.c.b;

import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.h;
import com.mbridge.msdk.newreward.function.c.b.a.j;
import com.mbridge.msdk.newreward.function.c.b.a.k;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {
    private static volatile c a;

    /* renamed from: b, reason: collision with root package name */
    private Map<e, Object> f14499b;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.c$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.RESTORE_DB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.SMART_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.NORMAL_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.PRE_HANDLE_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.UNIT_INIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.CHECK_IS_REQUEST_CONTROL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.UPDATE_CAM_TOKEN_RULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.START_LOAD_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.CANDIDATE_LOAD_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

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

    public final <T extends d> T b(e eVar) {
        T t5 = null;
        switch (AnonymousClass1.a[eVar.ordinal()]) {
            case 6:
                return new g();
            case 7:
                return new l();
            case 8:
                return new com.mbridge.msdk.newreward.function.c.b.a.c();
            case 9:
                if (this.f14499b == null) {
                    this.f14499b = new HashMap();
                }
                Map<e, Object> map = this.f14499b;
                e eVar2 = e.CANDIDATE_LOAD_ACTION;
                if (map.containsKey(eVar2)) {
                    t5 = (T) this.f14499b.get(eVar2);
                }
                if (t5 == null) {
                    com.mbridge.msdk.newreward.function.c.b.a.a aVar = new com.mbridge.msdk.newreward.function.c.b.a.a();
                    this.f14499b.put(eVar2, aVar);
                    return aVar;
                }
                return t5;
            default:
                return null;
        }
    }

    public final <T extends a> T a(e eVar) {
        int i10 = AnonymousClass1.a[eVar.ordinal()];
        if (i10 == 1) {
            return new h();
        }
        if (i10 == 2) {
            return new j();
        }
        if (i10 == 3) {
            return new com.mbridge.msdk.newreward.function.c.b.a.d();
        }
        if (i10 == 4) {
            return new com.mbridge.msdk.newreward.function.c.b.a.e();
        }
        if (i10 != 5) {
            return null;
        }
        return new k();
    }
}
