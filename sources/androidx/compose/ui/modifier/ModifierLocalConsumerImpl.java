package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorValueInfo;

@Stable
/* loaded from: classes.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    public final boolean equals(Object obj) {
        if (!(obj instanceof ModifierLocalConsumerImpl)) {
            return false;
        }
        ((ModifierLocalConsumerImpl) obj).getClass();
        return true;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void g1(ModifierLocalReadScope modifierLocalReadScope) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
