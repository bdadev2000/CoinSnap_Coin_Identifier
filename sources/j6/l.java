package j6;

import android.view.View;

/* loaded from: classes3.dex */
public final class l implements View.OnTouchListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21170c;

    public /* synthetic */ l(Object obj, int i9) {
        this.b = i9;
        this.f21170c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if ((((android.widget.FrameLayout) r2.f21172d.f24550g).getMeasuredWidth() + r8.k.n(r5).x) < r6.getRawX()) goto L35;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            int r0 = r4.b
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            int r5 = r6.getAction()
            float r0 = r6.getX()
            int r0 = (int) r0
            float r6 = r6.getY()
            int r6 = (int) r6
            java.lang.Object r1 = r4.f21170c
            q.C0 r1 = (q.C0) r1
            if (r5 != 0) goto L41
            q.z r2 = r1.f22515B
            if (r2 == 0) goto L41
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L41
            if (r0 < 0) goto L41
            q.z r2 = r1.f22515B
            int r2 = r2.getWidth()
            if (r0 >= r2) goto L41
            if (r6 < 0) goto L41
            q.z r0 = r1.f22515B
            int r0 = r0.getHeight()
            if (r6 >= r0) goto L41
            android.os.Handler r5 = r1.f22534x
            q.z0 r6 = r1.f22530t
            r0 = 250(0xfa, double:1.235E-321)
            r5.postDelayed(r6, r0)
            goto L4b
        L41:
            r6 = 1
            if (r5 != r6) goto L4b
            android.os.Handler r5 = r1.f22534x
            q.z0 r6 = r1.f22530t
            r5.removeCallbacks(r6)
        L4b:
            r5 = 0
            return r5
        L4d:
            java.lang.String r0 = "view"
            G7.j.e(r5, r0)
            java.lang.String r5 = "event"
            G7.j.e(r6, r5)
            int r5 = r6.getAction()
            r0 = 4
            r1 = 1
            java.lang.Object r2 = r4.f21170c
            j6.m r2 = (j6.m) r2
            if (r5 != r0) goto L6d
            j6.j r5 = r2.f21171c
            boolean r5 = r5.f21128I
            if (r5 == 0) goto Lc1
            r2.f()
            goto Lc1
        L6d:
            j6.j r5 = r2.f21171c
            boolean r5 = r5.f21129J
            if (r5 == 0) goto Lc0
            int r5 = r6.getAction()
            if (r5 != r1) goto Lc0
            z4.c r5 = r2.f21172d
            java.lang.Object r5 = r5.f24550g
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.String r0 = "balloonWrapper"
            G7.j.d(r5, r0)
            android.graphics.Point r5 = r8.k.n(r5)
            int r5 = r5.x
            float r5 = (float) r5
            float r3 = r6.getRawX()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto Lb6
            z4.c r5 = r2.f21172d
            java.lang.Object r5 = r5.f24550g
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            G7.j.d(r5, r0)
            android.graphics.Point r5 = r8.k.n(r5)
            int r5 = r5.x
            z4.c r0 = r2.f21172d
            java.lang.Object r0 = r0.f24550g
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 + r5
            float r5 = (float) r0
            float r6 = r6.getRawX()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto Lc0
        Lb6:
            j6.j r5 = r2.f21171c
            boolean r5 = r5.f21128I
            if (r5 == 0) goto Lc1
            r2.f()
            goto Lc1
        Lc0:
            r1 = 0
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
