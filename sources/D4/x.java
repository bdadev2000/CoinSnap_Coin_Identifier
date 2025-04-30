package d4;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class x extends C2181i {

    /* renamed from: d, reason: collision with root package name */
    public final Comparator f19887d;

    public x(Comparator comparator) {
        this.f19887d = comparator;
    }

    @Override // d4.C2181i
    public final u c() {
        L k6 = z.k(this.f19887d, this.b, this.f19868a);
        this.b = k6.f19849h.size();
        this.f19869c = true;
        return k6;
    }
}
