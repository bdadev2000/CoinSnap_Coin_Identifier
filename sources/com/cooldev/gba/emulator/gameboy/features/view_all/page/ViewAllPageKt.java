package com.cooldev.gba.emulator.gameboy.features.view_all.page;

import android.annotation.SuppressLint;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import com.cooldev.gba.emulator.gameboy.features.dialogs.remove_game_dialog.RemoveGameDialogKt;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.compose.stable.StableHoldersKt;
import org.koin.compose.stable.StableParametersDefinition;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes.dex */
public final class ViewAllPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter", "UnusedBoxWithConstraintsScope"})
    public static final void ViewAllPage(@Nullable String str, @Nullable Composer composer, int i2, int i3) {
        String str2;
        int i4;
        ComposerImpl g2 = composer.g(610235658);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 14) == 0) {
            str2 = str;
            i4 = (g2.I(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            String str3 = i5 != 0 ? null : str2;
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(Color.f14961h, g2, 6);
            g2.J(1248818476);
            boolean z2 = (i4 & 14) == 4;
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z2 || u2 == composer$Companion$Empty$1) {
                u2 = new ViewAllPageKt$ViewAllPage$viewAllViewModel$1$1(str3);
                g2.o(u2);
            }
            a aVar = (a) u2;
            g2.V(false);
            g2.t(414512006);
            Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
            g2.t(1274527078);
            StableParametersDefinition rememberStableParametersDefinition = aVar == null ? null : StableHoldersKt.rememberStableParametersDefinition(aVar, g2, 0);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(currentKoinScope);
            Object u3 = g2.u();
            if (y2 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(ViewAllViewModel.class, currentKoinScope, null, rememberStableParametersDefinition != null ? rememberStableParametersDefinition.getParametersDefinition() : null, g2);
            }
            g2.V(false);
            g2.V(false);
            ViewAllViewModel viewAllViewModel = (ViewAllViewModel) u3;
            ViewAllState viewAllState = (ViewAllState) SnapshotStateKt.b(viewAllViewModel.getState(), g2, 8).getValue();
            RemoveGameDialogKt.RemoveGameDialog(viewAllState.isDialogRemoveGameVisible(), new ViewAllPageKt$ViewAllPage$1(viewAllViewModel), new ViewAllPageKt$ViewAllPage$2(viewAllViewModel), g2, 0);
            ScaffoldKt.a(null, null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(383761881, new ViewAllPageKt$ViewAllPage$3(viewAllViewModel, UtilsKt.m229calculateGridHeightghNngFA(GameROMWebsite.getEntries().size(), 250, 16, 2), viewAllState), g2), g2, 806879232, 447);
            str2 = str3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ViewAllPageKt$ViewAllPage$4(str2, i2, i3);
        }
    }
}
