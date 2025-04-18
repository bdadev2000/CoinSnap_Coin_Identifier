package androidx.recyclerview.widget;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class i {
    public o1 a;

    /* renamed from: b, reason: collision with root package name */
    public o1 f1929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1930c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1933f;

    public i(o1 o1Var, o1 o1Var2, int i10, int i11, int i12, int i13) {
        this.a = o1Var;
        this.f1929b = o1Var2;
        this.f1930c = i10;
        this.f1931d = i11;
        this.f1932e = i12;
        this.f1933f = i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
        sb2.append(this.a);
        sb2.append(", newHolder=");
        sb2.append(this.f1929b);
        sb2.append(", fromX=");
        sb2.append(this.f1930c);
        sb2.append(", fromY=");
        sb2.append(this.f1931d);
        sb2.append(", toX=");
        sb2.append(this.f1932e);
        sb2.append(", toY=");
        return a4.j.i(sb2, this.f1933f, AbstractJsonLexerKt.END_OBJ);
    }
}
