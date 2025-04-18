package com.cooldev.gba.emulator.gameboy.features.theme.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.d;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog.GoodLuckDialogKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.survey_dialog.SurveyDialogKt;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ThemePageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void ThemePage(@Nullable Composer composer, int i2) {
        NavDestination navDestination;
        ComposerImpl g2 = composer.g(-1297184527);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(Color.f14961h, g2, 6);
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = d.h(EffectsKt.g(g2), g2);
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
            g2.J(-203938181);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u3);
            }
            MutableState mutableState = (MutableState) u3;
            g2.V(false);
            g2.J(-203936005);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u4);
            }
            MutableState mutableState2 = (MutableState) u4;
            g2.V(false);
            NavBackStackEntry ThemePage$lambda$6 = ThemePage$lambda$6(SnapshotStateKt.a(MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().getGetNavController().E, null, null, g2, 48, 2));
            boolean g3 = a.g((ThemePage$lambda$6 == null || (navDestination = ThemePage$lambda$6.f20328b) == null) ? null : navDestination.f20437i, RouterName.THEME);
            EffectsKt.c(b0.f30125a, new ThemePageKt$ThemePage$1(d0Var, appPrefUtils, context, mutableState, mutableState2), g2);
            BackHandlerKt.a(false, ThemePageKt$ThemePage$2.INSTANCE, g2, 48, 1);
            Boolean valueOf = Boolean.valueOf(ThemePage$lambda$4(mutableState2));
            g2.J(-203914415);
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = new ThemePageKt$ThemePage$3$1(mutableState2, null);
                g2.o(u5);
            }
            g2.V(false);
            EffectsKt.f(valueOf, (p) u5, g2);
            SurveyDialogKt.SurveyDialog(ThemePage$lambda$1(mutableState) && g3, new ThemePageKt$ThemePage$4(d0Var, appPrefUtils, context, mutableState, mutableState2), new ThemePageKt$ThemePage$5(d0Var, appPrefUtils, context, mutableState, mutableState2), g2, 0);
            boolean z2 = ThemePage$lambda$4(mutableState2) && g3;
            g2.J(-203889030);
            Object u6 = g2.u();
            if (u6 == composer$Companion$Empty$1) {
                u6 = new ThemePageKt$ThemePage$6$1(mutableState2);
                g2.o(u6);
            }
            g2.V(false);
            GoodLuckDialogKt.GoodLuckDialog(z2, (q0.a) u6, g2, 48);
            ScaffoldKt.a(null, null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableSingletons$ThemePageKt.INSTANCE.m358getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ThemePageKt$ThemePage$7(i2);
        }
    }

    private static final boolean ThemePage$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ThemePage$lambda$2(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ThemePage$lambda$4(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ThemePage$lambda$5(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final NavBackStackEntry ThemePage$lambda$6(State<NavBackStackEntry> state) {
        return (NavBackStackEntry) state.getValue();
    }
}
