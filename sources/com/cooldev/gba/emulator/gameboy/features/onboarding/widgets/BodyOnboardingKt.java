package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Bottom$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingState;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes4.dex */
public final class BodyOnboardingKt {
    @ComposableTarget
    @Composable
    public static final void BodyOnboarding(@Nullable Composer composer, int i2) {
        Modifier c2;
        ComposerImpl g2 = composer.g(1035001985);
        if (i2 == 0 && g2.i()) {
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
            OnboardingState onboardingState = (OnboardingState) SnapshotStateKt.b(((OnboardingViewModel) u2).getState(), g2, 8).getValue();
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
            Arrangement$Bottom$1 arrangement$Bottom$1 = Arrangement.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 20;
            Modifier i3 = PaddingKt.i(SizeKt.f4107c, f2, 0, f2, 32);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Bottom$1, horizontal, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, i3);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c3, ComposeUiNode.Companion.d);
            c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
            SpacerKt.a(c2, g2);
            TextKt.b(onboardingState.getOnboardingTab().getTitle(), null, MyColors.INSTANCE.m34getText40d7_KjU(), TextUnitKt.b(40), null, FontWeight.f17264b, MyFonts.INSTANCE.getDeterminationSans(), 0L, null, new TextAlign(5), TextUnitKt.b(48), 0, false, 0, 0, null, null, g2, 1772928, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, 48), g2);
            BottomOnboardingWidgetKt.BottomOnboardingWidget(g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BodyOnboardingKt$BodyOnboarding$2(i2);
        }
    }
}
