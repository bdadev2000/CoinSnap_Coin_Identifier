package com.mbridge.msdk.newreward.function.c.b.b;

import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {
    private com.mbridge.msdk.newreward.function.c.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f14480b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f14481c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f14482d = 0;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.b$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.a = aVar;
    }

    public final boolean a() {
        return this.f14480b;
    }

    public final void a(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, null, false);
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b bVar2 = new com.mbridge.msdk.newreward.function.c.b();
        bVar2.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        HashMap hashMap = new HashMap();
        com.mbridge.msdk.newreward.a.e b3 = eVar.b();
        hashMap.put("adapter_model", b3);
        hashMap.put("command_manager", eVar.d());
        bVar2.a(hashMap);
        b3.c();
        this.a.a(bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.b.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                bVar.a(obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar3) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar3 != null ? bVar3.b() : "", false);
                b.this.f14480b = true;
                bVar.a(bVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z10) {
        if (eVar2 == null) {
            return;
        }
        if (this.f14482d == 0) {
            this.f14482d = System.currentTimeMillis();
        }
        com.mbridge.msdk.newreward.function.c.c d10 = eVar2.d();
        com.mbridge.msdk.newreward.a.e b3 = eVar2.b();
        if (d10 == null || b3 == null) {
            return;
        }
        try {
            int i10 = 1;
            Map a = d10.a("retry_count", 1, "type", 2);
            int i11 = AnonymousClass2.a[eVar.ordinal()];
            if (i11 == 1) {
                d10.a(b3, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, a);
                return;
            }
            if (i11 != 2) {
                return;
            }
            a.put("duration", Long.valueOf(System.currentTimeMillis() - this.f14482d));
            if (!z10) {
                a.put("reason", str);
            }
            if (!z10) {
                i10 = 2;
            }
            a.put("result", Integer.valueOf(i10));
            d10.a(b3, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
