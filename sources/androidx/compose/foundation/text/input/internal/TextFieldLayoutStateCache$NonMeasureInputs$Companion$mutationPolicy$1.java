package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1 implements SnapshotMutationPolicy<TextFieldLayoutStateCache.NonMeasureInputs> {
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = (TextFieldLayoutStateCache.NonMeasureInputs) obj;
        TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2 = (TextFieldLayoutStateCache.NonMeasureInputs) obj2;
        if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
            if ((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null)) {
                return false;
            }
        } else if (nonMeasureInputs.f6633a != nonMeasureInputs2.f6633a || !p0.a.g(nonMeasureInputs.f6634b, nonMeasureInputs2.f6634b) || nonMeasureInputs.f6635c != nonMeasureInputs2.f6635c || nonMeasureInputs.d != nonMeasureInputs2.d) {
            return false;
        }
        return true;
    }
}
