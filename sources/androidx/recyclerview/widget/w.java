package androidx.recyclerview.widget;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public int f2051b;

    /* renamed from: c, reason: collision with root package name */
    public int f2052c;

    /* renamed from: d, reason: collision with root package name */
    public int f2053d;

    /* renamed from: e, reason: collision with root package name */
    public int f2054e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2057h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2058i;
    public boolean a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f2055f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2056g = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
        sb2.append(this.f2051b);
        sb2.append(", mCurrentPosition=");
        sb2.append(this.f2052c);
        sb2.append(", mItemDirection=");
        sb2.append(this.f2053d);
        sb2.append(", mLayoutDirection=");
        sb2.append(this.f2054e);
        sb2.append(", mStartLine=");
        sb2.append(this.f2055f);
        sb2.append(", mEndLine=");
        return a4.j.i(sb2, this.f2056g, AbstractJsonLexerKt.END_OBJ);
    }
}
