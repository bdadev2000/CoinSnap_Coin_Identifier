package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class EmptyMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyMap f15863a = new Object();

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ProvidableModifierLocal providableModifierLocal) {
        throw new IllegalStateException("".toString());
    }
}
