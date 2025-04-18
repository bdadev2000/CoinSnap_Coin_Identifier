package t3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.x;

/* loaded from: classes.dex */
public final class g implements b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25218b;

    public g(String str, int i10, boolean z10) {
        this.a = i10;
        this.f25218b = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        if (!xVar.f21603n) {
            y3.b.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new o3.m(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.A(this.a) + AbstractJsonLexerKt.END_OBJ;
    }
}
