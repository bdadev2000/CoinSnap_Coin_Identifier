package androidx.recyclerview.widget;

import android.view.View;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class x {
    public OrientationHelper a;

    /* renamed from: b, reason: collision with root package name */
    public int f2072b;

    /* renamed from: c, reason: collision with root package name */
    public int f2073c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2075e;

    public x() {
        d();
    }

    public final void a() {
        int startAfterPadding;
        if (this.f2074d) {
            startAfterPadding = this.a.getEndAfterPadding();
        } else {
            startAfterPadding = this.a.getStartAfterPadding();
        }
        this.f2073c = startAfterPadding;
    }

    public final void b(int i10, View view) {
        if (this.f2074d) {
            this.f2073c = this.a.getTotalSpaceChange() + this.a.getDecoratedEnd(view);
        } else {
            this.f2073c = this.a.getDecoratedStart(view);
        }
        this.f2072b = i10;
    }

    public final void c(int i10, View view) {
        int totalSpaceChange = this.a.getTotalSpaceChange();
        if (totalSpaceChange >= 0) {
            b(i10, view);
            return;
        }
        this.f2072b = i10;
        if (this.f2074d) {
            int endAfterPadding = (this.a.getEndAfterPadding() - totalSpaceChange) - this.a.getDecoratedEnd(view);
            this.f2073c = this.a.getEndAfterPadding() - endAfterPadding;
            if (endAfterPadding > 0) {
                int decoratedMeasurement = this.f2073c - this.a.getDecoratedMeasurement(view);
                int startAfterPadding = this.a.getStartAfterPadding();
                int min = decoratedMeasurement - (Math.min(this.a.getDecoratedStart(view) - startAfterPadding, 0) + startAfterPadding);
                if (min < 0) {
                    this.f2073c = Math.min(endAfterPadding, -min) + this.f2073c;
                    return;
                }
                return;
            }
            return;
        }
        int decoratedStart = this.a.getDecoratedStart(view);
        int startAfterPadding2 = decoratedStart - this.a.getStartAfterPadding();
        this.f2073c = decoratedStart;
        if (startAfterPadding2 > 0) {
            int endAfterPadding2 = (this.a.getEndAfterPadding() - Math.min(0, (this.a.getEndAfterPadding() - totalSpaceChange) - this.a.getDecoratedEnd(view))) - (this.a.getDecoratedMeasurement(view) + decoratedStart);
            if (endAfterPadding2 < 0) {
                this.f2073c -= Math.min(startAfterPadding2, -endAfterPadding2);
            }
        }
    }

    public final void d() {
        this.f2072b = -1;
        this.f2073c = Integer.MIN_VALUE;
        this.f2074d = false;
        this.f2075e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f2072b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f2073c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f2074d);
        sb2.append(", mValid=");
        return a4.j.l(sb2, this.f2075e, AbstractJsonLexerKt.END_OBJ);
    }
}
