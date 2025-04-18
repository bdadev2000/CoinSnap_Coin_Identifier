package com.cooldev.gba.emulator.gameboy.effects;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class ShowStatusBarKt {
    @Composable
    public static final void ShowStatusBar(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1500772918);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            SystemUiController rememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, g2, 0, 1);
            b0 b0Var = b0.f30125a;
            g2.J(-805106626);
            boolean I = g2.I(rememberSystemUiController);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new ShowStatusBarKt$ShowStatusBar$1$1(rememberSystemUiController, null);
                g2.o(u2);
            }
            g2.V(false);
            EffectsKt.f(b0Var, (p) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ShowStatusBarKt$ShowStatusBar$2(i2);
        }
    }
}
