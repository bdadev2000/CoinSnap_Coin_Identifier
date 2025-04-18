package i7;

import java.util.Set;

/* loaded from: classes3.dex */
public final class o implements f7.f {
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19187b;

    /* renamed from: c, reason: collision with root package name */
    public final q f19188c;

    public o(Set set, i iVar, q qVar) {
        this.a = set;
        this.f19187b = iVar;
        this.f19188c = qVar;
    }

    public final p a(String str, f7.c cVar, f7.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new p(this.f19187b, str, cVar, eVar, this.f19188c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
