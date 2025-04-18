package com.mbridge.msdk.newreward.a.b;

import android.os.SystemClock;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.newreward.a.b.a {
    private final com.mbridge.msdk.newreward.a.e a;

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        private final com.mbridge.msdk.newreward.function.d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.b.b f14341b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14342c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14343d;

        /* renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14344e;

        /* renamed from: f, reason: collision with root package name */
        private final String f14345f;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.b bVar2, boolean z10, int i10, com.mbridge.msdk.newreward.a.b.b bVar3, String str) {
            this.a = bVar;
            this.f14341b = bVar2;
            this.f14342c = z10;
            this.f14343d = i10;
            this.f14344e = bVar3;
            this.f14345f = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00b7 A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0007, B:5:0x000b, B:8:0x0018, B:11:0x0032, B:13:0x008f, B:15:0x00b7, B:16:0x00ba, B:18:0x00c0, B:19:0x00c3, B:22:0x003d, B:30:0x0059, B:31:0x005f, B:34:0x0067, B:36:0x006f), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0007, B:5:0x000b, B:8:0x0018, B:11:0x0032, B:13:0x008f, B:15:0x00b7, B:16:0x00ba, B:18:0x00c0, B:19:0x00c3, B:22:0x003d, B:30:0x0059, B:31:0x005f, B:34:0x0067, B:36:0x006f), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.foundation.c.b a(int r11) {
            /*
                r10 = this;
                java.lang.String r0 = "load exception with no mCampaignRequestError"
                r1 = 0
                r2 = 0
                r3 = 880002(0xd6d82, float:1.233145E-39)
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                if (r4 == 0) goto Lcd
                int r4 = r4.c()     // Catch: java.lang.Exception -> Lc9
                r5 = 9
                r6 = 880003(0xd6d83, float:1.233147E-39)
                java.lang.String r7 = ""
                if (r4 != r5) goto L3d
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                int r2 = r4.a()     // Catch: java.lang.Exception -> Lc9
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                java.lang.String r0 = r4.b()     // Catch: java.lang.Exception -> Lc9
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                int r3 = r4.c()     // Catch: java.lang.Exception -> Lc9
                r4 = -1
                if (r3 != r4) goto L31
                r3 = 880017(0xd6d91, float:1.233166E-39)
                goto L32
            L31:
                r3 = r6
            L32:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                java.lang.String r4 = r4.f()     // Catch: java.lang.Exception -> Lc9
                r5 = 1
                r9 = r7
                r7 = r4
            L3b:
                r4 = r9
                goto L8f
            L3d:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                int r4 = r4.c()     // Catch: java.lang.Exception -> Lc9
                r5 = 10
                if (r4 != r5) goto L59
                r4 = 880023(0xd6d97, float:1.233175E-39)
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f14341b     // Catch: java.lang.Exception -> L55
                java.lang.String r0 = r5.d()     // Catch: java.lang.Exception -> L55
                r5 = r2
                r2 = r4
                r3 = r2
            L53:
                r4 = r7
                goto L8f
            L55:
                r11 = move-exception
                r2 = r4
                goto Lca
            L59:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                int r4 = r4.c()     // Catch: java.lang.Exception -> Lc9
                switch(r4) {
                    case 1: goto L67;
                    case 2: goto L66;
                    case 3: goto L67;
                    case 4: goto L67;
                    case 5: goto L67;
                    case 6: goto L62;
                    case 7: goto L66;
                    case 8: goto L67;
                    default: goto L62;
                }     // Catch: java.lang.Exception -> Lc9
            L62:
                r3 = 880020(0xd6d94, float:1.23317E-39)
                goto L67
            L66:
                r3 = r6
            L67:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                com.mbridge.msdk.tracker.network.ad r4 = r4.e()     // Catch: java.lang.Exception -> Lc9
                if (r4 == 0) goto L8d
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                com.mbridge.msdk.tracker.network.ad r4 = r4.e()     // Catch: java.lang.Exception -> Lc9
                int r4 = r4.b()     // Catch: java.lang.Exception -> Lc9
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f14341b     // Catch: java.lang.Exception -> L55
                com.mbridge.msdk.tracker.network.ad r5 = r5.e()     // Catch: java.lang.Exception -> L55
                java.lang.String r0 = r5.c()     // Catch: java.lang.Exception -> L55
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f14341b     // Catch: java.lang.Exception -> L55
                java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L55
                r9 = r5
                r5 = r2
                r2 = r4
                goto L3b
            L8d:
                r5 = r2
                goto L53
            L8f:
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)     // Catch: java.lang.Exception -> Lc9
                java.lang.String r6 = "can_retry"
                boolean r8 = r10.f14342c     // Catch: java.lang.Exception -> Lc9
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> Lc9
                r1.a(r6, r8)     // Catch: java.lang.Exception -> Lc9
                java.lang.String r6 = "campaign_request_error_type"
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> Lc9
                r1.a(r6, r11)     // Catch: java.lang.Exception -> Lc9
                java.lang.String r11 = "campaign_request_error"
                com.mbridge.msdk.newreward.function.d.b.b r6 = r10.f14341b     // Catch: java.lang.Exception -> Lc9
                r1.a(r11, r6)     // Catch: java.lang.Exception -> Lc9
                r1.b(r5)     // Catch: java.lang.Exception -> Lc9
                boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Lc9
                if (r11 != 0) goto Lba
                r1.d(r7)     // Catch: java.lang.Exception -> Lc9
            Lba:
                boolean r11 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lc9
                if (r11 != 0) goto Lc3
                r1.e(r4)     // Catch: java.lang.Exception -> Lc9
            Lc3:
                java.lang.String r11 = r10.f14345f     // Catch: java.lang.Exception -> Lc9
                r1.c(r11)     // Catch: java.lang.Exception -> Lc9
                goto Lcd
            Lc9:
                r11 = move-exception
            Lca:
                r11.printStackTrace()
            Lcd:
                if (r1 != 0) goto Ld3
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)
            Ld3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.b.c.a.a(int):com.mbridge.msdk.foundation.c.b");
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.a.b.b bVar = this.f14344e;
            if (bVar != null && this.f14341b != null) {
                try {
                    bVar.a(a(this.f14343d));
                } catch (Exception e2) {
                    ad.b("ReqCampaignService", "run: ", e2);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements Runnable {
        private final com.mbridge.msdk.newreward.function.d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14346b;

        public b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.a = bVar;
            this.f14346b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.function.d.a.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14346b;
            if (bVar2 != null && (bVar = this.a) != null) {
                try {
                    bVar2.a(bVar);
                } catch (Exception e2) {
                    ad.b("ReqCampaignService", "run: ", e2);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.newreward.a.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0184c implements com.mbridge.msdk.newreward.function.d.b.c {
        private final com.mbridge.msdk.newreward.a.b.b a;

        public C0184c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar) {
            MBridgeTaskManager.commonExecute(new b(bVar, this.a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, true, 401, this.a, aVar.k()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 402, this.a, aVar.k()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, long j3, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 405, this.a, aVar.k()));
        }
    }

    public c(com.mbridge.msdk.newreward.a.e eVar) {
        this.a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int i10;
        int d10;
        if (obj != null) {
            try {
                long g10 = this.a.g();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (g10 <= 0) {
                    this.a.b(elapsedRealtime);
                    g10 = elapsedRealtime;
                }
                com.mbridge.msdk.newreward.function.g.d dVar = (com.mbridge.msdk.newreward.function.g.d) obj;
                Map<String, String> f10 = dVar.f();
                com.mbridge.msdk.newreward.function.d.b.h hVar = new com.mbridge.msdk.newreward.function.d.b.h(dVar.b(), dVar.c(), dVar.d(), Math.max(this.a.I() - (elapsedRealtime - g10), 0L), dVar.e());
                hVar.a(f10);
                hVar.b(this.a.z());
                hVar.a((com.mbridge.msdk.newreward.function.d.b.c) new C0184c(bVar));
                byte[] p10 = hVar.p();
                if (p10 != null) {
                    i10 = p10.length;
                } else {
                    i10 = 0;
                }
                hVar.a(com.mbridge.msdk.foundation.same.net.f.e.f13422h, String.valueOf(i10));
                if (p10 != null && (d10 = com.mbridge.msdk.foundation.same.net.e.d.f().d()) > 0 && i10 > d10) {
                    hVar.a(1);
                    hVar.b("Content-Type", "application/x-www-form-urlencoded");
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().b().a(hVar);
                return;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
        throw new IOException("ReqCampaignService doReq: params is null");
    }
}
