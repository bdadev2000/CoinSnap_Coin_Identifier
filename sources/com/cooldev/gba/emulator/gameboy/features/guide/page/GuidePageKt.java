package com.cooldev.gba.emulator.gameboy.features.guide.page;

import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GuideSection;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class GuidePageKt {
    @ComposableTarget
    @Composable
    public static final void GuidePage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(772654712);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(Color.f14961h, g2, 6);
            g2.J(-1465885304);
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = SnapshotStateKt.f(GuideSection.STEPS, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            g2.V(false);
            ScaffoldKt.a(null, null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(-312714935, new GuidePageKt$GuidePage$1((MutableState) u2), g2), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GuidePageKt$GuidePage$2(i2);
        }
    }
}
