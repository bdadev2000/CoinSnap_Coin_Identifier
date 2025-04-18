package i1;

import g1.z;
import h0.l;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class k extends z {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f30834f;

    public k(long j2, k kVar, int i2) {
        super(j2, kVar, i2);
        this.f30834f = new AtomicReferenceArray(j.f30833f);
    }

    @Override // g1.z
    public final int f() {
        return j.f30833f;
    }

    @Override // g1.z
    public final void g(int i2, l lVar) {
        this.f30834f.set(i2, j.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f30641c + ", hashCode=" + hashCode() + ']';
    }
}
