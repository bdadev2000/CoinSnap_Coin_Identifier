package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;

/* loaded from: classes3.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope {

    /* loaded from: classes3.dex */
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
    }

    @Override // androidx.compose.runtime.CompositionLocalAccessorScope
    default Object a(StaticProvidableCompositionLocal staticProvidableCompositionLocal) {
        return CompositionLocalMapKt.a(this, staticProvidableCompositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    PersistentCompositionLocalHashMap.Builder builder();

    PersistentCompositionLocalHashMap h(CompositionLocal compositionLocal, ValueHolder valueHolder);
}
