package org.koin.compose.module;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import q0.a;

/* loaded from: classes3.dex */
public final class RememberModulesKt {
    @KoinExperimentalAPI
    @Composable
    public static final void rememberKoinModules(@Nullable Boolean bool, @Nullable Boolean bool2, boolean z2, @Nullable a aVar, @Nullable Composer composer, int i2, int i3) {
        composer.t(-1703546888);
        if ((i3 & 1) != 0) {
            bool = null;
        }
        if ((i3 & 2) != 0) {
            bool2 = null;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            aVar = RememberModulesKt$rememberKoinModules$1.INSTANCE;
        }
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        composer.t(-492369756);
        if (composer.u() == Composer.Companion.f13690a) {
            List list = (List) aVar.invoke();
            boolean booleanValue = bool != null ? bool.booleanValue() : z2;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            composer.o(new CompositionKoinModuleLoader(list, koin, booleanValue, z2));
        }
        composer.H();
        composer.H();
    }
}
