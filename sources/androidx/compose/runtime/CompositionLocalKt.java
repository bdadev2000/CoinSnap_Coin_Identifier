package androidx.compose.runtime;

import q0.p;

/* loaded from: classes4.dex */
public final class CompositionLocalKt {
    public static final void a(ProvidedValue providedValue, p pVar, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1350970552);
        g2.x0(providedValue);
        pVar.invoke(g2, Integer.valueOf((i2 >> 3) & 14));
        g2.X();
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CompositionLocalKt$CompositionLocalProvider$2(providedValue, pVar, i2);
        }
    }

    public static final void b(ProvidedValue[] providedValueArr, p pVar, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1390796515);
        g2.y0(providedValueArr);
        pVar.invoke(g2, Integer.valueOf((i2 >> 3) & 14));
        g2.Y();
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CompositionLocalKt$CompositionLocalProvider$1(providedValueArr, pVar, i2);
        }
    }

    public static DynamicProvidableCompositionLocal c(q0.a aVar) {
        return new DynamicProvidableCompositionLocal(StructuralEqualityPolicy.f14078a, aVar);
    }
}
