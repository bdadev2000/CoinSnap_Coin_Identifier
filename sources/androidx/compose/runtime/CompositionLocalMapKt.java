package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;

/* loaded from: classes3.dex */
public final class CompositionLocalMapKt {
    public static final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap, ProvidableCompositionLocal providableCompositionLocal) {
        p0.a.q(providableCompositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder<Object> valueHolder = persistentCompositionLocalMap.get(providableCompositionLocal);
        if (valueHolder == null) {
            valueHolder = providableCompositionLocal.a();
        }
        return valueHolder.a(persistentCompositionLocalMap);
    }

    public static final PersistentCompositionLocalMap b(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalHashMap.Builder builder = PersistentCompositionLocalHashMap.d.builder();
        for (ProvidedValue providedValue : providedValueArr) {
            CompositionLocal compositionLocal = providedValue.f13862a;
            p0.a.q(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.f13867h || !persistentCompositionLocalMap.containsKey(providableCompositionLocal)) {
                builder.put(providableCompositionLocal, providableCompositionLocal.b(providedValue, (ValueHolder) persistentCompositionLocalMap2.get(providableCompositionLocal)));
            }
        }
        return builder.build();
    }
}
