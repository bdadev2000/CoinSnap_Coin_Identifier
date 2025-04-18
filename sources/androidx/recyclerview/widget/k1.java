package androidx.recyclerview.widget;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class k1 {
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1960b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1961c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1962d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f1963e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1964f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1965g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1966h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1967i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1968j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1969k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f1970l;

    /* renamed from: m, reason: collision with root package name */
    public long f1971m;

    /* renamed from: n, reason: collision with root package name */
    public int f1972n;

    public final void a(int i10) {
        if ((this.f1962d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f1962d));
    }

    public final int b() {
        if (this.f1965g) {
            return this.f1960b - this.f1961c;
        }
        return this.f1963e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f1963e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f1967i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f1960b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f1961c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f1964f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f1965g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f1968j);
        sb2.append(", mRunPredictiveAnimations=");
        return a4.j.l(sb2, this.f1969k, AbstractJsonLexerKt.END_OBJ);
    }
}
