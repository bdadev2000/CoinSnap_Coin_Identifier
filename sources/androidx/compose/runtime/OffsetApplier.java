package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Applier f13840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13841b;

    /* renamed from: c, reason: collision with root package name */
    public int f13842c;

    public OffsetApplier(Applier applier, int i2) {
        this.f13840a = applier;
        this.f13841b = i2;
    }

    @Override // androidx.compose.runtime.Applier
    public final void a(int i2, int i3, int i4) {
        int i5 = this.f13842c == 0 ? this.f13841b : 0;
        this.f13840a.a(i2 + i5, i3 + i5, i4);
    }

    @Override // androidx.compose.runtime.Applier
    public final void b(int i2, int i3) {
        this.f13840a.b(i2 + (this.f13842c == 0 ? this.f13841b : 0), i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final void c(int i2, Object obj) {
        this.f13840a.c(i2 + (this.f13842c == 0 ? this.f13841b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        ComposerKt.c("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // androidx.compose.runtime.Applier
    public final Object e() {
        return this.f13840a.e();
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i2, Object obj) {
        this.f13840a.f(i2 + (this.f13842c == 0 ? this.f13841b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void g(Object obj) {
        this.f13842c++;
        this.f13840a.g(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void h() {
        int i2 = this.f13842c;
        if (!(i2 > 0)) {
            ComposerKt.c("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f13842c = i2 - 1;
        this.f13840a.h();
    }
}
