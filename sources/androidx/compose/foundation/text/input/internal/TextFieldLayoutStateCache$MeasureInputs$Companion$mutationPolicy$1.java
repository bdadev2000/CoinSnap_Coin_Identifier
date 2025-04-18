package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1 implements SnapshotMutationPolicy<TextFieldLayoutStateCache.MeasureInputs> {
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        TextFieldLayoutStateCache.MeasureInputs measureInputs = (TextFieldLayoutStateCache.MeasureInputs) obj;
        TextFieldLayoutStateCache.MeasureInputs measureInputs2 = (TextFieldLayoutStateCache.MeasureInputs) obj2;
        if (measureInputs == null || measureInputs2 == null) {
            if ((measureInputs == null) ^ (measureInputs2 == null)) {
                return false;
            }
        } else if (measureInputs.e != measureInputs2.e || measureInputs.f6632f != measureInputs2.f6632f || measureInputs.f6630b != measureInputs2.f6630b || !p0.a.g(measureInputs.f6631c, measureInputs2.f6631c) || !Constraints.c(measureInputs.d, measureInputs2.d)) {
            return false;
        }
        return true;
    }
}
