package com.mbridge.msdk.newreward.function.c.b.b;

import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f17093a;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f17094c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f17095d = 0;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.b$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17098a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f17098a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17098a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f17093a = aVar;
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, null, false);
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b bVar2 = new com.mbridge.msdk.newreward.function.c.b();
        bVar2.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        HashMap hashMap = new HashMap();
        com.mbridge.msdk.newreward.a.e b = eVar.b();
        hashMap.put("adapter_model", b);
        hashMap.put("command_manager", eVar.d());
        bVar2.a(hashMap);
        b.c();
        this.f17093a.a(bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.b.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                bVar.a(obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar3) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar3 != null ? bVar3.b() : "", false);
                b.this.b = true;
                bVar.a(bVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z8) {
        if (eVar2 == null) {
            return;
        }
        if (this.f17095d == 0) {
            this.f17095d = System.currentTimeMillis();
        }
        com.mbridge.msdk.newreward.function.c.c d2 = eVar2.d();
        com.mbridge.msdk.newreward.a.e b = eVar2.b();
        if (d2 == null || b == null) {
            return;
        }
        try {
            int i9 = 1;
            Map a6 = d2.a("retry_count", 1, "type", 2);
            int i10 = AnonymousClass2.f17098a[eVar.ordinal()];
            if (i10 == 1) {
                d2.a(b, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, a6);
                return;
            }
            if (i10 != 2) {
                return;
            }
            a6.put("duration", Long.valueOf(System.currentTimeMillis() - this.f17095d));
            if (!z8) {
                a6.put("reason", str);
            }
            if (!z8) {
                i9 = 2;
            }
            a6.put("result", Integer.valueOf(i9));
            d2.a(b, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, a6);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
