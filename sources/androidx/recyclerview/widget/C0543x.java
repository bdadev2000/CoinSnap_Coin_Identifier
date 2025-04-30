package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543x {

    /* renamed from: a, reason: collision with root package name */
    public OrientationHelper f5112a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5113c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5114d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5115e;

    public C0543x() {
        d();
    }

    public final void a() {
        int startAfterPadding;
        if (this.f5114d) {
            startAfterPadding = this.f5112a.getEndAfterPadding();
        } else {
            startAfterPadding = this.f5112a.getStartAfterPadding();
        }
        this.f5113c = startAfterPadding;
    }

    public final void b(View view, int i9) {
        if (this.f5114d) {
            this.f5113c = this.f5112a.getTotalSpaceChange() + this.f5112a.getDecoratedEnd(view);
        } else {
            this.f5113c = this.f5112a.getDecoratedStart(view);
        }
        this.b = i9;
    }

    public final void c(View view, int i9) {
        int totalSpaceChange = this.f5112a.getTotalSpaceChange();
        if (totalSpaceChange >= 0) {
            b(view, i9);
            return;
        }
        this.b = i9;
        if (this.f5114d) {
            int endAfterPadding = (this.f5112a.getEndAfterPadding() - totalSpaceChange) - this.f5112a.getDecoratedEnd(view);
            this.f5113c = this.f5112a.getEndAfterPadding() - endAfterPadding;
            if (endAfterPadding > 0) {
                int decoratedMeasurement = this.f5113c - this.f5112a.getDecoratedMeasurement(view);
                int startAfterPadding = this.f5112a.getStartAfterPadding();
                int min = decoratedMeasurement - (Math.min(this.f5112a.getDecoratedStart(view) - startAfterPadding, 0) + startAfterPadding);
                if (min < 0) {
                    this.f5113c = Math.min(endAfterPadding, -min) + this.f5113c;
                    return;
                }
                return;
            }
            return;
        }
        int decoratedStart = this.f5112a.getDecoratedStart(view);
        int startAfterPadding2 = decoratedStart - this.f5112a.getStartAfterPadding();
        this.f5113c = decoratedStart;
        if (startAfterPadding2 > 0) {
            int endAfterPadding2 = (this.f5112a.getEndAfterPadding() - Math.min(0, (this.f5112a.getEndAfterPadding() - totalSpaceChange) - this.f5112a.getDecoratedEnd(view))) - (this.f5112a.getDecoratedMeasurement(view) + decoratedStart);
            if (endAfterPadding2 < 0) {
                this.f5113c -= Math.min(startAfterPadding2, -endAfterPadding2);
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.f5113c = Integer.MIN_VALUE;
        this.f5114d = false;
        this.f5115e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.f5113c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f5114d);
        sb.append(", mValid=");
        return Q7.n0.n(sb, this.f5115e, '}');
    }
}
