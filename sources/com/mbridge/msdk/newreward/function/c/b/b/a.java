package com.mbridge.msdk.newreward.function.c.b.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f17085a;

    /* renamed from: c, reason: collision with root package name */
    private long f17086c;
    private volatile boolean b = false;

    /* renamed from: d, reason: collision with root package name */
    private int f17087d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f17088e = 0;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.a$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17092a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f17092a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17092a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f17085a = aVar;
    }

    public final void b(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        if (eVar == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.newreward.function.c.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.newreward.function.c.b bVar2 = new com.mbridge.msdk.newreward.function.c.b();
                bVar2.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
                HashMap hashMap = new HashMap();
                final com.mbridge.msdk.newreward.a.e b = eVar.b();
                hashMap.put("adapter_model", b);
                hashMap.put("command_manager", eVar.d());
                bVar2.a(hashMap);
                b.c();
                a.this.f17085a.a(bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.a.1.1
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        a.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                        bVar.a(obj);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar3) {
                        ad.a("CampaignRetryStrategy", "reqFailed，try retry");
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (!a.this.a(bVar3, eVar, b)) {
                            a.this.b = true;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            a.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar3 != null ? bVar3.b() : "", false);
                            bVar.a(bVar3);
                            return;
                        }
                        eVar.a(bVar3);
                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                        a.this.b(eVar, bVar);
                    }
                });
            }
        };
        ad.a("CampaignRetryStrategy", "retryReqCampaign，retryReqCampaign: " + this.f17086c);
        MBridgeTaskManager.directorExecute(runnable, this.f17086c);
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(e eVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, "", false);
        b(eVar, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.mbridge.msdk.foundation.c.b r9, com.mbridge.msdk.newreward.function.c.b.b.e r10, com.mbridge.msdk.newreward.a.e r11) {
        /*
            r8 = this;
            r0 = 0
            if (r11 == 0) goto L86
            if (r9 == 0) goto L86
            if (r10 == 0) goto L86
            int r10 = r9.a()
            r1 = 2
            if (r10 != r1) goto L10
            goto L86
        L10:
            com.mbridge.msdk.foundation.tools.af r10 = com.mbridge.msdk.foundation.tools.af.a()
            java.lang.String r1 = "campaign_request_interval"
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r3 = "retry_strategy"
            int r10 = r10.a(r3, r1, r2)
            long r1 = (long) r10
            r8.f17086c = r1
            com.mbridge.msdk.foundation.tools.af r10 = com.mbridge.msdk.foundation.tools.af.a()
            java.lang.String r1 = "campaign_request_max"
            int r10 = r10.a(r3, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "campaignRequestRetryInvalidTime = "
            r1.<init>(r2)
            long r2 = r8.f17086c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CampaignRetryStrategy"
            com.mbridge.msdk.foundation.tools.ad.a(r2, r1)
            long r1 = r8.f17086c
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L86
            if (r10 > 0) goto L4b
            goto L86
        L4b:
            java.lang.String r1 = "can_retry"
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto L5c
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L5b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L5b
            if (r9 != 0) goto L5c
        L5b:
            return r0
        L5c:
            int r9 = r8.f17087d
            if (r9 != 0) goto L66
            long r1 = java.lang.System.currentTimeMillis()
            r8.f17088e = r1
        L66:
            int r9 = r8.f17087d
            r1 = 1
            int r9 = r9 + r1
            r8.f17087d = r9
            long r2 = r11.g()
            int r9 = r11.I()
            long r4 = (long) r9
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r2
            long r2 = r8.f17086c
            long r4 = r4 - r2
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L86
            int r9 = r8.f17087d
            if (r9 > r10) goto L86
            r0 = r1
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.c.b.b.a.a(com.mbridge.msdk.foundation.c.b, com.mbridge.msdk.newreward.function.c.b.b.e, com.mbridge.msdk.newreward.a.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z8) {
        if (eVar2 == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c d2 = eVar2.d();
        com.mbridge.msdk.newreward.a.e b = eVar2.b();
        if (d2 == null || b == null) {
            return;
        }
        try {
            int i9 = 1;
            Map a6 = d2.a("retry_count", Integer.valueOf(this.f17087d), "type", 1);
            int i10 = AnonymousClass2.f17092a[eVar.ordinal()];
            if (i10 == 1) {
                d2.a(b, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, a6);
                return;
            }
            if (i10 != 2) {
                return;
            }
            a6.put("duration", Long.valueOf(System.currentTimeMillis() - this.f17088e));
            if (z8) {
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
