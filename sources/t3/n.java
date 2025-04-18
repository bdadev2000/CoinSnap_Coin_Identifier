package t3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.x;
import o3.s;

/* loaded from: classes.dex */
public final class n implements b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25243b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f25244c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25245d;

    public n(String str, int i10, h4.c cVar, boolean z10) {
        this.a = str;
        this.f25243b = i10;
        this.f25244c = cVar;
        this.f25245d = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new s(xVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.a);
        sb2.append(", index=");
        return a4.j.i(sb2, this.f25243b, AbstractJsonLexerKt.END_OBJ);
    }
}
