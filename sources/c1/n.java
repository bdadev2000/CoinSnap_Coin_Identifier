package C1;

import v1.v;
import x1.r;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f472a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.a f473c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f474d;

    public n(String str, int i9, B1.a aVar, boolean z8) {
        this.f472a = str;
        this.b = i9;
        this.f473c = aVar;
        this.f474d = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new r(vVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f472a);
        sb.append(", index=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.b, '}');
    }
}
