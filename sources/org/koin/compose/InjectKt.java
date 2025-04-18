package org.koin.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import org.koin.compose.stable.StableHoldersKt;
import org.koin.compose.stable.StableParametersDefinition;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes2.dex */
public final class InjectKt {
    @Composable
    public static final <T> T koinInject(Qualifier qualifier, Scope scope, a aVar, Composer composer, int i2, int i3) {
        composer.t(414512006);
        if ((i3 & 1) != 0) {
            qualifier = null;
        }
        if ((i3 & 2) != 0) {
            scope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        if ((i3 & 4) != 0) {
            aVar = null;
        }
        composer.t(1274527078);
        StableParametersDefinition rememberStableParametersDefinition = aVar == null ? null : StableHoldersKt.rememberStableParametersDefinition(aVar, composer, (i2 >> 6) & 14);
        composer.H();
        composer.t(511388516);
        boolean I = composer.I(qualifier) | composer.I(scope);
        T t2 = (T) composer.u();
        if (!I && t2 != Composer.Companion.f13690a) {
            composer.H();
            composer.H();
            return t2;
        }
        if (rememberStableParametersDefinition != null) {
            rememberStableParametersDefinition.getParametersDefinition();
        }
        p0.a.A0();
        throw null;
    }

    @Composable
    @d0.a
    public static final <T> T rememberKoinInject(Qualifier qualifier, Scope scope, a aVar, Composer composer, int i2, int i3) {
        composer.t(-505490445);
        if ((i3 & 1) != 0) {
            qualifier = null;
        }
        if ((i3 & 2) != 0) {
            scope = KoinApplicationKt.rememberCurrentKoinScope(composer, 0);
        }
        if ((i3 & 4) != 0) {
            aVar = null;
        }
        composer.t(-207995524);
        StableParametersDefinition rememberStableParametersDefinition = aVar == null ? null : StableHoldersKt.rememberStableParametersDefinition(aVar, composer, (i2 >> 6) & 14);
        composer.H();
        composer.t(511388516);
        boolean I = composer.I(qualifier) | composer.I(scope);
        T t2 = (T) composer.u();
        if (!I && t2 != Composer.Companion.f13690a) {
            composer.H();
            composer.H();
            return t2;
        }
        if (rememberStableParametersDefinition != null) {
            rememberStableParametersDefinition.getParametersDefinition();
        }
        p0.a.A0();
        throw null;
    }
}
