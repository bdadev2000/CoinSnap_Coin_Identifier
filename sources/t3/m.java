package t3;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.x;

/* loaded from: classes.dex */
public final class m implements b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25241b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25242c;

    public m(String str, List list, boolean z10) {
        this.a = str;
        this.f25241b = list;
        this.f25242c = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new o3.e(xVar, bVar, this, jVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.f25241b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
