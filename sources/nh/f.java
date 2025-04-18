package nh;

import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import java.util.Set;

/* loaded from: classes4.dex */
public final class f implements a1 {
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f22773b;

    /* renamed from: c, reason: collision with root package name */
    public final d f22774c;

    public f(Set set, a1 a1Var, mh.a aVar) {
        this.a = set;
        this.f22773b = a1Var;
        this.f22774c = new d(aVar);
    }

    @Override // androidx.lifecycle.a1
    public final x0 a(Class cls) {
        if (!this.a.contains(cls.getName())) {
            return this.f22773b.a(cls);
        }
        this.f22774c.a(cls);
        throw null;
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class cls, k1.e eVar) {
        if (this.a.contains(cls.getName())) {
            return this.f22774c.b(cls, eVar);
        }
        return this.f22773b.b(cls, eVar);
    }
}
