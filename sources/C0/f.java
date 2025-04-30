package C0;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f413c;

    public /* synthetic */ f(Context context, int i9) {
        this.b = i9;
        this.f413c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.b
            switch(r0) {
                case 0: goto L98;
                case 1: goto L89;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L86
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f413c
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L86
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L5d
            x.c r0 = k.AbstractC2422k.f21315i
            java.util.Iterator r0 = r0.iterator()
        L29:
            r2 = r0
            x.h r2 = (x.h) r2
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r2 = r2.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            k.k r2 = (k.AbstractC2422k) r2
            if (r2 == 0) goto L29
            k.w r2 = (k.w) r2
            android.content.Context r2 = r2.m
            if (r2 == 0) goto L29
            java.lang.Object r0 = r2.getSystemService(r5)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L62
            android.os.LocaleList r0 = k.AbstractC2420i.a(r0)
            P.l r2 = new P.l
            P.m r6 = new P.m
            r6.<init>(r0)
            r2.<init>(r6)
            goto L64
        L5d:
            P.l r2 = k.AbstractC2422k.f21311d
            if (r2 == 0) goto L62
            goto L64
        L62:
            P.l r2 = P.l.b
        L64:
            P.m r0 = r2.f2264a
            android.os.LocaleList r0 = r0.f2265a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7f
            java.lang.String r0 = androidx.core.app.AbstractC0408i.f(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L7f
            android.os.LocaleList r0 = k.AbstractC2419h.a(r0)
            k.AbstractC2420i.b(r2, r0)
        L7f:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L86:
            k.AbstractC2422k.f21314h = r1
            return
        L89:
            A0.c r0 = new A0.c
            r1 = 0
            r0.<init>(r1)
            R3.e r1 = C0.e.f404a
            r2 = 0
            android.content.Context r3 = r11.f413c
            C0.e.s(r3, r0, r1, r2)
            return
        L98:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            C0.f r1 = new C0.f
            android.content.Context r2 = r11.f413c
            r3 = 1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.run():void");
    }
}
