package com.mbridge.msdk.newreward.a.b;

import android.os.SystemClock;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.a.e f16923a;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f16924a;
        private final com.mbridge.msdk.newreward.function.d.b.b b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16925c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16926d;

        /* renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f16927e;

        /* renamed from: f, reason: collision with root package name */
        private final String f16928f;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.b bVar2, boolean z8, int i9, com.mbridge.msdk.newreward.a.b.b bVar3, String str) {
            this.f16924a = bVar;
            this.b = bVar2;
            this.f16925c = z8;
            this.f16926d = i9;
            this.f16927e = bVar3;
            this.f16928f = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0007, B:5:0x000b, B:8:0x0018, B:11:0x0032, B:13:0x0092, B:15:0x00ba, B:16:0x00bd, B:18:0x00c3, B:19:0x00c6, B:22:0x0040, B:30:0x005c, B:31:0x0062, B:34:0x006a, B:36:0x0072), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c3 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0007, B:5:0x000b, B:8:0x0018, B:11:0x0032, B:13:0x0092, B:15:0x00ba, B:16:0x00bd, B:18:0x00c3, B:19:0x00c6, B:22:0x0040, B:30:0x005c, B:31:0x0062, B:34:0x006a, B:36:0x0072), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
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
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                if (r4 == 0) goto Lcf
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3d
                r5 = 9
                r6 = 880003(0xd6d83, float:1.233147E-39)
                java.lang.String r7 = ""
                if (r4 != r5) goto L40
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                int r2 = r4.a()     // Catch: java.lang.Exception -> L3d
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                java.lang.String r0 = r4.b()     // Catch: java.lang.Exception -> L3d
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                int r3 = r4.c()     // Catch: java.lang.Exception -> L3d
                r4 = -1
                if (r3 != r4) goto L31
                r3 = 880017(0xd6d91, float:1.233166E-39)
                goto L32
            L31:
                r3 = r6
            L32:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                java.lang.String r4 = r4.f()     // Catch: java.lang.Exception -> L3d
                r5 = 1
                r9 = r7
                r7 = r4
            L3b:
                r4 = r9
                goto L92
            L3d:
                r11 = move-exception
                goto Lcc
            L40:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3d
                r5 = 10
                if (r4 != r5) goto L5c
                r4 = 880023(0xd6d97, float:1.233175E-39)
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.b     // Catch: java.lang.Exception -> L58
                java.lang.String r0 = r5.d()     // Catch: java.lang.Exception -> L58
                r5 = r2
                r2 = r4
                r3 = r2
            L56:
                r4 = r7
                goto L92
            L58:
                r11 = move-exception
                r2 = r4
                goto Lcc
            L5c:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3d
                switch(r4) {
                    case 1: goto L6a;
                    case 2: goto L69;
                    case 3: goto L6a;
                    case 4: goto L6a;
                    case 5: goto L6a;
                    case 6: goto L65;
                    case 7: goto L69;
                    case 8: goto L6a;
                    default: goto L65;
                }     // Catch: java.lang.Exception -> L3d
            L65:
                r3 = 880020(0xd6d94, float:1.23317E-39)
                goto L6a
            L69:
                r3 = r6
            L6a:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                com.mbridge.msdk.tracker.network.ad r4 = r4.e()     // Catch: java.lang.Exception -> L3d
                if (r4 == 0) goto L90
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.b     // Catch: java.lang.Exception -> L3d
                com.mbridge.msdk.tracker.network.ad r4 = r4.e()     // Catch: java.lang.Exception -> L3d
                int r4 = r4.b()     // Catch: java.lang.Exception -> L3d
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.b     // Catch: java.lang.Exception -> L58
                com.mbridge.msdk.tracker.network.ad r5 = r5.e()     // Catch: java.lang.Exception -> L58
                java.lang.String r0 = r5.c()     // Catch: java.lang.Exception -> L58
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.b     // Catch: java.lang.Exception -> L58
                java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L58
                r9 = r5
                r5 = r2
                r2 = r4
                goto L3b
            L90:
                r5 = r2
                goto L56
            L92:
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)     // Catch: java.lang.Exception -> L3d
                java.lang.String r6 = "can_retry"
                boolean r8 = r10.f16925c     // Catch: java.lang.Exception -> L3d
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L3d
                r1.a(r6, r8)     // Catch: java.lang.Exception -> L3d
                java.lang.String r6 = "campaign_request_error_type"
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L3d
                r1.a(r6, r11)     // Catch: java.lang.Exception -> L3d
                java.lang.String r11 = "campaign_request_error"
                com.mbridge.msdk.newreward.function.d.b.b r6 = r10.b     // Catch: java.lang.Exception -> L3d
                r1.a(r11, r6)     // Catch: java.lang.Exception -> L3d
                r1.b(r5)     // Catch: java.lang.Exception -> L3d
                boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L3d
                if (r11 != 0) goto Lbd
                r1.d(r7)     // Catch: java.lang.Exception -> L3d
            Lbd:
                boolean r11 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L3d
                if (r11 != 0) goto Lc6
                r1.e(r4)     // Catch: java.lang.Exception -> L3d
            Lc6:
                java.lang.String r11 = r10.f16928f     // Catch: java.lang.Exception -> L3d
                r1.c(r11)     // Catch: java.lang.Exception -> L3d
                goto Lcf
            Lcc:
                r11.printStackTrace()
            Lcf:
                if (r1 != 0) goto Ld5
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)
            Ld5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.b.c.a.a(int):com.mbridge.msdk.foundation.c.b");
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.a.b.b bVar = this.f16927e;
            if (bVar != null && this.b != null) {
                try {
                    bVar.a(a(this.f16926d));
                } catch (Exception e4) {
                    ad.b("ReqCampaignService", "run: ", e4);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f16929a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f16929a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.function.d.a.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 != null && (bVar = this.f16929a) != null) {
                try {
                    bVar2.a(bVar);
                } catch (Exception e4) {
                    ad.b("ReqCampaignService", "run: ", e4);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.newreward.a.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0172c implements com.mbridge.msdk.newreward.function.d.b.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f16930a;

        public C0172c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f16930a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar) {
            MBridgeTaskManager.commonExecute(new b(bVar, this.f16930a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, true, 401, this.f16930a, aVar.k()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 402, this.f16930a, aVar.k()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, long j7, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 405, this.f16930a, aVar.k()));
        }
    }

    public c(com.mbridge.msdk.newreward.a.e eVar) {
        this.f16923a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int i9;
        int d2;
        if (obj != null) {
            try {
                long g9 = this.f16923a.g();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (g9 <= 0) {
                    this.f16923a.b(elapsedRealtime);
                    g9 = elapsedRealtime;
                }
                com.mbridge.msdk.newreward.function.g.d dVar = (com.mbridge.msdk.newreward.function.g.d) obj;
                Map<String, String> f9 = dVar.f();
                com.mbridge.msdk.newreward.function.d.b.h hVar = new com.mbridge.msdk.newreward.function.d.b.h(dVar.b(), dVar.c(), dVar.d(), Math.max(this.f16923a.I() - (elapsedRealtime - g9), 0L), dVar.e());
                hVar.a(f9);
                hVar.b(this.f16923a.z());
                hVar.a((com.mbridge.msdk.newreward.function.d.b.c) new C0172c(bVar));
                byte[] p2 = hVar.p();
                if (p2 != null) {
                    i9 = p2.length;
                } else {
                    i9 = 0;
                }
                hVar.a(com.mbridge.msdk.foundation.same.net.f.e.f15857h, String.valueOf(i9));
                if (p2 != null && (d2 = com.mbridge.msdk.foundation.same.net.e.d.f().d()) > 0 && i9 > d2) {
                    hVar.a(1);
                    hVar.b("Content-Type", "application/x-www-form-urlencoded");
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().b().a(hVar);
                return;
            } catch (Exception e4) {
                throw new IOException(e4);
            }
        }
        throw new IOException("ReqCampaignService doReq: params is null");
    }
}
