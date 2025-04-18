package k9;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ra.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f20404b;

    public /* synthetic */ d(o oVar) {
        this.f20404b = oVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0038, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:20:0x005a, B:22:0x005e, B:24:0x0062, B:26:0x0066, B:28:0x006a, B:30:0x006e, B:32:0x0072, B:34:0x007c, B:36:0x0088, B:52:0x0094), top: B:3:0x0007 }] */
    @Override // ra.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            k9.o r0 = r8.f20404b
            s7.r0 r9 = (s7.r0) r9
            java.lang.Object r1 = r0.f20463c
            monitor-enter(r1)
            k9.h r2 = r0.f20467g     // Catch: java.lang.Throwable -> L96
            boolean r2 = r2.L     // Catch: java.lang.Throwable -> L96
            r3 = 1
            if (r2 == 0) goto L94
            boolean r2 = r0.f20466f     // Catch: java.lang.Throwable -> L96
            if (r2 != 0) goto L94
            int r2 = r9.A     // Catch: java.lang.Throwable -> L96
            r4 = 2
            if (r2 <= r4) goto L94
            java.lang.String r2 = r9.f24723n     // Catch: java.lang.Throwable -> L96
            r5 = 0
            if (r2 != 0) goto L1d
            goto L53
        L1d:
            int r6 = r2.hashCode()
            r7 = -1
            switch(r6) {
                case -2123537834: goto L46;
                case 187078296: goto L3b;
                case 187078297: goto L32;
                case 1504578661: goto L27;
                default: goto L25;
            }
        L25:
            r4 = r7
            goto L50
        L27:
            java.lang.String r4 = "audio/eac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L30
            goto L25
        L30:
            r4 = 3
            goto L50
        L32:
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L50
            goto L25
        L3b:
            java.lang.String r4 = "audio/ac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L44
            goto L25
        L44:
            r4 = r3
            goto L50
        L46:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4f
            goto L25
        L4f:
            r4 = r5
        L50:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L53;
            }
        L53:
            r2 = r5
            goto L56
        L55:
            r2 = r3
        L56:
            r4 = 32
            if (r2 == 0) goto L66
            int r2 = n9.h0.a     // Catch: java.lang.Throwable -> L96
            if (r2 < r4) goto L94
            h3.a r2 = r0.f20468h     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L94
            boolean r2 = r2.f18722c     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L94
        L66:
            int r2 = n9.h0.a     // Catch: java.lang.Throwable -> L96
            if (r2 < r4) goto L93
            h3.a r2 = r0.f20468h     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L93
            boolean r4 = r2.f18722c     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L93
            java.lang.Object r2 = r2.f18723d     // Catch: java.lang.Throwable -> L96
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L96
            boolean r2 = com.google.android.gms.internal.ads.c.k(r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L93
            h3.a r2 = r0.f20468h     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r2.f18723d     // Catch: java.lang.Throwable -> L96
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L96
            boolean r2 = com.google.android.gms.internal.ads.c.h(r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L93
            h3.a r2 = r0.f20468h     // Catch: java.lang.Throwable -> L96
            u7.e r0 = r0.f20469i     // Catch: java.lang.Throwable -> L96
            boolean r9 = r2.b(r9, r0)     // Catch: java.lang.Throwable -> L96
            if (r9 == 0) goto L93
            goto L94
        L93:
            r3 = r5
        L94:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            return r3
        L96:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.d.apply(java.lang.Object):boolean");
    }
}
