package androidx.work;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class z {
    public UUID a;

    /* renamed from: b, reason: collision with root package name */
    public u2.j f2243b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2244c;

    public z(Class cls) {
        HashSet hashSet = new HashSet();
        this.f2244c = hashSet;
        this.a = UUID.randomUUID();
        this.f2243b = new u2.j(this.a.toString(), cls.getName());
        hashSet.add(cls.getName());
    }

    public final s a() {
        boolean z10;
        s sVar = new s((r) this);
        d dVar = this.f2243b.f25460j;
        boolean z11 = true;
        if (dVar.f2194h.a.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !dVar.f2190d && !dVar.f2188b && !dVar.f2189c) {
            z11 = false;
        }
        if (this.f2243b.f25467q && z11) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.a = UUID.randomUUID();
        u2.j jVar = new u2.j(this.f2243b);
        this.f2243b = jVar;
        jVar.a = this.a.toString();
        return sVar;
    }
}
