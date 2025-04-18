package androidx.recyclerview.widget;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
class LayoutState {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21022a;

    /* renamed from: b, reason: collision with root package name */
    public int f21023b;

    /* renamed from: c, reason: collision with root package name */
    public int f21024c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f21025f;

    /* renamed from: g, reason: collision with root package name */
    public int f21026g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21027h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21028i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f21023b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f21024c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f21025f);
        sb.append(", mEndLine=");
        return d.o(sb, this.f21026g, '}');
    }
}
