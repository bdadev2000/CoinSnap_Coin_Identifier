package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    public final void a(int i2, int i3, int i4) {
        ((LayoutNode) this.f13671c).Q(i2, i3, i4);
    }

    @Override // androidx.compose.runtime.Applier
    public final void b(int i2, int i3) {
        ((LayoutNode) this.f13671c).W(i2, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void c(int i2, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void d() {
        Owner owner = ((LayoutNode) this.f13669a).f15950l;
        if (owner != null) {
            owner.t();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i2, Object obj) {
        ((LayoutNode) this.f13671c).G(i2, (LayoutNode) obj);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void i() {
        ((LayoutNode) this.f13669a).V();
    }
}
