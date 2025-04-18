package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import q0.l;

@Stable
/* loaded from: classes.dex */
final class ConsumedInsetsModifier implements ModifierLocalConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final l f3838a;

    /* renamed from: b, reason: collision with root package name */
    public WindowInsets f3839b;

    public ConsumedInsetsModifier(l lVar) {
        this.f3838a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifier) && ((ConsumedInsetsModifier) obj).f3838a == this.f3838a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void g1(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.s(WindowInsetsPaddingKt.f4216a);
        if (p0.a.g(windowInsets, this.f3839b)) {
            return;
        }
        this.f3839b = windowInsets;
        this.f3838a.invoke(windowInsets);
    }

    public final int hashCode() {
        return this.f3838a.hashCode();
    }
}
