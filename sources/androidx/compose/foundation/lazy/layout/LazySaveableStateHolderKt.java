package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import q0.a;
import q0.q;

/* loaded from: classes4.dex */
public final class LazySaveableStateHolderKt {
    public static final void a(q qVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(674185128);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(qVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            ProvidableCompositionLocal providableCompositionLocal = SaveableStateRegistryKt.f14529a;
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) g2.K(providableCompositionLocal);
            Object[] objArr = {saveableStateRegistry};
            LazySaveableStateHolder$Companion$saver$1 lazySaveableStateHolder$Companion$saver$1 = LazySaveableStateHolder$Companion$saver$1.f4867a;
            LazySaveableStateHolder$Companion$saver$2 lazySaveableStateHolder$Companion$saver$2 = new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry);
            SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
            SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(lazySaveableStateHolder$Companion$saver$2, lazySaveableStateHolder$Companion$saver$1);
            boolean w = g2.w(saveableStateRegistry);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1(saveableStateRegistry);
                g2.o(u2);
            }
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.c(objArr, saverKt$Saver$12, null, (a) u2, g2, 0, 4);
            CompositionLocalKt.a(providableCompositionLocal.c(lazySaveableStateHolder), ComposableLambdaKt.c(1863926504, new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(lazySaveableStateHolder, qVar), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2(qVar, i2);
        }
    }
}
