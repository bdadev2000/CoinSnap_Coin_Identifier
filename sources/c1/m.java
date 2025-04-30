package C1;

import java.util.Arrays;
import java.util.List;
import v1.v;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f470a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f471c;

    public m(String str, List list, boolean z8) {
        this.f470a = str;
        this.b = list;
        this.f471c = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new x1.d(vVar, bVar, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f470a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
