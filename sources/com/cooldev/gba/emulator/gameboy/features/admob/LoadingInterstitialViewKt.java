package com.cooldev.gba.emulator.gameboy.features.admob;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class LoadingInterstitialViewKt {
    @ComposableTarget
    @Composable
    public static final void LoadingInterstitialView(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(798671106);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.J(-29759069);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.t(414512006);
            Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
            g2.t(1274527078);
            g2.V(false);
            g2.t(511388516);
            boolean I = g2.I(null) | g2.I(currentKoinScope);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = t.g(InterstitialAdViewModel.class, currentKoinScope, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            MutableState b2 = SnapshotStateKt.b(((InterstitialAdViewModel) u3).getState(), g2, 8);
            Boolean valueOf = Boolean.valueOf(LoadingInterstitialView$lambda$3(b2).getLoadingInterstitialAd());
            g2.J(-29751060);
            boolean I2 = g2.I(b2);
            Object u4 = g2.u();
            if (I2 || u4 == composer$Companion$Empty$1) {
                u4 = new LoadingInterstitialViewKt$LoadingInterstitialView$1$1(b2, mutableState, null);
                g2.o(u4);
            }
            g2.V(false);
            EffectsKt.f(valueOf, (p) u4, g2);
            if (!LoadingInterstitialView$lambda$1(mutableState)) {
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new LoadingInterstitialViewKt$LoadingInterstitialView$2(i2);
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier a2 = BackgroundKt.a(SizeKt.f4107c, Color.f14958c, RectangleShapeKt.f15014a);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Modifier b3 = boxScopeInstance.b();
            ColumnMeasurePolicy a3 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, b3);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a3, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            TextKt.b("Loading Ads...", null, Color.f14957b, TextUnitKt.b(16), null, FontWeight.f17269i, MyFonts.INSTANCE.getInter(), 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, g2, 1772934, 0, 130450);
            SpacerKt.a(SizeKt.e(companion, 10), g2);
            ProgressIndicatorKt.c(0.0f, 0, 54, 28, MyColors.INSTANCE.m12getPrimary0d7_KjU(), 0L, g2, SizeKt.n(companion, 50));
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new LoadingInterstitialViewKt$LoadingInterstitialView$4(i2);
        }
    }

    private static final boolean LoadingInterstitialView$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingInterstitialView$lambda$2(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterstitialAdState LoadingInterstitialView$lambda$3(State<InterstitialAdState> state) {
        return (InterstitialAdState) state.getValue();
    }
}
