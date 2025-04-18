package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets;

import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class TermsAndPrivacyPaywallYearlyNonTrialKt {
    @ComposableTarget
    @Composable
    public static final void TermsAndPrivacyPaywallYearlyNonTrial(@NotNull PurchasePageViewModel purchasePageViewModel, @Nullable Composer composer, int i2) {
        a.s(purchasePageViewModel, "purchasePageViewModel");
        ComposerImpl g2 = composer.g(486035779);
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), 16, 0.0f, 2);
        RowMeasurePolicy a2 = RowKt.a(Arrangement.f3776g, Alignment.Companion.f14667k, g2, 54);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c2 = ComposedModifierKt.c(g2, h2);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
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
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar);
        }
        Updater.b(g2, c2, ComposeUiNode.Companion.d);
        long b2 = TextUnitKt.b(12);
        long b3 = TextUnitKt.b(16);
        MyFonts myFonts = MyFonts.INSTANCE;
        FontFamily inter = myFonts.getInter();
        FontWeight fontWeight = new FontWeight(700);
        MyColors myColors = MyColors.INSTANCE;
        TextKt.b("Terms and Condition", DebounceExtensionsKt.debouncedClickable$default(companion, false, 0L, new TermsAndPrivacyPaywallYearlyNonTrialKt$TermsAndPrivacyPaywallYearlyNonTrial$1$1(purchasePageViewModel, context), 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m34getText40d7_KjU(), b2, fontWeight, inter, 0L, null, 5, b3, 16613336), g2, 6, 0, 65532);
        long b4 = TextUnitKt.b(12);
        long b5 = TextUnitKt.b(16);
        TextKt.b("Cancel Anytime", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m34getText40d7_KjU(), b4, new FontWeight(700), myFonts.getInter(), 0L, null, 5, b5, 16613336), g2, 6, 0, 65534);
        long b6 = TextUnitKt.b(12);
        long b7 = TextUnitKt.b(16);
        TextKt.b("Privacy policy", DebounceExtensionsKt.debouncedClickable$default(companion, false, 0L, new TermsAndPrivacyPaywallYearlyNonTrialKt$TermsAndPrivacyPaywallYearlyNonTrial$1$2(purchasePageViewModel, context), 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m34getText40d7_KjU(), b6, new FontWeight(700), myFonts.getInter(), 0L, null, 6, b7, 16613336), g2, 6, 0, 65532);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TermsAndPrivacyPaywallYearlyNonTrialKt$TermsAndPrivacyPaywallYearlyNonTrial$2(purchasePageViewModel, i2);
        }
    }
}
