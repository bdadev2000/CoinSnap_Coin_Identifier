package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.onboarding.enums.OnboardingEnum;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingState;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class StepOnboardingWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ItemStepOnboarding(OnboardingEnum onboardingEnum, Composer composer, int i2) {
        int i3;
        Modifier e;
        ComposerImpl g2 = composer.g(1611502708);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(onboardingEnum) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(OnboardingViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            boolean z2 = ((OnboardingState) SnapshotStateKt.b(((OnboardingViewModel) u2).getState(), g2, 8).getValue()).getOnboardingTab() == onboardingEnum;
            MyColors myColors = MyColors.INSTANCE;
            long m36getText60d7_KjU = z2 ? myColors.m36getText60d7_KjU() : myColors.m35getText50d7_KjU();
            Modifier.Companion companion = Modifier.Companion.f14687a;
            if (z2) {
                e = SizeKt.e(SizeKt.r(companion, 36), 16);
            } else {
                float f2 = 16;
                e = SizeKt.e(SizeKt.r(companion, f2), f2);
            }
            BoxKt.a(BackgroundKt.a(e, m36getText60d7_KjU, RoundedCornerShapeKt.b(16)), g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new StepOnboardingWidgetKt$ItemStepOnboarding$1(onboardingEnum, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void StepOnboardingWidget(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-527596799);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            Arrangement.SpacedAligned h2 = Arrangement.h(8);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            RowMeasurePolicy a2 = RowKt.a(h2, Alignment.Companion.f14666j, g2, 6);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(751182197);
            Iterator<E> it = OnboardingEnum.getEntries().iterator();
            while (it.hasNext()) {
                ItemStepOnboarding((OnboardingEnum) it.next(), g2, 0);
            }
            g2.V(false);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new StepOnboardingWidgetKt$StepOnboardingWidget$2(i2);
        }
    }
}
