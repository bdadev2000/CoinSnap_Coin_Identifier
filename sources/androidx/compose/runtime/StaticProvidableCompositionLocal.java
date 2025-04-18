package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, null, false);
    }
}
