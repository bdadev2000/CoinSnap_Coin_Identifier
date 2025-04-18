package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
public final class FocusableKt {
    static {
        new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final Modifier.Node a() {
                return new Modifier.Node();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
            }

            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }
        };
    }

    public static final Modifier a(MutableInteractionSource mutableInteractionSource, Modifier modifier, boolean z2) {
        return modifier.T0(z2 ? new FocusableElement(mutableInteractionSource) : Modifier.Companion.f14687a);
    }
}
