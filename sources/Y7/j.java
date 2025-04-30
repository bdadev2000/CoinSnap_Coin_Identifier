package Y7;

import V7.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w7.k;

/* loaded from: classes3.dex */
public final class j extends u {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3842g;

    public j(long j7, j jVar, int i9) {
        super(j7, jVar, i9);
        this.f3842g = new AtomicReferenceArray(i.f3841f);
    }

    @Override // V7.u
    public final int f() {
        return i.f3841f;
    }

    @Override // V7.u
    public final void g(int i9, k kVar) {
        this.f3842g.set(i9, i.f3840e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3540d + ", hashCode=" + hashCode() + ']';
    }
}
