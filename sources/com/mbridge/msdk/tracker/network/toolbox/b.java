package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.q;

/* loaded from: classes4.dex */
public final class b implements com.mbridge.msdk.tracker.network.n {
    protected final c a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15476b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0002, B:18:0x0008, B:4:0x0017, B:7:0x0022), top: B:15:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.tracker.network.q b(com.mbridge.msdk.tracker.network.u<?> r4) {
        /*
            if (r4 == 0) goto L14
            boolean r0 = r4.d()     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L14
            java.lang.String r0 = r4.k()     // Catch: java.lang.Exception -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L4d
            int r0 = r4.i()     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L20
            java.lang.String r0 = "GET"
            goto L22
        L20:
            java.lang.String r0 = "POST"
        L22:
            com.mbridge.msdk.tracker.network.q r1 = new com.mbridge.msdk.tracker.network.q     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r4.f()     // Catch: java.lang.Exception -> L4d
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "queue"
            r1.d(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "local_id"
            java.lang.String r0 = r4.d(r0)     // Catch: java.lang.Exception -> L4d
            r1.c(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "ad_type"
            java.lang.String r0 = r4.d(r0)     // Catch: java.lang.Exception -> L4d
            r1.b(r0)     // Catch: java.lang.Exception -> L4d
            long r2 = r4.v()     // Catch: java.lang.Exception -> L4d
            r1.a(r2)     // Catch: java.lang.Exception -> L4d
            r4.a(r1)     // Catch: java.lang.Exception -> L4d
            return r1
        L4d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.toolbox.b.b(com.mbridge.msdk.tracker.network.u):com.mbridge.msdk.tracker.network.q");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    @Override // com.mbridge.msdk.tracker.network.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.tracker.network.r a(com.mbridge.msdk.tracker.network.u<?> r23) throws com.mbridge.msdk.tracker.network.ad {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.toolbox.b.a(com.mbridge.msdk.tracker.network.u):com.mbridge.msdk.tracker.network.r");
    }

    private b(a aVar, c cVar) {
        this.f15476b = aVar;
        this.a = cVar;
    }

    private static void a(q qVar, int i10, Exception exc) {
        if (qVar != null) {
            try {
                qVar.a(exc);
                qVar.b(i10);
            } catch (Exception unused) {
            }
        }
    }
}
