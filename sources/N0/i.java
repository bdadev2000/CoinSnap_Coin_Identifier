package N0;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: e, reason: collision with root package name */
    public D0.l f2029e;

    /* renamed from: f, reason: collision with root package name */
    public float f2030f;

    /* renamed from: g, reason: collision with root package name */
    public D0.l f2031g;

    /* renamed from: h, reason: collision with root package name */
    public float f2032h;

    /* renamed from: i, reason: collision with root package name */
    public float f2033i;

    /* renamed from: j, reason: collision with root package name */
    public float f2034j;

    /* renamed from: k, reason: collision with root package name */
    public float f2035k;
    public float l;
    public Paint.Cap m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f2036n;

    /* renamed from: o, reason: collision with root package name */
    public float f2037o;

    @Override // N0.k
    public final boolean a() {
        if (!this.f2031g.f() && !this.f2029e.f()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // N0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            D0.l r0 = r6.f2031g
            boolean r1 = r0.f()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f627d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.b
            if (r1 == r4) goto L1e
            r0.b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            D0.l r1 = r6.f2029e
            boolean r4 = r1.f()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f627d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.b
            if (r7 == r4) goto L3a
            r1.b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f2033i;
    }

    public int getFillColor() {
        return this.f2031g.b;
    }

    public float getStrokeAlpha() {
        return this.f2032h;
    }

    public int getStrokeColor() {
        return this.f2029e.b;
    }

    public float getStrokeWidth() {
        return this.f2030f;
    }

    public float getTrimPathEnd() {
        return this.f2035k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.f2034j;
    }

    public void setFillAlpha(float f9) {
        this.f2033i = f9;
    }

    public void setFillColor(int i9) {
        this.f2031g.b = i9;
    }

    public void setStrokeAlpha(float f9) {
        this.f2032h = f9;
    }

    public void setStrokeColor(int i9) {
        this.f2029e.b = i9;
    }

    public void setStrokeWidth(float f9) {
        this.f2030f = f9;
    }

    public void setTrimPathEnd(float f9) {
        this.f2035k = f9;
    }

    public void setTrimPathOffset(float f9) {
        this.l = f9;
    }

    public void setTrimPathStart(float f9) {
        this.f2034j = f9;
    }
}
