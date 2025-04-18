package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;

@StabilityInferred
/* loaded from: classes2.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public ModifierLocalProvider f15862a;

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f15862a.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ProvidableModifierLocal providableModifierLocal) {
        if (providableModifierLocal == this.f15862a.getKey()) {
            return this.f15862a.getValue();
        }
        InlineClassHelperKt.b("Check failed.");
        throw null;
    }
}
