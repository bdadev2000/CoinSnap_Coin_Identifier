package com.cooldev.gba.emulator.gameboy.effects;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class SetSystemBarsColorKt {
    @Composable
    /* renamed from: SetSystemBarsColor-ek8zF_U, reason: not valid java name */
    public static final void m41SetSystemBarsColorek8zF_U(long j2, @Nullable Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1806133529);
        if ((i2 & 14) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            SystemUiController rememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, g2, 0, 1);
            Boolean bool = Boolean.TRUE;
            g2.J(-1322428976);
            boolean I = g2.I(rememberSystemUiController) | ((i3 & 14) == 4);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new SetSystemBarsColorKt$SetSystemBarsColor$1$1(rememberSystemUiController, j2, null);
                g2.o(u2);
            }
            g2.V(false);
            EffectsKt.f(bool, (p) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SetSystemBarsColorKt$SetSystemBarsColor$2(j2, i2);
        }
    }
}
