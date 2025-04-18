package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;

@Stable
/* loaded from: classes3.dex */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        derivedHeightModifier.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        derivedHeightModifier.getClass();
        return true;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void g1(ModifierLocalReadScope modifierLocalReadScope) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        throw null;
    }
}
