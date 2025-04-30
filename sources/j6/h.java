package j6;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f21118c;

    public /* synthetic */ h(m mVar, int i9) {
        this.b = i9;
        this.f21118c = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.b
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "this$0"
            j6.m r1 = r6.f21118c
            G7.j.e(r1, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            j6.h r2 = new j6.h
            r3 = 0
            r2.<init>(r1, r3)
            j6.j r1 = r1.f21171c
            long r3 = r1.f21140V
            r0.postDelayed(r2, r3)
            return
        L23:
            java.lang.String r0 = "this$0"
            j6.m r1 = r6.f21118c
            G7.j.e(r1, r0)
            j6.j r0 = r1.f21171c
            int r2 = r0.f21139U
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L96
            j6.q r2 = r0.f21138T
            int r2 = r2.ordinal()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L6b
            if (r2 == r4) goto L47
            if (r2 == r3) goto L43
            r0 = 0
            goto L9c
        L43:
            r2 = 2130771982(0x7f01000e, float:1.714707E38)
            goto L96
        L47:
            j6.b r0 = r0.f21160r
            int r0 = r0.ordinal()
            if (r0 == 0) goto L67
            if (r0 == r5) goto L63
            if (r0 == r4) goto L5f
            if (r0 != r3) goto L59
            r2 = 2130771994(0x7f01001a, float:1.7147094E38)
            goto L96
        L59:
            G1.a r0 = new G1.a
            r0.<init>()
            throw r0
        L5f:
            r2 = 2130771995(0x7f01001b, float:1.7147096E38)
            goto L96
        L63:
            r2 = 2130771993(0x7f010019, float:1.7147092E38)
            goto L96
        L67:
            r2 = 2130771996(0x7f01001c, float:1.7147098E38)
            goto L96
        L6b:
            boolean r2 = r0.l
            if (r2 == 0) goto L93
            j6.b r0 = r0.f21160r
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8f
            if (r0 == r5) goto L8b
            if (r0 == r4) goto L87
            if (r0 != r3) goto L81
            r2 = 2130771987(0x7f010013, float:1.714708E38)
            goto L96
        L81:
            G1.a r0 = new G1.a
            r0.<init>()
            throw r0
        L87:
            r2 = 2130771988(0x7f010014, float:1.7147082E38)
            goto L96
        L8b:
            r2 = 2130771985(0x7f010011, float:1.7147076E38)
            goto L96
        L8f:
            r2 = 2130771989(0x7f010015, float:1.7147084E38)
            goto L96
        L93:
            r2 = 2130771986(0x7f010012, float:1.7147078E38)
        L96:
            android.content.Context r0 = r1.b
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
        L9c:
            if (r0 == 0) goto La7
            z4.c r1 = r1.f21172d
            java.lang.Object r1 = r1.b
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.startAnimation(r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.h.run():void");
    }
}
