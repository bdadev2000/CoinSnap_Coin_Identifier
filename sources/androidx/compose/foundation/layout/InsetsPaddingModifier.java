package androidx.compose.foundation.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

@StabilityInferred
/* loaded from: classes4.dex */
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f4014a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4015b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4016c;

    public InsetsPaddingModifier(WindowInsets windowInsets) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f4014a = windowInsets;
        f2 = SnapshotStateKt.f(windowInsets, StructuralEqualityPolicy.f14078a);
        this.f4015b = f2;
        f3 = SnapshotStateKt.f(windowInsets, StructuralEqualityPolicy.f14078a);
        this.f4016c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return p0.a.g(((InsetsPaddingModifier) obj).f4014a, this.f4014a);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void g1(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.s(WindowInsetsPaddingKt.f4216a);
        WindowInsets windowInsets2 = this.f4014a;
        this.f4015b.setValue(new ExcludeInsets(windowInsets2, windowInsets));
        this.f4016c.setValue(new UnionInsets(windowInsets, windowInsets2));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.f4216a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets) this.f4016c.getValue();
    }

    public final int hashCode() {
        return this.f4014a.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f4015b;
        int d = ((WindowInsets) parcelableSnapshotMutableState.getValue()).d(measureScope, measureScope.getLayoutDirection());
        int a2 = ((WindowInsets) parcelableSnapshotMutableState.getValue()).a(measureScope);
        int b2 = ((WindowInsets) parcelableSnapshotMutableState.getValue()).b(measureScope, measureScope.getLayoutDirection()) + d;
        int c2 = ((WindowInsets) parcelableSnapshotMutableState.getValue()).c(measureScope) + a2;
        Placeable V = measurable.V(ConstraintsKt.k(-b2, -c2, j2));
        return measureScope.T(ConstraintsKt.h(V.f15825a + b2, j2), ConstraintsKt.g(V.f15826b + c2, j2), x.f30219a, new InsetsPaddingModifier$measure$1(d, a2, V));
    }
}
