package com.cooldev.gba.emulator.gameboy.features.home.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public final class BackgroundHomeKt {
    @ComposableTarget
    @Composable
    public static final void BackgroundHome(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1293775107);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(HomeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            if (((HomeState) SnapshotStateKt.b(((HomeViewModel) u2).getState(), g2, 8).getValue()).getEmptyGames()) {
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new BackgroundHomeKt$BackgroundHome$1(i2);
                    return;
                }
                return;
            }
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getBgHome(), g2, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new BackgroundHomeKt$BackgroundHome$2(i2);
        }
    }
}
