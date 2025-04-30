package k3;

import java.util.Set;

/* loaded from: classes.dex */
public final class q implements h3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21444a;
    public final j b;

    /* renamed from: c, reason: collision with root package name */
    public final s f21445c;

    public q(Set set, j jVar, s sVar) {
        this.f21444a = set;
        this.b = jVar;
        this.f21445c = sVar;
    }

    public final r a(String str, h3.c cVar, h3.e eVar) {
        Set set = this.f21444a;
        if (set.contains(cVar)) {
            return new r(this.b, str, cVar, eVar, this.f21445c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
