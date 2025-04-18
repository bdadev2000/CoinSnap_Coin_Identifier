package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

/* loaded from: classes3.dex */
public final class ReceiveContentConfigurationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableModifierLocal f2899a = new ModifierLocal(ReceiveContentConfigurationKt$ModifierLocalReceiveContent$1.f2900a);

    public static final ReceiveContentConfiguration a(ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.z0().f14699n) {
            return (ReceiveContentConfiguration) modifierLocalModifierNode.s(f2899a);
        }
        return null;
    }
}
