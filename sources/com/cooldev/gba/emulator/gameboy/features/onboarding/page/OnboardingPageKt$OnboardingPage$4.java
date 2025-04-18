package com.cooldev.gba.emulator.gameboy.features.onboarding.page;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.onboarding.widgets.BackgroundOnboardingKt;
import com.cooldev.gba.emulator.gameboy.features.onboarding.widgets.BodyOnboardingKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
public final class OnboardingPageKt$OnboardingPage$4 extends r implements q {
    final /* synthetic */ float $pBottomBannerAds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingPageKt$OnboardingPage$4(float f2) {
        super(3);
        this.$pBottomBannerAds = f2;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        a.s(paddingValues, "it");
        if ((i2 & 14) == 0) {
            i2 |= composer.I(paddingValues) ? 4 : 2;
        }
        if ((i2 & 91) == 18 && composer.i()) {
            composer.A();
            return;
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier j2 = PaddingKt.j(SizeKt.f4107c, 0.0f, 0.0f, 0.0f, this.$pBottomBannerAds, 7);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, j2);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            BackgroundOnboardingKt.BackgroundOnboarding(PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, 0.0f, 13), composer, 0);
            BodyOnboardingKt.BodyOnboarding(composer, 0);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}
