package k9;

import com.google.common.collect.g0;
import s7.r0;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20422b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20423c;

    public f(r0 r0Var, int i10) {
        this.f20422b = (r0Var.f24715f & 1) != 0;
        this.f20423c = o.c(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return g0.a.c(this.f20423c, fVar.f20423c).c(this.f20422b, fVar.f20422b).e();
    }
}
