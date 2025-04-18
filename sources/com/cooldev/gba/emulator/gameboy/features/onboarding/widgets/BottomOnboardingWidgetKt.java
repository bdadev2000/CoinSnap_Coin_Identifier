package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class BottomOnboardingWidgetKt {
    @ComposableTarget
    @Composable
    public static final void BottomOnboardingWidget(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-691183967);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(OnboardingViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            OnboardingViewModel onboardingViewModel = (OnboardingViewModel) u2;
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(AppViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            AppState appState = (AppState) SnapshotStateKt.b(((AppViewModel) u3).getState(), g2, 8).getValue();
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(IAPViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u4, g2, 8);
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.f3776g;
            Modifier d = SizeKt.d(Modifier.Companion.f14687a, 1.0f);
            RowMeasurePolicy a2 = RowKt.a(arrangement$SpaceBetween$1, vertical, g2, 54);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, d);
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
            StepOnboardingWidgetKt.StepOnboardingWidget(g2, 0);
            ButtonNext(new BottomOnboardingWidgetKt$BottomOnboardingWidget$1$1(onboardingViewModel, appState, iAPState), g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomOnboardingWidgetKt$BottomOnboardingWidget$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonNext(a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1789894190);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            BottomOnboardingWidgetKt$ButtonNext$$inlined$debounced$1 bottomOnboardingWidgetKt$ButtonNext$$inlined$debounced$1 = new BottomOnboardingWidgetKt$ButtonNext$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            float f2 = 0;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
            float f3 = 56;
            Modifier e2 = SizeKt.e(SizeKt.r(Modifier.Companion.f14687a, f3), f3);
            RoundedCornerShape a2 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f8037a;
            ButtonColors a3 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(1675492614);
            boolean I = g2.I(bottomOnboardingWidgetKt$ButtonNext$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new BottomOnboardingWidgetKt$ButtonNext$1$1(bottomOnboardingWidgetKt$ButtonNext$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a2, a3, null, null, paddingValuesImpl, null, ComposableSingletons$BottomOnboardingWidgetKt.INSTANCE.m267getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomOnboardingWidgetKt$ButtonNext$2(aVar, i2);
        }
    }
}
