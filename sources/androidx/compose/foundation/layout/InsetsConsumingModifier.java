package androidx.compose.foundation.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

@Stable
/* loaded from: classes.dex */
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4010a;

    public InsetsConsumingModifier() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(new FixedIntInsets(), StructuralEqualityPolicy.f14078a);
        this.f4010a = f2;
    }

    public abstract WindowInsets a(WindowInsets windowInsets);

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void g1(ModifierLocalReadScope modifierLocalReadScope) {
        this.f4010a.setValue(a((WindowInsets) modifierLocalReadScope.s(WindowInsetsPaddingKt.f4216a)));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.f4216a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets) this.f4010a.getValue();
    }
}
