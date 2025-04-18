package com.cooldev.gba.emulator.gameboy.features.themenew.page;

import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeState;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes.dex */
public final class ThemeNewPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void ThemeNewPage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(28912315);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(Color.f14961h, g2, 6);
            BackHandlerKt.a(false, ThemeNewPageKt$ThemeNewPage$1.INSTANCE, g2, 48, 1);
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(ThemeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            ScaffoldKt.a(null, null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(-324783350, new ThemeNewPageKt$ThemeNewPage$2((ThemeState) SnapshotStateKt.b(((ThemeViewModel) u2).getState(), g2, 8).getValue()), g2), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ThemeNewPageKt$ThemeNewPage$3(i2);
        }
    }
}
